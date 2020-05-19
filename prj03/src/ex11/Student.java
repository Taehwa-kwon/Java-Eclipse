package ex11;

public class Student extends Person {
	
	private int jumsu;
	
	//기본생성자
	public Student() {}
	public Student(String name, String tel, int jumsu) {
		super(name,tel);
		this.jumsu = jumsu;
	}
	
	public void testing() {
		System.out.println(getName()+ "가 "+ jumsu + "점을 받았습니다.");
	}
	
	public void study() {
		System.out.println(getName()+ "가  공부중입니다.");
	}
	
	@Override 
	public void info() {
		super.info();
		System.out.println("점수: " + jumsu );
	}
	

}
