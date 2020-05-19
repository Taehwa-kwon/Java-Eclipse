package ex05;

class Member {

	String id;
	//밑에가 생성자
	public Member (String id) {
		this.id=id;
	}
	
}
//-------------------------------equals 재정의한 멤버--------------------------------------
	class Member2 {
		String id;

	public Member2(String id) {
		this.id=id;
	}
	@Override
	public boolean equals(Object obj) {
		Member2 mm = (Member2) obj;
		if ( this.id.equals(mm.id) )
			return true;
		else 
			return false;
	}
		
		}
	
//-------------------------------equals 재정의한 멤버--------------------------------------
public class TestMain {
	
	public static void main(String[] args) {
		String name1 = "이순신";
		String name2 = "이순신";
		System.out.println(name1==name2);		 // hashcode 비교 ( 주소비교 )
		System.out.println(name1.equals(name2)); // 문자열 비교 ( 값 비교 )
		
		Member m1 = new Member ("blue");
		Member m2 = new Member ("blue");
		Member m3 = new Member ("red");
		
		System.out.println(m1==m2); // hashcode 주소비교
		System.out.println(m1==m3); // hashcode 주소비교
		
		 //class 타입끼리의 비교 equals 는 재정의 하기 전까지 ==와 동일하다. 
		//hashcode의 비교
		System.out.println( m1.equals(m2)); // 값비교 false
		System.out.println( m1.equals(m3)); // 값비교 false
		//-------------------------equals 재정의를 통해 값비교---------------------------------------
		Member2 mm1 = new Member2("blue");
		Member2 mm2 = new Member2("blue");
		Member2 mm3 = new Member2("red");
		System.out.println( mm1.equals(mm2)); 
		System.out.println( mm1.equals(mm3)); 
	}

}
