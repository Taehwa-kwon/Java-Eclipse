package callablestatement1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDao {

		private String driver = "oracle.jdbc.OracleDriver";
		private String url = "jdbc:oracle:thin:@localhost:1521:xe";
		private String dbuid = "jdbctest";
		private String dbpwd = "1234";
		
		private Connection conn;
		private CallableStatement cstmt;
		private ResultSet rs;
		
		public MemberDao() {
			open();
			
		}

		
		private void open() {
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url,dbuid,dbpwd);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		public void close() {
			try {
				if(rs!=null) rs.close();
				if(cstmt!=null) cstmt.close();
				if(conn!=null) conn.close();
				
			}catch(SQLException e ) {
				e.printStackTrace();
			}
		}


		public int addMember(MemberVO vo) {
			int insertCnt = 0;
			try {
				String sql ="{call spaddmember ( ?,?,?,?,?) }";
				cstmt = conn.prepareCall(sql);
				cstmt.setString(1, vo.getMemid());
				cstmt.setString(2, vo.getMname());
				cstmt.setString(3, vo.getEmail());
				cstmt.setString(4, vo.getPasswd());
				cstmt.setString(5, vo.getPhone());
				
				insertCnt = cstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return insertCnt ;	
		}


		public MemberVO getMember(String string) {
			MemberVO m = null;
			try {
				String sql =" {call spgetmember(?)} ;
				cstmt = conn.prepareCall(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return null;
		}

}
