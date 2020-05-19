package ex03;

//멤버 클래스!!!!!!!!!!!!!!!

class Member {
	//필드 
	
	private String id; 
	private String name; 
	private String password;
	private int age;
	private boolean adult ;
	
	// 두 번쨰 방법 getter // setter 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		if(age>19)
			this.adult = true ;
		else 
			this.adult = false;
	}
	//boolean 인 경우 is로 바꿔줌 
	public boolean isAdult() {
		return adult;
	}

	//이건 필요없다 . 
	//public void setAdult(boolean adult) {
	//	this.adult = adult;
	//}
	
	
	//생성자 alt shift s generate constructor using fields 
	//생성자의 역할은 첫 번쨰 방법 데이터 타입 private 인것의 값을 입력하게 해줌
	public Member () {}
	public Member(String id, String name, String password, int age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		if(age>19)
			this.adult = true;
		else 
			this.adult = false;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + ", adult=" + adult
				+ "]";
	}
	
	
	
}

public class TestMain {

	public static void main(String[] args) {
		Member m1 = new Member("1", "세종대왕", "123456789", 27);
		System.out.println(m1);
		Member m2 = new Member("2", "이순신", "123456789", 20);
		System.out.println(m2);
		
		
		//Member m3 = new Member("1", "세종대왕", "123456789", 27);
		//이거는 복사가 아니다
		
		//객체 복사 방법 .. 설명  복사는 m1의 나이가 바뀌나 안바뀌나 안바뀌어야함.
		System.out.println("M3 나이 ");
		Member m3 = m1;
		System.out.println(m3);
		
		System.out.println("m1나이가 바뀜 ");
		m1.setAge(17);
		
		System.out.println(m1);
		System.out.println("m1나이 바뀐후 m3 의 나이는 ");
		System.out.println(m3);
		//Member m2 = new Member
		//m1.setAge(14);
		
		//객체 복사 ! !  ! shallow copy 얕은 복사
		Member_copy(m2,m3);
		System.out.println("m2를 카피한 m3 : ");
		System.out.println(m3);
		
		// deap copy . 좀 더 깊은 복사
		Member m4 = member_deepcopy(m2);
	}
	
	
	private static Member member_deepcopy(Member src) { // 중요한게 void 가 아니라 Member 임 
		Member dest = new Member(); 
		dest.setId( src.getId() );   
		dest.setName( src.getName());
		dest.setPassword(src.getPassword() );
		dest.setAge( src.getAge());
	
		return dest ;
	}

	private static void Member_copy(Member src, Member dest) {
		dest.setId( src.getId() ); // m2.id <= m1.id 를 넣은것 // dest.id <= src.id 를 넣은것  
		dest.setName( src.getName());
		dest.setPassword(src.getPassword() );
		dest.setAge( src.getAge());
	}

}
