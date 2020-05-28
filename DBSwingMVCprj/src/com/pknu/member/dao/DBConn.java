package com.pknu.member.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//싱글톤 패턴 : 예를 들어 다크모드를 설정한 경우 다른 페이지로 가더라도 이 다크모드는 유지되어야 한다.(즉 이 객체는 하나만 만들어야 한다)
// 정적공간에 하나의 객체를 만들고 그것을 계속해서 사용하기 위함 ..  
//1.먼저 생성자를 private으로 만듬 ->2.static으로 클래스 자기자신인 객체를 하나 생성한다. -> 3.
// 싱글톤의 목적은 connection한번의 연결을 통해서 한번의 연결이 유지될수 있ㄱ ㅔ하는것 . 만약 new를 여러번해서 여러번 연결이 되면 db에 좋지 않아서 . 

public class DBConn {
	// Singleton pattern 
	// getInstance 를 사용한다면 거의 Singleton pattern을 사용한다는 뜻이다. 
	// 정적공간 ( 일단 아래의 모든 메소드가 static 이니깐 필드도 당연히 static 을 해야하지 ) 
	//5.db 내용 저장 
	private static String driver = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String dbuid = "member2";
	private static String dbpwd = "1234";
	//6. 
	private static Connection conn;
	//7.생성자 생성 ( 보통 생성자는 앞에 public을 붙이는데 여기서는 private 을 한다.)
	// public 은 패키지안에 즉 Main,MemberVO에서 new 가 가능하다.
	// private은 이 클래스에서만 new 가능하다. 사용가능하다는 뜻이지.
	// 싱글톤에서 DBConn을 new 하는건 불가능 그래서 8번에서 DBConn을 new 할수있게 getInstance를 만들어준다.
	private DBConn() {};
	
	//8.
	//TestMain 클래스에서 main(){} 함수안에 DBConn db = new DBConn(); 이거를 넣어야한다. 
	// 이 뜻은 DBConn()클래스를 생성함과 동시에 new해서 생성자를 호출한다.
	// 근데 7번 DBConn이 현재 private이니깐 이건 불가능하다.
	// 그래서 main안에서 DBConn db = DBConn.getInstance(); 이렇게 만들어준다.
	
	// private DBConn(){}은 private이니깐 외부에서는 new 할수 없지만 DBConn클래스안 getInstance() 에서는 new가 가능하다.
	// 싱글톤 패턴에서는 
	
	public static Connection getInstance () {
		return getConnection();
	}
	//9.
	private static Connection getConnection() {
		//기존에 new 되어있는 conn 객체가 있으면 conn 객체를 리턴하고 종료
		if(conn!=null)
		return conn;
		// 기존 conn 객체가 new 되지 않았으면 아래의 것이 실행된다. 
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,dbuid,dbpwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*   만약에 null이 라면 conn = new Conn();을 해준다 				*/
		
		return conn;
	}
}
