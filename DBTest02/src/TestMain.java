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
	private ResultSet rs; //oracle의 결과물에 첫번째 위치에 커서를 주고있다. 
	
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
		List<Member> list = new ArrayList<>();//11. ArrayList생성방법임. List 컬렉션에 select 한것을 담기위해서 
		
		//stmt = conn.createStatement();//9.surround 
		try {
			stmt = conn.createStatement();//10
			String sql = " SELECT MID, NAME, EMAIL, ML.MLEVEL, ";	//10
			sql += " TO_CHAR(RDATE,'YY-MM-DD') RDATE";
			sql += " FROM MEMBER M, MEMBERLEVEL ML ";
			sql += " WHERE M.POINT BETWEEN ML.LOPOINT AND ML.HIPOINT ";
			
			
			 ResultSet rs = stmt.executeQuery(sql); //10.이것의 executeQuery 리턴값이 ResultSet 이니깐  ResultSet으로 받아줘야함   //자동 commit이 된다. 
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

	public Member getMember(int mid) { //18
		Member m = null; //18 처음에 null값을 줘서 값이 있으면 
		
		try {//19
			stmt = conn.createStatement();
			String sql = "SELECT MID, NAME, EMAIL, PHONE, POINT, ML.MLEVEL, ";	  
				sql += " TO_CHAR(RDATE,'YYYY-MM-DD DAY') RDATE " ;
				sql += " FROM MEMBER M, MEMBERLEVEL ML ";
				sql += " WHERE M.POINT BETWEEN ML.LOPOINT AND ML.HIPOINT AND M.MID = " + mid;
				rs = stmt.executeQuery(sql); 
				
				if( rs.next()) {  //20-1 mid는 하나의 자료만 나타나니깐 while쓸 필요는없다. 근데 mid =4 면은 오류가 아니라 아무것도 검색결과가 나오지 않는다.
									//그러니깐 if안에서 rs.next가 true이면 아래를 실행한다.
					int mid2 = rs.getInt(1);
					String name = rs.getString(2);
					String email = rs.getString(3);
					String phone = rs.getString(4);
					int point = rs.getInt(5);
					String mlevel = rs.getString(6);
					String rdate = rs.getString(7);
					
					m= new Member (mid2,name,email,phone,point,mlevel, rdate);
					
				}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m;
	}
	
	
	public int addMember(Member m) {
		
		int aftcnt = 0;
		try {
			stmt = conn.createStatement();
			String sql = "INSERT INTO MEMBER (MID,NAME,EMAIL,PHONE) " ;
			sql += "VALUES (( SELECT NVL(MAX(MID),0) +1 FROM MEMBER), ";
			//sql += " values (15, ";
			sql += " '" + m.getName() + "',";
			sql += " '" + m.getEmail() + "',";
			sql += " '" + m.getPhone() + "')";
			
			aftcnt = stmt.executeUpdate(sql);
			System.out.println(aftcnt + "건이 ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aftcnt;
	}
	
	public int delMember(int del_mid) {
		int cnt = 0;
		
		try {
			stmt = conn.createStatement();
			String sql = " delete from member where mid=" + del_mid ;
			cnt=stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	public int updateMember(Member um) {
		int Cnt = 0;
		try {
			stmt = conn.createStatement();
			String sql = "update MEMBER SET NAME = '"+um.getName()+"', email = '"+um.getEmail() +"', phone ='"+um.getPhone()+"', point = '"+um.getPoint()+"' where mid ="+um.getMid();
			Cnt = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Cnt;
	}


	
	
	
}
