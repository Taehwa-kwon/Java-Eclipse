package ex11;

public class TestMain3 {

	public static void main(String[] args) {
		Professor p1 = new Professor ("아이유","010-1234-5678");
		((Person)p1).info();
		p1.info();
		p1.teaching();
		
		Professor p2 = new Professor("김교수", "010-1234-1234", "java");
		p2.info();
		p2.teaching();
	}

}
