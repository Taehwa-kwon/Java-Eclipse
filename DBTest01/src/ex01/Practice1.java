package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Practice1 {

	private static String driver = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String dbuid = "hr";
	private static String dbpwd = "1234";
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(driver); //1.db에 연결
		Connection conn = DriverManager.getConnection(url, dbuid, dbpwd);
		Statement stmt = conn.createStatement(); //2.오라클 객체가 들어갈 공간 생성
		
		String sql = " select first_name, department_id from employees";   //3.어떤 쿼리문을 실행시킬것인가.
		
		ResultSet rs = stmt.executeQuery(sql);  //4. 실행시키며, 어디에 담을것인가.
		
		while (rs.next()) {
			String fname = rs.getString(1);
			String d_id = rs.getString(2);
			
			System.out.println(fname+ " , "+d_id);
			
		}
		
		rs.close();
		stmt.close();
		conn.close();
		
		

	}

}
