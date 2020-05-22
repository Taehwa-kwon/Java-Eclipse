package ex04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TestMain {
	
	private static String driver = "oracle.jdbc.OracleDriver"; //패키지이름 . 클래스이름 
	private static String url = "jdbc:oracle:thin:@127.0.1:1521:xe";
	private static String dbuid = "hrd202";
	private static String dbpwd = "1234";
	

	public static void main(String[] args) {
		//getData();//1. 이걸 냅두고 
		//17번째 시작  1을 없애고
		ArrayList<Student> list = getData();
		for (Student student : list) {
			System.out.println(student);
		}//여기까지 
		
	}


	private static ArrayList<Student> getData() {
		ArrayList<Student> slist = new ArrayList<Student>(); //14
			//아까는 가변배열 한사람의정보를 한줄로 받아서 던지는것
			//이번에는 한사람의 정보를 객체로 받아서 던지는것 
			
		
		
		
		Connection conn =null; //6.
		Statement stmt = null; //6.
		ResultSet rs = null; //6.
		//Class.forName(driver); 1.surround 
		try {
			Class.forName(driver); //2
			conn = DriverManager.getConnection(url,dbuid,dbpwd); //7.Add catch clause to surrounding try 해주고 
			stmt = conn.createStatement(); //7.
			String sql = " select stnum,stname,tel,to_char(indate, 'YYYY-MM-DD DAY') indate "; //9.
			sql += " from student ";//9.
			rs  = stmt.executeQuery(sql); //9.
			
			while( rs.next()) { //10.
			 int stnum = rs.getInt("stnum");
			 String stname = rs.getString("stname");
			 String tel = rs.getString("tel");
			 String indate = rs.getString("indate");
			 
			 /* 					11. ArrayList가 아니라 새로운 클래스를 만든다. 12.는 클래스 생성									*/
			 Student s = new Student(stnum, stname, tel, indate);  //13.이건 한사람의 정보들을 담았다. 
			 slist.add(s); //15.
			
			
			
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {  //8. 7을 surrounding해주면 이게 생겨남 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {  //3. finally 
			//rs.close(); // 4. surround
			try {
				if( rs != null) rs.close(); //5.
				if( stmt != null ) stmt.close(); //5.
				if( conn != null ) conn.close(); //5.
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//return slist; //16번쨰  타입변환 해주고 
		return slist; 
		
	}

}
