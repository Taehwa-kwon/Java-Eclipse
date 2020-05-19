// JDBC란 Java Language에서 Database에 접근할 수 있는 프로그래밍 API를 말하며, 즉 java와 db를 연결할수 있게 만들어줌
// JDBC는 DBMS(데이터베이스 관리 시스템) 언어인 SQL(Structured Query Language)를 이용하여 Data를 주고받고 할 수 있음
//SQL은 Structured Query Language 관계형 데이터베이스 관리 시스템(RDBMS)의 데이터를 관리하기 위해 설계된 언어

/*JDBC API 패키지 구성

ㆍ java.sql.Driver : 모든 JDBC 드라이버가 상속받아야 하는 기본적인 인터페이스

ㆍ java.sql.Connection : Connection 오브젝트는 Database와의 연결을 표현, 이 오브젝트를 통해 질의(SQL)를 실행하고 결과를 돌려받을 수 있으며, 이를 통해 Database에 관한 여러 가지 정보를 얻을 수 있음
// 질의 = 데이터베이스에 정보를 요청하는 것이다
ㆍ java.sql.Statement : Statement오브젝트는 Database로 SQL문을 보내는데 사용됨. 세종류의 객체 - PreparedStaement, CallableStatement, Statement -를 제공하며 각각 SQL문의 특정 타입을 전달하기 위해 특수화 되어 있음.

ㆍ java.sql.PreparedStatement : 저장 프로시저가 아닌 미리 컴파일된 SQL문의 실행을 위한 인터페이스

ㆍ java.sql.CallableStatement : SQL 저장 프로시저를 실행시키기 위한 인터페이스

ㆍ java.sql.ResultSet : ResultSet 오브젝트는 SQL 쿼리를 수행한 결과를 지닌 테이블, Statement로 보낸 SQL문의 조건에 만족하는 결과를 가지고 있고, ResultSet 오브젝트에 저장된 결과에 Access할 수 있는 여러 가지 Method를 제공

ㆍ java.sql.ResultSetMetaData : ResultSet객체로 얻어온 데이터베이스의 결과 데이터에 대한 컬럼의 데이터형식, 속성등에 대한 정보를 가지는 인터페이스

ㆍ java.sql.DriverManager : JDBC 드라이버를 관리하기 위한 클래스

ㆍ java.sql.SQLException : 데이터베이스에 접근할때나 데이터베이스 연동 작업시에 발생하는 모든 예외 현상을 위한 기본 예외 클래스입니다.
*/

package homepage;
//이름 규칙 : 테이블명DAO , 테이블명DTO

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;
//DAO ( Data Access Object) : 데이터 접근 객체 ,  DB처리 클래스 ( DB연결, Select, update, insert, delete )

//CRUD(SQL실행) : Create;    insert , Read;   Select, Update, delete

//DB 처리   
//Data Access Object  데이터베이스에 관련된 작업을 전문적으로 담당하는 객체입니다.
//데이터 접근 객체 ,  DB처리 클래스 ( DB연결, Select, update, insert, delete )

public class MemberDAO1 {

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver"; // JRE System Library의 해당 드라이버를 실행시킨다는 의미.
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; // jdbc:oracle:thin:@ + 접속할 데이터베이스 ip 주소 +
																				// 1521은 리스너포트번호 + xe/ORCL 은 SID를 의미한다.

	private static final String USER = "testdb"; // DB ID
	private static final String PASS = "1234"; // DB 패스워드

	Member_List1 mList; // 단순필드

	// constructor 기본생성자
	public MemberDAO1() {

	}

	public MemberDAO1(Member_List1 mList) { // 매개변수로 저 전체를 받음
		this.mList = mList;
	}

	/* ==============================================DB연결 메소드==============================================*/
	 
