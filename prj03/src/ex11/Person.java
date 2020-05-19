package ex11;

public class Person {

	//Fields - 1.무조건 private 
	private String name;
	private String tel;
	
	//Getter 
	public String getName() { // getName
		return this.name;
		
	}
	
	public String getTel() {
		return tel;
	}
	
	//Setter 만들어진 객체의 값을 넣는것
	
	public void setName(String name) {
		this.name = name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	
	//Constructor  -2. 생성자. new할때 실행되는 명령
	public Person() {
		System.out.println("기본생성자 ");
	}
	
	public Person(String name, String tel) {     // TestMain의 10행 name 과 tel 을 받는다.
		this(); // 기본생성자 
		this.name=name; // {}를 기준으로 12행 public person 안에는 name 이고 3행  public class person 안에서 name은 this 를 붙여줌
		this.tel=tel; // this.name라고 하면 Fields 로 값을 보낸다.
	}
		//Method
		public void info() {
			System.out.println("이름: " + name );
			System.out.println("전화: " + tel);
			
		}
	
	

}
