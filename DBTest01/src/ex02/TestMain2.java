package ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMain2 {
	
	private static String driver = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String dbuid = "HR";
	private static String dbpwd = "1234";
	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url,dbuid,dbpwd);
		Statement stmt = conn.createStatement();
		//아래 String sql 에 앞뒤 공백을 적절히 남겨준다. 
		String sql = " select d.department_name dname, to_char(nvl(avg(e.salary),0),'$99,990.999') avgsal" ;
		sql +=		"    from employees e , departments d" ;
		sql +=		"    where d.department_id = e.department_id(+)" ;
		sql +=		"    group by d.department_name" ;
		sql +=		"    order by d.department_name"; //여기서 sql문 맨 끝에 ; 이걸 없애야 한다... 중요 !!! 
		System.out.println(" sql문 확인  " + sql);
		
		//ResultSet rs = stmt.execute(sql); 
		ResultSet rs = stmt.executeQuery(sql); //select
		//ResultSet rs = stmt.executeUpdate(sql); // insert , update, delete 
		
		
		while(rs.next()) {
			String dname = rs.getString(1);
			String avgsal = rs.getString(2);
			String fmt = "%-20s %10s";
			String msg = String.format(fmt, dname,avgsal);
			
			System.out.println(msg);
		}
		
		
		
		
		rs.close();
		stmt.close();
		conn.close();
		
	}
}