	public Connection getConn() {
		Connection con = null;// 데이터 베이스와 연결하는 객체

		try {
			Class.forName(DRIVER); // 1. 드라이버 로딩
			con = DriverManager.getConnection(URL, USER, PASS); // 2. (데이터베이스)드라이버 연결 구문 //DriverManager JDBC 드라이버를 통하여
																// Connection을 만드는 역할을 합니다. Class.forName( ) 메소드를 통해서
																// 생성됩니다
			System.out.println("dataBase 연결성공2");

		} catch (Exception e) {
			e.printStackTrace(); // printStackTrace는 가장 자세한 예외 정보를 제공한다.
		}

		return con;
	}

	/*
	 * =======================================================================================================
	/* 한사람의 회원 정보를 DB에서 가져오는 메소드 (수정탈퇴취소가능한 창) */
	public MemberDTO1 getMemberDTO(String id) {   // 수정삭제할때 id는 변경되면 안되니깐

		MemberDTO1 dto = new MemberDTO1();

		Connection con = null; // 연결 Connection인터페이스는 SQL을 연결시키는 객체. SQL문장을 실행시키기 전에 우선 Connection 객체가 필요하다.
		PreparedStatement ps = null; // 명령 prepareStatement 는 SQL구문을 실행시키는 객체.
		ResultSet rs = null; // 결과 SQL문에서 Select 문을 사용한 질의의 경우 성공시 결과물로 반환한다.
							 // SQL 질의에 의해 생성된 테이블을 저장하는 객체입니다.
							

		try {

			con = getConn(); // getConn DB연결 메소드를 뜻함
			String sql = "select * from tb_member where id=? "; // id=? 인 모든것을 불러오는 것
			ps = con.prepareStatement(sql); // prepareStatement 는 SQL구문을 실행시키는 객체. 변수가 들어갈 자리는 ? 로 표시한다.
			ps.setString(1, id);	// PreparedStatement객체는 SQL타입을 처리할 수 있는 setXxxx() 메소드를 제공한다. setString 은 void
									// setString(int parameterIndex, String x) 위치홀더,문자
									//			System.out.print(ps.setString(1, id));
									//			System.out.println(sql);

			rs = ps.executeQuery(); // Select구문을 수행할때 사용하는 함수
									// 콘솔창에 나타낼려면 executeQuery() 사용    //  	아니면 executeUpdat() 사용

			if (rs.next()) { // 여기서 바로 출력이 불가능하기 때문에 DTO에 출력할 것이다.
				dto.setId(rs.getString("id")); 	//DB에서 꺼내서 DTO에 저장하는 
				dto.setPwd(rs.getString("Pwd"));
				dto.setName(rs.getString("name"));
				dto.setTel(rs.getString("tel"));
				dto.setAddr(rs.getString("addr"));
				dto.setBirth(rs.getString("birth"));
				dto.setJob(rs.getString("job"));
				dto.setGender(rs.getString("gender"));
				dto.setEmail(rs.getString("email"));
				dto.setIntro(rs.getString("intro"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dto;
	}

	/**멤버리스트 출력*/  //Member_List1 클래스 에서 사용됌 db에서 값을 가져옴
	public Vector getMemberList(){ //Vector를 통해서 배열을 동적인 길이로 저장. 
		
		
		Vector data = new Vector();  //Jtable에 값을 쉽게 넣는 방법 1. 2차원배열   2. Vector 에 vector추가
		
			
		Connection con = null; 		 //연결
		PreparedStatement ps = null; //명령
		ResultSet rs = null;		 //결과
		
		try{
			
			con = getConn();
			String sql = "select * from tb_member order by name asc"; // order by name asc 오름차순 
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery(); //select 니깐 executeQuery를 사용
			
			while(rs.next()){
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String addr = rs.getString("addr");
				String birth = rs.getString("birth");
				String gender = rs.getString("gender");
				String job = rs.getString("job");
				String email = rs.getString("email");
				String intro = rs.getString("intro");
				
				Vector row = new Vector();
				row.add(id);
				row.add(pwd);
				row.add(name);
				row.add(tel);
				row.add(addr);
				row.add(birth);
				row.add(job);
				row.add(gender);
				row.add(email);
				row.add(intro);
				data.add(row);
				
			}//while
		}catch(Exception e){
			e.printStackTrace();
		}
		return data;
	}//getMemberList()
	


	/**회원 등록*/
	public boolean insertMember(MemberDTO1 dto){
		
		boolean ok = false;
		
		Connection con = null; 		 //연결
		PreparedStatement ps = null; //명령
		
		try{
			
			con = getConn();
			String sql = "insert into tb_member" + 
					 "(id,pwd,name,tel,addr,birth,job,gender,email,intro) "+
						"values(?,?,?,?,?,?,?,?,?,?)";
			
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPwd());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getTel());
			ps.setString(5, dto.getAddr());
			ps.setString(6, dto.getBirth());
			ps.setString(7, dto.getJob());
			ps.setString(8, dto.getGender());
			ps.setString(9, dto.getEmail());
			ps.setString(10, dto.getIntro());			
			int r = ps.executeUpdate(); //실행 -> 저장      //insert, update, delete는 executeUpdate() 를 호출하여 쿼리를 실행한다.
			
			
			if(r>0){
				System.out.println("가입 성공");	
				ok=true;
			}else{
				System.out.println("가입 실패");
			}
			
				
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return ok;
	}//insertMmeber
	
	
	/**회원정보 수정*/
	public boolean updateMember(MemberDTO1 vMem){
		System.out.println("dto="+vMem.toString());
		boolean ok = false;
		Connection con = null;
		PreparedStatement ps = null;
		try{
			
			con = getConn();			
			String sql = "update tb_member set name=?, tel=?, addr=?, birth=?, job=?, gender=?" +
					", email=?,intro=? "+ "where id=? and pwd=?";
			
			ps = con.prepareStatement(sql);
			
			ps.setString(1, vMem.getName());
			ps.setString(2, vMem.getTel());
			ps.setString(3, vMem.getAddr());
			ps.setString(4, vMem.getBirth());
			ps.setString(5, vMem.getJob());
			ps.setString(6, vMem.getGender());
			ps.setString(7, vMem.getEmail());
			ps.setString(8, vMem.getIntro());
			ps.setString(9, vMem.getId());
			ps.setString(10, vMem.getPwd());
			
			int r = ps.executeUpdate(); //실행 -> 수정
			// 1~n: 성공 , 0 : 실패
			
			if(r>0) ok = true; //수정이 성공되면 ok값을 true로 변경
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return ok;
	}
	
	/**회원정보 삭제 :
	 *tip: 실무에서는 회원정보를 Delete 하지 않고 탈퇴여부만 체크한다.*/
	public boolean deleteMember(String id, String pwd){
		
		boolean ok =false ;
		Connection con =null;
		PreparedStatement ps =null;
		
		try {
			con = getConn();
			String sql = "delete from tb_member where id=? and pwd=?";
			
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pwd);
			int r = ps.executeUpdate(); // 실행 -> 삭제
			
			if (r>0) ok=true; //삭제됨;
			
		} catch (Exception e) {
			System.out.println(e + "-> 오류발생");
		}		
		return ok;
	}
	
	
	/**DB데이터 다시 불러오기*/	
	public void userSelectAll(DefaultTableModel model) {   //JTable 생성된후 DefaultTableModel이 있으면 수정변경등등이 가능하다.
															// JTable 은 Swing 의 데이블임
		
		
    	Connection con = null;
    	PreparedStatement ps = null;
    	ResultSet rs = null;
    	
    	try {
            con = getConn();
            String sql = "select * from tb_member order by name asc";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            // DefaultTableModel에 있는 데이터 지우기
            for (int i = 0; i < model.getRowCount();) {
                model.removeRow(0);
            }
 
            while (rs.next()) {
                Object data[] = { 
                		rs.getString(1),
                		rs.getString(2),
                        rs.getString(3), 
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10)};
 
                model.addRow(data);                
            }
 
        } catch (SQLException e) {
            System.out.println(e + "=> userSelectAll fail");
        } finally{
			
			if(rs!=null)
				try {
					rs.close();
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			if(ps!=null)
				try {
					ps.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
    }
}
