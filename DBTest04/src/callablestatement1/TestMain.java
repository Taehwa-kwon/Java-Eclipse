package callablestatement1;

public class TestMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		MemberVO vo = new MemberVO("sky2","민성","ms@nate.com","1234","010-2222-3333");
		
		dao.addMember(vo);
		int insertCnt = dao.addMember(vo);
		System.out.println(insertCnt+"건이 추가 되었습니다. ");
		
		// 'sky1' 을 조회하기 
		MemberVO selMem = dao.getMember("sky1");
		System.out.println(selMem.info() );
	}

}
