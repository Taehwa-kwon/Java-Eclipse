package ex03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.ArrayList;

public class TestMain2 {

	private static String driver = "oracle.jdbc.OracleDriver"; //패키지이름 . 클래스이름 
	private static String url = "jdbc:oracle:thin:@127.0.1:1521:xe";
	private static String dbuid = "hrd202";
	private static String dbpwd = "1234";
	
			
	
	public static void main(String[] args) {
		//getData(); //함수를 뺀 이유는 getData에서 조회했던 내용을 main으로 던져서 여기서 출력해보고 싶다. 
		ArrayList<String> list = getData(); //22번째 
		for (String student : list) {
			System.out.println(student);
		}
		

	}

	private static ArrayList<String> getData() {
		ArrayList<String> slist = new ArrayList();  //19번째 slist에다가 
		
		
		
		Connection conn =null ; //3번쨰입력 쭉     앞에는 객체 
		Statement stmt = null; //8번째 입력  (import)
		ResultSet rs = null; ///9번쨰 입력 (import)
		//Class.forName(driver); // 1. 라이브러리 파일을 new하겠다는 의미 . 이걸 surround 한다.
		try {
			Class.forName(driver);
			conn =  DriverManager.getConnection(url,dbuid,dbpwd); //4번쨰입력 쭉 try catch해주고
			stmt = conn.createStatement(); //10번쨰 입력
			String sql = " select stnum,stname,tel,to_char(indate, 'YYYY-MM-DD DAY') indate "; //11번째 입력 // 16번쨰 데이터입력
			sql += " from student ";
			
			
			rs  = stmt.executeQuery(sql); //12번째 입력 
			while(rs.next()) {  //13번째 입력
				int stnum = rs.getInt(1);//17번째 입력
				String stname = rs.getString(2); //17번째 입력
				String tel = rs.getString(3); //17번째 입력
				//Date indate = rs.getDate(4); //17번째 입력 -이건 날짜타입이니깐 앞뒤 바꿔주고 import해준다, 
				//중요한건 java에서 날짜타입으로 받아서 뭔가를 작업하려면 날짜타입으로 하는데 그냥 받는게 중요하면 String으로 해도된다
				// 프로시저의 주요 목적이 오라클에서 모든걸 처리해서 결과만 넘겨주겠다는 의미인데..그럼 자바는 걍 받기만 하면 됌
				String indate = rs.getString("indate"); // select 문에서 이미 문자열로 바꿔서 넘겨주기 때문에 String으로 받으면 된다.
				
				
				//String msg = "%d %s %s %s"; //14번째 입력 
				String pattern = "{0}  ,  {1}  ,   {2}  ,   {3}  {0} ";  //18번째 새로운방뻡 
				String msg = MessageFormat.format(pattern,  //18번째 새로운방뻡 
						stnum, stname, tel,indate); //18번째 새로운방뻡 
				System.out.println(msg); //15번째 입력 
				
				slist.add(msg); //20번째 
				
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버가 없습니다"); //5번쨰 입력
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("오류"+e.getMessage()); //6번째 입력
			e.printStackTrace();
		}finally {    //2.finally 입력
			//conn.close();    7. Surround해준다
			try {
				if(conn!=null) rs.close(); //15-1
				if(conn!=null) stmt.close(); //15-2
				if(conn!=null) conn.close(); //15-3
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return slist; //21번쨰 
	}

}
