package C_Chat;
 
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
 
import javax.sound.midi.Receiver;
 
public class ServerBackground { 
 
    private ServerSocket serverSocket; // 서버 소켓
    private Socket socket; // 클라이언트 정보를 받아올 소켓 정보를 저장
    private ServerGUI gui; 
    private String msg;
    /** XXX 03. 사용자들의 정보를 저장하는 맵 */ 
    private Map<String, DataOutputStream> clientMap = new HashMap<String, DataOutputStream>(); //키와 데이터로 들어오는게 Map (키값은 중복될수 없다) 
 
    //swing gui class의 정보를 사용할 수 있도록 정보를 전달
    // GUI : servergui class를 gui.jta (텍스트내용)을 gui이름으로 사용가능 
    public void setGui(ServerGUI gui) { // server GUI에 있는 jta jtf정보를 여기에 던지는것 
        this.gui = gui;
    }
 
    public static void main(String[] args) {
        ServerBackground serverBackground = new ServerBackground();
        serverBackground.setting();
    }
    //서버가 생성될때 초기값 셋팅해주는 함수 
    public void setting() {
        
        try {
        	//Map초기화하고 
            Collections.synchronizedMap(clientMap); //교통정리를 해준다.( clientMap을 네트워크 처리해주는것 ) //synchronized한번에 한 스레드만 손댈수 있다.  
            serverSocket = new ServerSocket(7777); // 서버소켓 생성자에 7777을 넘겨줌. 클라이언트가 접속할 포트번호를 의미 
 
            while (true) { //이 반복문의 역할은 서버를 열어놓은 상태로 계속 사용자를  받아주려고 
                /** XXX 01.서버가 할일 : 방문자를 계속 받아서, 쓰레드 리시버를 계속 생성 */
                
                System.out.println("대기중.....");
                socket = serverSocket.accept(); // 여기서 클라이언트 받음 //connect 를 기다림 누가 연결하면 소켓에 담음 
                System.out.println(socket.getInetAddress() + "에서 접속했습니다."); // 그 서버소켓의 ip어드레스를 가지고 있다. 들어온 아이피를 출력  
                
                //여기서 새로운 사용자 스레드 클래스를 생성해서 소켓 정보를 넣어줘야한다.
                Receiver receiver = new Receiver(socket); //thread 리시브 소켓을 만들고 거기에 서버 socker소켓을 받음 || 쓰레드를 열어주는 역할 
                receiver.start(); //<< 쓰레드니깐 실행시켜줘야함 
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //맵의내용(클라이언트) 정보를 저장과 삭제 
    public void addClient(String nick, DataOutputStream out) throws IOException{ //서버가 클라이언트에 보낸것이 out 
        String message=nick + "님이 접속하셨습니다.\n";
        sendMessage(message);
        gui.appendMsg(message);
        clientMap.put(nick, out);
        
    }
    
    public void removeClient(String nick){
        String message=nick + "님이 나가셨습니다. \n";
        sendMessage(message);
        gui.appendMsg(message);
        clientMap.remove(nick);
    }
    
    //메세지 내용 전파 
    public void sendMessage (String msg){
        Iterator<String> iterator = clientMap.keySet().iterator(); //클라이언트 맵에 있는 key셋으로 반복자 지정
        String key = "";
        
        while(iterator.hasNext()){
            key = iterator.next();// 반복자에서 하나하나 키를 빼온다.  //뒤에 셋값을 키값으로 저장한다. 
            try{
                clientMap.get(key).writeUTF(msg); //XXX 03. 사용자들의 정보를 저장하는 맵
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    // ------------------리시버--------------------------- B_thread보면쓰레드을 사용하는 2가지 방법이 있다. 
    class Receiver extends Thread {
        /** XXX 리시버가 할일 : 네트워크 소켓을 받아서 계속듣고 보내는 일. */
        private DataInputStream in; // 데이터 입력 스트림
        private DataOutputStream out; // 데이터 아웃풋 스트림
        private String nick;
 
        public Receiver(Socket socket) {
            try {
                out = new DataOutputStream(socket.getOutputStream()); //서버가 클라이언트에 보내는것
                in = new DataInputStream(socket.getInputStream()); //서버가 클라이언트에 받는것 
                nick = in.readUTF();
                addClient(nick,out);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
 
        @Override
        public void run() {
 
            try {
                while (in != null) {
                    msg = in.readUTF();// UTF로 읽어들인다.
                    sendMessage(msg);
                    gui.appendMsg(msg);
                }
            } catch (Exception e) {
                //사용접속종료시 여기서 에러발생. 
                removeClient(nick);
            }
        }
    }
 
}
 