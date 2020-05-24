package ex07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import ex04.Student;

public class TestMain {

	private static String driver = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@127.0.1:1521:xe"; //192.168.35.159
	private static String dbuid = "hrd202";
	private static String dbpwd = "1234";
	
	
	//DB 추가, 수정, 삭제, 조회하는 프로그램 만들기만 하면 되는건가요?
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
//		String selectCheck = "";
//		selectCheck = in.nextLine();
//		
//		switch(selectCheck) {
//		case "1": searchStudent(); break;
//		case "2": addStudent(); break;
//		case "3": updateStudent(); break;
//		case "4": deleteStudent(); break;
//		case "5": System.out.println("프로그램이 종료되었습니다");break;
//		default: break;
//			
//		}
//			
		
			boolean run = true;
			while (run) {
				System.out.println("+---------------------------------------+");
				System.out.println("1.조회, 2.추가 3.수정 4.삭제 5.종료");
				System.out.println("+---------------------------------------+");
				System.out.print("선택> ");
				
				int selectNo =in.nextInt();

				if (selectNo == 1) {
					searchStudent();
				} else if (selectNo == 2) {
					addStudent();
				} else if (selectNo == 3) {
					updateStudent();
				} else if (selectNo == 4) {
					deleteStudent();
				} else if (selectNo == 5) {
					run = false;
				}
			}
			System.out.println("프로그램 종료");

		//방법 1 //addStudent("민성","010-1234-4321"); //1.이름과 전화번호를 입력시키 
		
		//방법 2 
		//Student s1 = new Student("주희","010-3434-4343");  //객체로 넘기는 방법 
		//addStudent(s1);

		//방법3
		//addStudent( new Student ( "소연", "010-5454-4546"));
		
	}


		private static void searchStudent( ) {
	Connection conn =null; 
	Statement stmt = null; 
	ResultSet rs = null; 

	try {
		Class.forName(driver); 
		conn = DriverManager.getConnection(url,dbuid,dbpwd);  
		stmt = conn.createStatement(); 
		String sql = " select stnum,stname,tel,to_char(indate, 'YYYY-MM-DD DAY') indate "; 
		sql += " from student ";
		rs  = stmt.executeQuery(sql); 
		
			
		while( rs.next()) { 
			
		 int stnum = rs.getInt("stnum");
		 String stname = rs.getString("stname");
		 String tel = rs.getString("tel");
		 String indate = rs.getString("indate");
		 
		
		 Student s = new Student(stnum, stname, tel, indate);  
		 System.out.println(s);
		
		
			}
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {   
		
		e.printStackTrace();
	} finally {   
		
		try {
			if( rs != null) rs.close(); 
			if( stmt != null ) stmt.close(); 
			if( conn != null ) conn.close(); 
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	
}
		
		private static void addStudent( ) {
			System.out.println("이름과 전화번호를 입력하시오 ");
			Scanner in = new Scanner(System.in);
			String name = in.next();
			String Tel =in.next();
			
			Connection conn =null;
			Statement stmt =null;
			  
			
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url,dbuid,dbpwd);
					stmt = conn.createStatement();
					
					String sql = "INSERT INTO STUDENT ( STNUM, STNAME, TEL ) ";
					sql += " VALUES ( SEQ_STNUM.NEXTVAL , '" + name + "' , '" + Tel + "')"; //Student의 필드가 private이니깐 getter/setter로 바꿔줌 
				
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

		private static void updateStudent() {
			System.out.println("---------------------------");
			System.out.println("기존의 이름을 선택하십시오");
			System.out.println("변경할 전화번호를 입력하시오");
			System.out.println("---------------------------");
			
			Scanner in = new Scanner(System.in);
			String name2 = in.nextLine();
			String tel2 = in.nextLine();
			
			Connection conn =null; 
			Statement stmt = null; 

			try {
				Class.forName(driver); 
				conn = DriverManager.getConnection(url,dbuid,dbpwd);  
				stmt = conn.createStatement(); 
				String sql = " UPDATE student set tel = '" + tel2 + "' where stname = '" + name2 + "'" ;
				//sql += " VALUES ( SEQ_STNUM.NEXTVAL , '" + name + "' , '" + Tel + "')"; //Student의 필드가 private이니깐 getter/setter로 바꿔줌
				
				int aftcnt = stmt.executeUpdate(sql); 
				System.out.println(aftcnt + "건이 변경되었습니다");
					
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {   
				
				e.printStackTrace();
			} finally {   
				
				try {
					if( stmt != null ) stmt.close(); 
					if( conn != null ) conn.close(); 
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			
		}

		private static void deleteStudent() {
			System.out.println("---------------------------");
			System.out.println(" 이름 입력하십시오");
			System.out.println("---------------------------");
			
			Scanner in = new Scanner(System.in);
			String name2 = in.nextLine();
			
			Connection conn =null; 
			Statement stmt = null; 

			try {
				Class.forName(driver); 
				conn = DriverManager.getConnection(url,dbuid,dbpwd);  
				stmt = conn.createStatement(); 
				String sql = " DELETE FROM STUDENt WHERE STNAME = '"+name2+"'";
				//sql += " VALUES ( SEQ_STNUM.NEXTVAL , '" + name + "' , '" + Tel + "')"; //Student의 필드가 private이니깐 getter/setter로 바꿔줌
				
				int aftcnt = stmt.executeUpdate(sql); 
				System.out.println(name2+ aftcnt + "건이 삭제되었습니다");
					
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {   
				
				e.printStackTrace();
			} finally {   
				
				try {
					if( stmt != null ) stmt.close(); 
					if( conn != null ) conn.close(); 
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			
		}
}
