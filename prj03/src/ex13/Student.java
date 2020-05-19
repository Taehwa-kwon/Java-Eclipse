package ex13;
//한사람의 정보를 찍는 공간
public class Student {
	// fields
	private String name;
	private String tel;
	private int bYear;
	
	
	//Getter  : readonly 속성 -읽기만 함  
	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
	
	public int getbYear() {
		return bYear;
	}
		
	//Constructor 
	public Student () {}
	public Student(String name, String tel, int bYear) {
		this.name = name;
		this.tel = tel;
		this.bYear = bYear;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", tel=" + tel + ", bYear=" + bYear + "]";
	}

}
