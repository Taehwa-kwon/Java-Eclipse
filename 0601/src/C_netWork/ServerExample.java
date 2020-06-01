package C_netWork;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null; //소켓은 라이브러리 
		try {
			serverSocket = new ServerSocket();		
			serverSocket.bind(new InetSocketAddress("localhost", 5001)); //서버 컴퓨터의 ip 와 port번호  || 만약에 1521을 쓴다면 다른사람이 내 컴퓨터 오라클에 연결을 못함
			//localhost말고 자신의 ip를 입력하면 자신의 공유기에 갔다가 다시 내컴퓨터로 오는걸 반복한다. 바보같은짓이지 그래서 로컬호스트로 적는다. 
			//포트라는건 연결 선 같은것 1:1 연결만 가능 
			while(true) {
				System.out.println( "[연결 기다림]");
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress(); //상대방 어떤 주소로 들어왔어?  
				System.out.println("[연결 수락함] " + isa.getHostName()); //들어온 컴퓨터 이름을 알아내고 
			}
		} catch(Exception e) {}
		
		if(!serverSocket.isClosed()) {   //항상 close는 예외처리를 해줘야함 
			try {
				serverSocket.close();
			} catch (IOException e1) {}
		}
	}
}
