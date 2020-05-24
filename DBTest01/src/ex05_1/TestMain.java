package ex05_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ex05.Student2;

public class TestMain {

	private static String driver = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe"; //192.168.35.159
	private static String dbuid = "hrd202";
	private static String dbpwd = "1234";
	
	//문제 student 테이블과 scores 테이블을 조인하여
	//모든 학생의 번호,이름,총점,평균,등급을 출력하는 자바프로그램 작성
	
	//결과는 클래스에 담고 ArrayList로 출력한다.
	
	public static void main(String[] args) {
	ArrayList<StudentScore>list = getStudentlist();
	for (StudentScore studentScore : list) {
		System.out.println(studentScore);
		//System.out.println(studentScore.info());//이거는 studentscore.info메소드 이걸로 학점등급을 나타낼수있다. 
	}
	
		
		

	}

	private static ArrayList<StudentScore> getStudentlist() {
		ArrayList<StudentScore> slist = new ArrayList<StudentScore>();
		
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver); //드라이버 연결
			conn = DriverManager.getConnection(url,dbuid,dbpwd); //드라이버를 db에 견결
			stmt = conn.createStatement();
			String sql = " select st.stnum, st.stname, "; 
				sql += " decode (sum(sc.score),null,'미응시',sum(sc.score)) totscore, "; 
				sql += " decode (avg(sc.score),null,'미응시',to_char(avg(sc.score),'999,999')) avgscore, "; 
				sql +=	  "  case ";
				sql +=	  "  when avg(score) >= 90 then 'A' ";
				sql +=	  "  when avg(score) >= 80 then 'B' ";
				sql +=	 " when avg(score) >= 60 then 'D' ";
				sql += " when avg(score) < 60 then 'E' ";
				sql += " ELSE 'F' ";
				sql += " END grade , ";
				sql += " RANK () OVER (ORDER BY AVG(SCORE) desc nulls last) RNK  ";//   --asc하면 안되네
				sql += " FROM student st left join scores sc on st.stnum = sc.stnum " ;
				sql += " group by st.stnum, st.stname ";

			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			
			
			//rs = stmt.execute(sql) boolean타입이니깐 update,delete 등 과같은것만 .. 
			
			while(rs.next()) {
				int stnum = rs.getInt(1);
				String stname = rs.getString(2);
				String totscore = rs.getString(3);
				String avgscore = rs.getString(4);
				String grade = rs.getString(5);
				int rank = rs.getInt(6);
				
				StudentScore s = new StudentScore(stnum, stname, totscore, avgscore, grade, rank);
				slist.add(s);
			}
			
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if( rs != null) rs.close(); // null이 아닐때 
				if( stmt != null ) stmt.close(); //5.
				if( conn != null ) conn.close(); //5.
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		return slist;
	}

}
