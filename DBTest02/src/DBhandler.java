import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBhandler {
	private static String Driver = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String dbuid = "sys as sysdba";
	private static String dbpwd = "1234";
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	//생성자란 객체가 생성될때 반드시 실행되어야 할것들
	public DBhandler() { //1.
		open();				//1.
	}

	public void open() {		//2.
		//Class.forName(Driver);  2.첫번째 써라운드 
		try {
			Class.forName(Driver);
			//conn = DriverManager.getConnection(url,dbuid,dbpwd); 2.두번째 써라운드
			conn = DriverManager.getConnection(url,dbuid,dbpwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close() {		//3.
		try {
			if(rs != null ) rs.close();	
			if(stmt != null ) stmt.close();
			if(conn != null ) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//member 목록조회 MID, NAME, EMAIL, MLEVEL, RDATE
	public List<Member> getMemberList() {   //8.메소드 작성
		List<Member> list = new ArrayList<>();//11
		
		//stmt = conn.createStatement();//9.surround 
		try {
			stmt = conn.createStatement();//10
			String sql = " SELECT MID, NAME, EMAIL, ML.MLEVEL, ";	//10
			sql += " TO_CHAR(RDATE,'YY-MM-DD') RDATE";
			sql += " FROM MEMBER M, MEMBERLEVEL ML ";
			sql += " WHERE M.POINT BETWEEN ML.LOPOINT AND ML.HIPOINT ";
			
			
			 rs = stmt.executeQuery(sql); //10.이것의 리턴값이 ResultSet 이니깐
			while(rs.next()) {
				int mid = rs.getInt(1);//13
				String name = rs.getString(2);
				String email = rs.getString(3);
				String mlevel =rs.getString(4);
				String rdate =rs.getString(5);
				
				Member m = new Member( mid, name, email, mlevel, rdate); //12 생성자 생성 
				list.add(m);//12
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return list;
	}
}
