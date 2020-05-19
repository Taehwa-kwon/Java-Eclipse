package sort;

public class Student {
	// fields
	private String   name;
	private String   tel;
	private int      inYear;
		
	public String getName() {	//2.getName() 메소드로 반환한다
		return name;			//1.name이라는 필드값을 가져와서
	}
	public String getTel() {
		return tel;
	}
	public int getInYear() {
		return inYear;
	}
	// Constructor
	public Student() {}
	public Student(String name, String tel, int inYear) {
		this.name = name;
		this.tel = tel;
		this.inYear = inYear;
	}
	
	@Override
	public String toString() {
		String msg = "이름:" + this.name;
		msg += ", 전화:"     + this.tel;
		msg += ", 입학연도:"  + this.inYear;
		return msg;
	}
	
	
}
