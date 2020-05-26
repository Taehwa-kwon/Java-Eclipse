package preparedstatement;

import java.util.List;

public class TestMain {
	//package-private-
	
	private static DBHandler db; //여기안에서만 쓰니깐 private 레벨로 
	
	public static void main(String[] args) {
		db = new DBHandler();
		//전체 목록
		displayMemberList();

		//추가
//		Member insertM = new Member("아름","ar@naver.com","010-2345-6789");
//		db.addMember(insertM);
//		displayMemberList();
		
		// 수정
//		Member updateM = new Member("태화","taehwa@naver.com","010-6565-6581",10);
//		db.updateMember(updateM);
//		displayMemberList();
		
		// 삭제
//		Member delM = new Member(10);
//		db.delMember(delM);
//		displayMemberList();
		// 태화 : 그러면 매개변수가 3개로 추가,수정 모두  중복될 경우 어떻게 해결할 것인가? 생성자 2개 중복은 불가능이잖아. 
		// 태화 : 해결책 : 생성자에 public Member(String name, String email, String phone,  int A ) 맨 뒤에 옵션 1,2를 주는식으로 
//					if ( A = 1 ) { } 		if( A=2 ) { }     뭐 이렇게 하라는데  잘 모르겠네 어떻게 해결해야할지..  
		
		// 개인조회 생성자(선생님)
		// 개인조회 :번호 입력받아서 출력 
//		int search_id = 1;
//		Member selM = new Member(search_id);
//		Member selectedM =db.getMember(selM);  //이렇게 Member 객체를 넘겨줘도 되는데 이러면 생성자를 또 만들어야 되네 ??   
//		System.out.println("조회된(객체) Member");
//			if( selectedM !=null ) 
//				System.out.println(selectedM.info());
//			else 
//				System.out.println( search_id + "번 자료는 없습니다.");
//		System.out.println(selectedM.info());
		
		// 개인조회 (태화)
		int search_mid = 1;
		db.displayMember(search_mid);
		System.out.println("==================");
		System.out.println(db.displayMember(search_mid));
		System.out.println(search_mid);
		
		
		
		db.close();
		
	}



	private static void displayMemberList() {
		// 목록 조회 
		List<Member>mlist = db.getMemberList();
		System.out.println("========================");
		for (Member member : mlist) {
			System.out.println(member.listinfo());
		}
		
	}
}
