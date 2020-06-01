package C_netWork;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null; // 클라이언트 소켓 . 
		try {
			socket = new Socket();
			System.out.println( "[연결 요청]");
			socket.connect(new InetSocketAddress("localhost", 5001)); //접속할 서버의 주소  //내가 들어갈 주소 . 음 만약에 내가 선생님꺼를 들어가려면 여기서 앞에 로컬호스트 변경 
			System.out.println( "[연결 성공]");
		} catch(Exception e) {}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e1) {}
		}	
	}
}