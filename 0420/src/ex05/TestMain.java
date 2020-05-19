package ex05;

class Member {
	private String id;
	
	public Member(String id) {
		this.id=id;
	}

	
	// 추 가 override/implement Method
	
	@Override		//이건 중복되지 말아야 되는 필드값을 비교하는 것. 원래는 equals는 주소비교인데 String은 예외로 문자열 비교가 가능하다.
	
	public boolean equals(Object obj) {			//System.out.println(m2.equals(m3)); 여기서 m2는 this 가 되고 m3는 obj가 됌
												// equals는 obj의 자식이다 .그래서 아래와 같은걸 무조건 해야함
		
			if(obj instanceof Member) {			//member은 dog와 같고 object 는 animal인 개념  //obj가 member 의 자식이냐??
				Member member = (Member) obj; 	//자식이라면 바꿔라..member로 바꿔라 
				if(this.id.equals(member.id))			//문자열 비교 
					return true;
					else
					return false;
			}
		return super.equals(obj);	//주소비교
	}
	
	
}

public class TestMain {

	public static void main(String[] args) {
		// 값 비교
		String name1 = "이순신";
		String name2 = "이순신";

		System.out.println(name1==name2);			// 주소를 비교하는 것 ..그렇지만 같은 이유는 자바는 똑같은 문자를 만들어 놓을경우 같은 주소를 가짐.
		System.out.println(name1.equals(name2));	// String 값 비교
		
		String name3 = new String("이순신");
		String name4 = new String("이순신");
		
		System.out.println(name3==name4);			// 객체를 만들때는 힙에 name3 , name4 따로 만들어짐. 객체 생성 주소가 다르기 때문에
		System.out.println(name3.equals(name4));			//!!!이거
													// equals메소드는  재정의 하지 않으면 주소를 비교
													// 객체의 인스턴스를 비교하려면 equals() 값을 비교하도록 재정의 해야한다.
													// String의 경우에는 값을 비교하기 위해서 재정의 되어있다 (String 만 특이 경우)
		//------------------------------------------------------------------------------------------------------------------//
		
		Member m1 = new Member("sky");
		Member m2 = new Member("blue");
		Member m3 = new Member("blue");				// 아이디는 중복되면 안됌 ..그래서 어떻게 해야하나..?
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		System.out.println(m1==m2);					// 주소 비교
		System.out.println(m2==m3);					// 주소 비교
		
		System.out.println(m1.equals(m2));			//
		System.out.println(m2.equals(m3));					//!!!이거 왜 다르지...??? 그것의 해결방법이 위에 추가를 보기 바람.
															//위에 추가가 있으면 위와 아래 값의 비교가 된다.
		
	}

}
