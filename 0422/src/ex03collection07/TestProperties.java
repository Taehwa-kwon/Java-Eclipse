package ex03collection07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;
//블루스크린은 거의다 메모리 오류, 최근에 드라이버는 하드웨어를 조작하는것인데 거의다 c언어를 통해서 메모리를 건드린다. 그러다보면 메모리에 다른 프로그램이 그걸 쓰고있는데 새로운놈이 그걸 쓰려고 하면 자기들끼리 충돌이 일어남. 그떄 블루스크린 작동.

//새로운 드라이버 프로그램 깔면 (카메라 드라이브,키보드,마우스,장치 등등) 그때 그 하드웨어 제작사는 문제없지만, 만약 내 컴퓨터가 장치들이 같은 번지의 메모리를 건드릴때 발생. 
public class TestProperties {

	public static void main(String[] args) 
		throws FileNotFoundException, IOException {	//예외 try Catch  IO 입출력은 전부다 예외 처리를 필요로 한다.
		//throws 는 현재 메소드에서 상위 메소드로 예외를 던진다.
		//즉 자신이 예외를 처리하지 않고, 자신을 호출하는 메소드에게 책임을 전가 하는 것.
		
		//throw 는 실제로 exception을 throw할때 사용하는 keyword다 (프로그래머의 판단에 따른 처리)
		
			Properties prop = new Properties();	//Map의 자식, Map와 동일한 구조 이유는 예를들어 driver = oracle.jdbc.OracleDriver || 키 = 값  
			//DB에 대한 연결정보를 파일로 저장해 놓고 사용하는 용도로 가장 많이 쓰이는데요. 이런 경우 db.proerties라는 파일명으로 자주 작명됩니다.
			
			String path 
				= TestProperties.class.getResource("database.properties").getPath(); //내 클래스에 대한 자원정보들을 가져온다. ,getPath () < 그사람의 경로를 가져와라
			System.out.println(path); // 경로를 출력해봐
			// .properties 파일은 ISO-8859-1 인코딩방식 (순수한 영어 인코딩방식)
			//	한국어를 영어로 바꾸는 방식을 인코딩 ..  
			
			
			path = URLDecoder.decode(path,"utf-8"); //파일을 읽기 위해서 지정하는 것 .
			prop.load(new FileReader(path)); //그 파일을 찾아서 prop.에서 load 해라
			
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");
			System.out.println("driver" + driver);
			System.out.println("url" + url);
			System.out.println("username "+username);
			System.out.println("password " + password);
		
//			driver = oracle.jdbc.OracleDriver		자바에서 오라클에 연결하는 것을 클래스로 만든것 . oracle.jdbc가 클래스?패키지?안에 있는 OracleDriver이라는 클래스를 사용할것이다.	
//
//			url=jdbc:oracle:thin:@localhost:1521:orcl  // 경로 자바와 오라클을 연동하는 프로그램 jdbc // jdbc:oracle:this 드라이버 이름 // localhost:ip // 1521= 포트번호 (오라클은 기본으로 이 포트번호를 사용) // orcl 오라클 정식버전 , xe 오라클 익스프레스 에디션 (공부용)
//
//			username=scott
//
//			password=tiger

	}

}
