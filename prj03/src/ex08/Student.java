package ex08;

public class Student {
	int num;
	String name;
	int jumsu1, jumsu2, jumsu3;
	
	public Student(int num, String name, int jumsu1) {
		this.num=num;
		this.name = name;
		this.jumsu1 = jumsu1;
	};
	
	public Student(int num, String name, int jumsu1,int jumsu2,int jumsu3) {
	
		this.num = num;
		this.name = name;
		this.jumsu1 = jumsu1;
		this.jumsu2 = jumsu2;
		this.jumsu3 = jumsu3;
	}
	
	public int getTot() {
		return jumsu1 + jumsu2 + jumsu3;
		
	}
	
	public int getAvg() {
		return getTot() /3;
		
	}
	
	public char getGrade() {
		char [] gr = {'F','F','F','F','F','F','E','D','C','B','A'};
		return gr[getAvg()/10];
	}

	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", jumsu1=" + jumsu1 + ", jumsu2=" + jumsu2 + ", jumsu3="
				+ jumsu3 + "]";
	}

	
}
