package ex11;

public class  Professor extends Person {  //Person 을 상속받는다. 
	//필드
	private String subject;
	
	// 생성자
	public Professor() {}
	public Professor(String name, String tel) {	
		//name = name; //원래 7~8행에 this 하려고 했는데 Person 이 지금 private 방식이니깐 해결하려고 부모생성자를 호출한다.
		//tel = tel;
		
		//부모생성자 호출
		super (name,tel); // 부모생성자를 호출하기 위해서 super 을 한다. (3행에 professor 이 this  person이 super ) presone 의 36행의 역할이 있다
	}
	public Professor(String name, String tel, String subject) {
		super (name,tel); 
		this.subject = subject;
	
	}
	
	//메소드
	
	public void teaching () {
		System.out.println( getName()+"교수님이 "+ subject + "가르치고 있습니다.");
	}
	
	@Override
	public void info() {
		super.info(); //기존에 있던 네임과 tel 정보를 쓰기위함
		System.out.println("과목: " + this.subject);
		
	}
	
}
