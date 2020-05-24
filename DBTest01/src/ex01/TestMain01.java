package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMain01 {

	//oracle과 연결
	// driver 프로그램  필요 : ojdbc.jar 
	// c:\java8\jre\lib\ojdbc.jar 파일 복사한다. 
	
	
	//oraclexe - app - oracle - product -11 .2.0 - server - jdbc -       ojdbc6.jar 
	
	//java8 - (jre랑 lie랑 갈리지 말기) - jre- lib - ext 에 붙여넣기  
	//- rt.jar 
	
	
	private static String driver = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String dbuid ="hr";
	private static String dbpwd ="1234";
	//이것들이 ojdbc 를 통해서 oralce에 접근한다. 
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(driver); //일단 add throws . 이 클래스를 찾을수 없으면  //나는 오라클을 연결할 것이다. 
		Connection conn = DriverManager.getConnection(url, dbuid, dbpwd); //import하고  //나는 이것들을 통해서 접근하겠다 // 다시 throw를 하면 SQLException이 된다. 
//		Class Drivermanager 위에 문장을 길게 나타낸것이 사실 이거다 
//		{
//			static getconnection() {
//				connection conn = new Connection()
//						return conn;
//			}
//		}
//		Connection conn = DriverManager.getConnection(url);
		
		
		Statement stmt = conn.createStatement();  //java.sql 로 import 한다. 
		//statement 가 오라클이 들어갈 객체를 만드는것 
		
		//방법1.
		//String sql = "SELECT FIRST_NAME, LAST_NAME FROM EMPLOYEES";
		//방법2.
		//String sql = "SELECT D.DEPARTMENT_NAME, E.FIRST_NAME, E.LAST_NAME\r\n" +
		//			"FROM EMPLOYEES E, DEPARTMENTS D\r\n "+
		//			"WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID";
		//방법3.
		String sql = "SELECT D.DEPARTMENT_NAME,";
		sql 	   += "E.FIRST_NAME || ' '  || E.LAST_NAME AS NAME "; //SYSDATE , SUM(SALARY), 뭐 등등 그것들은 아래에서 사용불가 그래서 alains를 사용해야 한다.
		sql 	   += "FROM EMPLOYEES E, DEPARTMENTS D ";//맨끝에 D와 where사이에 공백을 꼭 넣어줘야 한다 .
		sql        += "WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID";
		
		//해결3.
		System.out.println("sql"+sql);
		
		ResultSet rs = stmt.executeQuery(sql); //import
		//위에 sql문장들을  executeQuery 실행해라  그래서 결과문 출력된것이 resultSet 
		//내부적으로 한 줄씩의 행을 표시하고 있는게 (화살표) rs커서 
		
		//만약 rs.getString("department_name"); 한 줄을 가져옴 
		System.out.println("부서번호 이름");
		System.out.println("==========");
		
		
		while(rs.next()) {//rs.next가 pathc 한줄을 가져온다. 그래서 아래의 rs.getString 데이터를 뽑아낸다. 
			//해결1.
			//String fname = rs.getString("FIRST_NAME");
			//String lname = rs.getString("LAST_NAME");
			//해결2.
			//String dname = rs.getString("DEPARTMENT_NAME"); //이걸로 자바는 해당 컬럼을 불러온다
			//String fname = rs.getString("FIRST_NAME"); 
			//String lname = rs.getString("LAST_NAME");
			//해결3.     계산된열이나 가공된열은 반드시 alians을 사용해야한다. 혹은 위치값. 
			String dname = rs.getString("DEPARTMENT_NAME");
		
			String fname = rs.getString(2);
			//String lname = rs.getString(3); // 혹은 위치값. // rs.getInt
			
			
			
			System.out.println(dname + "," + fname);
			
		}
		
		
		rs.close();
		stmt.close();
		conn.close();
		
		
	}

}
