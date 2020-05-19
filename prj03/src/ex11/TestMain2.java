package ex11;

public class TestMain2 {

	public static void main(String[] args) {
		Professor p1 = new Professor();  // 이게 기본생성자를 받음 Professor 5행 !
		p1.setName("쯔위");
		p1.info();
		
		p1 = null;
		if(p1 != null) p1.info(); 
//중요한 오류 NullPointerException !! -> 
//이 의미는 p1.info(); .앞에가 null이다  // 
		

	}

}
