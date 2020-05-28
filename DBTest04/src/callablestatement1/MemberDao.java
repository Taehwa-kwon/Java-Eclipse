package callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {//!!!!!!!!!!!!!!!!!DAO 의 역할은 출력의 목적이 절때 아니다. db와 연결해서 찾았는지 못찾았는지 객체의 정보만 main한테 넘겨주면 된다. 아무리 출력하는system.out.println을 해도 고객의 자리에는 보여지지도 않는다. 

		private String driver = "oracle.jdbc.OracleDriver";
		private String url = "jdbc:oracle:thin:@localhost:1521:xe";
		private String dbuid = "jdbctest";
		private String dbpwd = "1234";
		
		private Connection conn;
		private CallableStatement cstmt; //CallableStatement 의 목적은  SQL의 스토어드프로시저(Stored Procedure)를 실행시키기 위해 사용되는 인터페이스 입니다
		private ResultSet rs;		//이건 조회할떄 씀 
		
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

		// 추가 메소드 MEMID ,MNAME , EMAIL, PASSWD , PHON
		public int addMember(MemberVO vo) {
			int insertCnt = 0;
			try {
				String sql ="{call spaddmember ( ?,?,?,?,?) }";   //오라클에 Stored Procedure 을 이미 만들어둠 . 
				cstmt = conn.prepareCall(sql);
				cstmt.setString(1, vo.getMemid());
				cstmt.setString(2, vo.getMname());
				cstmt.setString(3, vo.getEmail());
				cstmt.setString(4, vo.getPasswd());
				cstmt.setString(5, vo.getPhone());
				
				insertCnt = cstmt.executeUpdate();	//추가하는것
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return insertCnt ;	
		}


		public MemberVO getMember(String memid) {
			MemberVO mem = null;
			try {
				String sql =" {call spgetmember(?,?,?,?,?,?,?,?,?)} ";  //한사람의 정보를 가져오려고 .. 
				cstmt = conn.prepareCall(sql);
				// 파라미터 setting 
				cstmt.setString(1, memid); //in은 밑에처럼 안해도된다. 
				cstmt.registerOutParameter(2, Types.VARCHAR);//나는 너네들을 꺼냅니다 라고 지정을 하는 것이지 .
				cstmt.registerOutParameter(3, Types.VARCHAR);
				cstmt.registerOutParameter(4, Types.VARCHAR);
				cstmt.registerOutParameter(5, Types.VARCHAR);
				cstmt.registerOutParameter(6, Types.VARCHAR);
				cstmt.registerOutParameter(7, Types.VARCHAR); //날짜를 가공해서 String타입으로 
				cstmt.registerOutParameter(8, Types.NUMERIC);
				cstmt.registerOutParameter(9, Types.VARCHAR); //point를 가공해서 level을 만듬
				
				cstmt.executeQuery(); // ctrl + enter을 했다. 
				// 파라미터 get 
				String out_memid = cstmt.getString(2);
				if( out_memid.equals("NO DATA")|| //중요한것이 여기서 자료가 없습니다. 이런  파일없습니다. 메세지를 띄우면 안된다 .dao의 역할은 결과만을 넘겨주면 되는거지 
					out_memid.startsWith("ERROR:")) {
					System.out.println("문제발생 : " + out_memid);
					return mem;
				}
				
				String out_mname = cstmt.getString(3);
				String out_email = cstmt.getString(4);
				String out_passwd = cstmt.getString(5);
				String out_phone = cstmt.getString(6);
				String out_regdate = cstmt.getString(7);
				int out_point = cstmt.getInt(8); //point
				String out_mlevel = cstmt.getString(9); //level
				
				mem = new MemberVO(out_memid,out_mname,out_email,out_passwd,out_phone,out_regdate,out_point,out_mlevel);  //mpoint는 int형인데 String타입으로 바꿧으니 MemberVO에서 생성자를 새로 추가해야 한다. 
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return mem;
		}
		
		public List<MemberVO> getMemberList(){
			List<MemberVO> list = new ArrayList<>();
			
			try {
				String sql = "{ call spgetmemberlist (?) ";
				cstmt = conn.prepareCall(sql);
				//파라미터 설정 ( ? < 에 대한 내용들 )
				cstmt.registerOutParameter(1, oracle.jdbc.internal.OracleTypes.CURSOR); //낮은버전 || forbidden reference 의 설정을   error 등급을 warring이하로 변경 
				//cstmt.registerOutParameter(1, Types.REF_CURSOR); //java8 ,jdbc7.jar 문법 
				//프로시저 실행
				cstmt.executeQuery();
				//조회된 결과 처리				
				ResultSet rs = (ResultSet) cstmt.getObject(1); //커서라서 object 로 받는지 . 
				while(rs.next()) {
					String memid = rs.getString(1);
					String mname = rs.getString(2);
					String email = rs.getString(3);
					String phone = rs.getString(4);
					String regdate = rs.getString(5);
					String mlevel = rs.getString(6);
					
					MemberVO m = new MemberVO(memid,mname,email,phone,regdate,mlevel);
					list.add(m);
				}

				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list; //조회한 자료가 없다면 list의 사이즈를 찍어라 
		}
		
		public MemberVO updateMember(String uid) {  --아직 해보지는 않았음 (내 머릿속 코딩) 
			int upCnt = 0;
			try {
				String sql = "{ call SPUPDATEMEMBER (?,?,?,?) }";
				cstmt = conn.prepareCall(sql);
				cstmt.setString(1,memid);
				cstmt.setString(2,email);
				cstmt.setString(3,passwd);
				cstmt.setString(4,phone);
				
				cstmt.executeUpdate();
				
				upCnt = cstmt.getInt(2);
				System.out.println("업데이트 건수 : " + upCnt);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return upCnt;
		}
		
		
		public int delMember(String memid) {
			int delCnt = 0;
			try {
				String sql = "{call  SPDELMEMBER(?, ?) }";  
				cstmt      =  conn.prepareCall(sql);
				cstmt.setString( 1, memid );
				cstmt.registerOutParameter(2, Types.NUMERIC );
				
				cstmt.executeUpdate();
				
				delCnt  = cstmt.getInt( 2 ); 
				System.out.println( "삭제건수:" + delCnt  );
			} catch (SQLException e) {			
				e.printStackTrace();
			}
			return delCnt;
		}
		
}
