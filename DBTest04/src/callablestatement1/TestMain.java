package callablestatement;

import java.util.List;

public class TestMain {
	
	//PL/SQL  (Procedural Language) 안에 
	//1. Anonymous procedure 이릅없는 PL/SQL문 
	//2. 프로시저(Stored Procedure) 각 프로그램 별로 이름을 가지고 데이터베이스에 저장되어 사용되며, 인자를 받아서 호출/실행
	//3. 함수  각 프로그램 별로 이름을 가지고 데이터베이스에 저장되어 사용되며, 인자를 받아서 호출/실행되며 !! 그 결과를 반환 
	//4. 패키지
	//5. 트리거 
	
	
	// 커서란 ? 오라클에서는 SQL문을 커서 단위로 처리한다. 근데 한 문장의 경우 실행결과 암시적 커서에 저장되서 암시적 커서라고 하는데
	// SQL문을 수행한 후 얻어지는 행이 여러 개일 경우에는 명시적 커서를 사용해야한다.  https://whdvy777.tistory.com/entry/%EC%98%A4%EB%9D%BC%ED%81%B4-%EC%BB%A4%EC%84%9CCURSOR?category=416655
	

	public static void main(String[] args) {
		String uid = "sky1";
		
		MemberDao dao = new MemberDao(); //DB연결하는 클래스 
		MemberVO vo = new MemberVO(uid,"태화","th@nate.com","1234","010-6565-6581"); //생성자 클래스 
		
		//dao.addMember(vo);
		int insertCnt = dao.addMember(vo);
		System.out.println(insertCnt+"건이 추가 되었습니다. ");
		
		// 'sky1' 을 조회하기 
		MemberVO selMem = dao.getMember(uid);
		if(selMem==null) 
			System.out.println("자료없음");
		else 
			System.out.println(selMem.info());
		System.out.println("한 사람의 정보를 조회한다.");
		
		//수정
		MemberVO updateMem = dao.updateMember(uid);
		
		
		
		//삭제
		int aftcnt = dao.delMember(uid);
		
		
		
		// 전체 조회 : cursor 사용
		List<MemberVO>  list = dao.getMemberList();
		for (MemberVO memberVO : list) {
			System.out.println( memberVO.listInfo() );
			
		dao.close();
		
		}
	}
}
