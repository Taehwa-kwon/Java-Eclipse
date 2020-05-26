package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBHandler {
		private static String Driver = "oracle.jdbc.OracleDriver";
		private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
		private static String dbuid = "taehwaDB";
		private static String dbpwd = "1234";
	
		private static Connection conn = null; //null값을 넣어주고 아래 open메소드에서 실행시키고 try 에서 값이 있다면 return conn;을 받아서 Connection으로 돌려줘서 연결됐는지 안됐는지 확인가능
		private static PreparedStatement pstmt = null;
		private static ResultSet rs = null;
		
		public DBHandler() {
			open();
		}
		// 오픈 
		private Connection open() {
			try {
				Class.forName(Driver);
				conn = DriverManager.getConnection(url,dbuid,dbpwd); // 만약에 nullpointException이 뜨면 앞에 conn을 넣어줘야 값이 생성된다 
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		}
		// 닫기
		public void close() {
			try {
				if(rs !=null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
			}
			
		}
		// 전체목록 조회 
		public List<Member> getMemberList() {
			List<Member> mlist = new ArrayList<>();
			String sql = null;
			/*										prepareStatement													*/
			try {
				sql = " Select m.mid, m.mname, m.email, ml.mlevel from member m join memberlevel ml on m.point between ml.lopoint and ml.hipoint order by m.mid asc "; 
				// 태화 :  먼저 조인하고 point가 lopoint와 hipoint 사이에서 등급을 매겨줌 
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while( rs.next()) {
					int mid = rs.getInt(1);
					String name = rs.getString(2);
					String email = rs.getString(3);
					String mlevel = rs.getString(4);
					Member m  = new Member(mid,name,email,mlevel);
					mlist.add(m);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return mlist;
		}
		// 추가
		public int addMember(Member insertM) {
			int cnt = 0;
			try {
				String sql = " insert into member ( mid ,mname,email,phone ) values (( select nvl(max(mid),0)+1 from member), ?,?,?) " ;  //prepareStatement니깐 ? ?  ? 바인딩을 해준다. 
				pstmt = conn.prepareStatement(sql);
//				pstmt.setString(1, "원석"); //Oracle에서 작은따옴표가 필요하잖아? 근데 setString은 자동으로 작은따옴표를 추가시킴 // int형은 자동으로 안붙임 
//				pstmt.setString(2, "ys@naver.com");
//				pstmt.setString(3, "010-2222-3333");
				pstmt.setString(1, insertM.getName());
				pstmt.setString(2, insertM.getEmail());
				pstmt.setString(3, insertM.getPhone());
				
				//rs = pstmt.executeUpdate();  // executeUpdate가 int타입을 받으니깐  
				cnt = pstmt.executeUpdate();	//다시 인트형을 반환하니깐 메소드에 void가 아니라 int형 
				System.out.println( cnt + "건이 추가되었습니다 ");	
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return cnt;
		}
		// 수정 
		public int updateMember(Member updateM) {	
			//태화 : 이거 타입이 int 형인데 void로 해도 상관없음 이유는 cnt를 하는 이유가 TestMain에서 몇건이 수정되었습니다를 잡으려고 하는건데
			//태화 :  나는 이미 여기서 cnt 로 몇건이 수정되었습니다를 출력한거니깐 상관없네 ㅋㅋㅋㅋ
			//태화 : int->void로 바꾸고 return 빼면 끝 
			int cnt = 0 ;
			try {
				//String sql = " update member set mname = ' " + updateM.getName() + "', "+ "email = '" + updateM.getEmail() + "'," +"phone='" +updateM.getPhone()+"' where mid = "+updateM.getMid() ;  //
				// 태화 : ? 물음표로 받아야함 . 
				String sql = " update member set mname = ? , email = ? ,phone=?  where mid = "+updateM.getMid() ;  //?물음표로 받아야함 .
				pstmt = conn.prepareCall(sql);
				//pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, updateM.getName());// 물음표와 setString은 세트지 
				pstmt.setString(2, updateM.getEmail());
				pstmt.setString(3, updateM.getPhone());
				cnt = pstmt.executeUpdate();
				System.out.println( cnt + "건이 수정되었습니다. ");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return cnt;
		}
		// 삭제
		public int delMember(Member delM) {
			int cnt = 0;
			try {
				String sql = "delete from member where mid = ? "; 
				//String sql = "delete from member where mid =" + delM.getMid();
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, delM.getMid());
				cnt=pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return cnt;
		}
		// 개인조회 (태화)
		public Member displayMember(int search_mid) {
			Member m = null;
			try {
				//String sql = " select * from member where mid = "+search_mid;  //이렇게는 안되냐 ? 
				String sql = "select M.MID, M.MNAME, M.EMAIL, ML.MLEVEL FROM MEMBER M JOIN MEMBERLEVEL ML on m.point between ml.lopoint and ml.hipoint where mid =  ?";
				
				System.out.println(sql);
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, search_mid);
				rs = pstmt.executeQuery(); //rs가 있어서 받아야함 ㅋㅋㅋ
				// pstmt.executeUpdate(); 이거는 시발 ㅡㅡ 수정삭제뭐 그거잖아 ..
				if(rs.next()) {
					int mid = rs.getInt(1);
					String name = rs.getString(2);
					String email = rs.getString(3);
					String mlevel  = rs.getString(4);
					
					m = new Member(mid,name,email,mlevel);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return m;	
		}
		// 개인조회 생성자(선생님)
		// 개인조회 Mid로 조회한 멤버 개인 정보  
		public Member getMember(Member selM) {
			Member mem =null;
			
			
			try {
				String sql = " SELECT MID,MNAME,EMAIL,PHONE, MLEVEL,POINT, TO_CHAR(RDATE,'YYYY-MM-DD HH24:MI:SS DAY')RDATE FROM MEMBER M JOIN MEMBERLEVEL ML ON M.POINT BETWEEN ML.LOPOINT AND ML.HIPOINT WHERE MID = ? ORDER BY M.MID ASC";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, selM.getMid());
				rs = pstmt.executeQuery();
				if ( rs.next()) {
					int mid = rs.getInt(1);
					String name = rs.getString(2);
					String email = rs.getString(3);
					String phone = rs.getString(4);
					String mlevel = rs.getString(5);
					int point = rs.getInt(6);
					String rdate = rs.getString(7);
					
					
					mem = new Member(mid, name, email, phone, mlevel, point, rdate);
							
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return mem;
		}
}
