package com.pknu.member.dao;

import java.sql.Connection;

public class DBConn2 {
	// Singleton pattern 
	// getInstance 를 사용한다면 거의 Singleton pattern을 사용한다는 뜻이다. 
	// 정적공간
	//5.db 내용 저장 
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String dbuid = "member2";
	private String dbpwd = "1234";
	//6. 
	private static Connection conn;
	//7.생성자 생성 ( 보통 생성자는 앞에 public을 붙이는데 여기서는 private 을 한다.)
	// public 은 패키지안에 즉 Main,MemberVO에서 new 가 가능하다.
	// private은 이 클래스에서만 new 가능하다. 사용가능하다는 뜻이지.
	// 싱글톤에서 DBConn을 new 하는건 불가능 그래서 8번에서 DBConn을 new 할수있게 getInstance를 만들어준다.
	private DBConn2() {};
	
	//8.
	//TestMain 클래스에서 main(){} 함수안에 DBConn db = new DBConn(); 이거를 넣어야한다. 
	// 이 뜻은 DBConn()클래스를 생성함과 동시에 new해서 생성자를 호출한다.
	// 근데 7번 DBConn이 현재 private이니깐 이건 불가능하다.
	// 그래서 main안에서 DBConn db = DBConn.getInstance(); 이렇게 만들어준다.
	
	// private DBConn(){}은 private이니깐 외부에서는 new 할수 없지만 DBConn클래스안 getInstance() 에서는 new가 가능하다.
	// 싱글톤 패턴에서는 
	/* TestMain 에서 DBConn2 dbc = new DBConn2(); 이런 단순한건 없다.
	 *  
	 */
	
		
	}
