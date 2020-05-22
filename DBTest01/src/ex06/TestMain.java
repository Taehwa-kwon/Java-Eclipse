package ex06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMain {

	private static String driver = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@127.0.1:1521:xe"; //192.168.35.159
	private static String dbuid = "hrd202";
	private static String dbpwd = "1234";
	
	public static void main(String[] args) {
		//방법 1 //addStudent("민성","010-1234-4321"); //1.이름과 전화번호를 입력시키 
		//방법 2 //Student s1 = new Student("주희","010-3434-4343");  //객체로 넘기는 방법 
		//방법 2 // addStudent(s1);

		//방법3
		addStudent( new Student ( "소연", "010-5454-4546"));
		
	}
//------------------------------------------------클래스로 넘기기-------------------------------------------------------------------//
	private static void addStudent(Student stud) {
		Connection conn =null;
		Statement stmt =null;
		//ResultSet rs = null; //ResultSet은 테이블에 나타나는건데 db에서insert하면 행이 입력되었습니다. 이렇게 뜨지 테이블에 나오지는 않으니깐  
		
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url,dbuid,dbpwd);
				stmt = conn.createStatement();
				
				String sql = "INSERT INTO STUDENT ( STNUM, STNAME, TEL ) ";
				sql += " VALUES ( SEQ_STNUM.NEXTVAL , '" + stud.getStname() + "' , '" + stud.getTel() + "')"; //Student의 필드가 private이니깐 getter/setter로 바꿔줌 
				System.out.println(sql);
				
				int aftcnt = stmt.executeUpdate(sql); //sql문이 select를 제외한 모든건 update를 사용한다. 
				//중요한게 여기다 .!! executeUpdate 
				//Oracle은 메모리에 있는 위치를 기억하는거고 
				//commit을 안하면 java에서는 확인 못함 commit하면 디스크에 저장되어서 확인가능함 
				
				System.out.println(aftcnt + "건 추가되었습니다");
						
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if( stmt != null ) stmt.close(); //5.
					if( conn != null ) conn.close(); //5.
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
		
	}
	//----------------------------------------------메소드로 넘기기----------------------------------------------------------------//
	private static void addStudent(String name, String tel) {
	Connection conn =null;
	Statement stmt =null;
	//ResultSet rs = null; //ResultSet은 테이블에 나타나는건데 db에서insert하면 행이 입력되었습니다. 이렇게 뜨지 테이블에 나오지는 않으니깐  
	
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,dbuid,dbpwd);
			stmt = conn.createStatement();
			
			String sql = "INSERT INTO STUDENT ( STNUM, STNAME, TEL ) ";
			sql += " VALUES ( SEQ_STNUM.NEXTVAL , '" + name + "' , '" + tel + "')";
			System.out.println(sql);
			
			int aftcnt = stmt.executeUpdate(sql); //sql문이 select를 제외한 모든건 update를 사용한다. 
			//중요한게 여기다 .!! executeUpdate 
			//Oracle은 메모리에 있는 위치를 기억하는거고 
			//commit을 안하면 java에서는 확인 못함 commit하면 디스크에 저장되어서 확인가능함 
			
			System.out.println(aftcnt + "건 추가되었습니다");
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if( stmt != null ) stmt.close(); //5.
				if( conn != null ) conn.close(); //5.
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
	}

}
