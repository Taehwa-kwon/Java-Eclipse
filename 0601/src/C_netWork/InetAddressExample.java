package C_netWork;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내컴퓨터 IP주소: " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com"); //1. 네이버 너가 가지고있는 ip목록 나 꺼내봐. 
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP주소: " + remote.getHostAddress()); //2. 
			}
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
}

