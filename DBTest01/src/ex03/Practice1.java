package ex03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.ArrayList;

public class Practice1 {

	private static String driver = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String dbuid = "hrd202";
	private static String dbpwd = "1234";
	
	public static void main(String[] args) {
		ArrayList<String> list = getData();
		

	}

	private static ArrayList<String> getData() {
		ArrayList<String> slist = new ArrayList();
		Connection conn = null;
		Statement stmt =null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,dbuid,dbpwd);
			stmt = conn.createStatement();
			String sql = " select stnum, stname, tel, to_char(indate, 'YYYY/MM/YY DAY') indate ";
			sql += " from student ";
			
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int stnum = rs.getInt(1);
				String stname = rs.getString(2);
				String tel = rs.getString(3);
				String indate =rs.getString(4);
				
				String pattern = " {0} {1} {2} {3} ";
				String msg = MessageFormat.format(pattern, stnum,stname,tel,indate);
				System.out.println(msg);
				slist.add(msg);
				
			}
			
			
		} catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) rs.close(); //15-1
				if(conn!=null) stmt.close(); //15-2
				if(conn!=null) conn.close(); //15-3
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return slist;
		
	}

}
