package ex07;

//인터페이스를 활용한 다중상속 구현
//자바 클래스는 다중상속 불가능한데 자바 인터페이스는 가능

// 1.class + interface

interface Racoon {
	public void dig();
}

class Duck {
	public void swim() {
		System.out.println("헤엄을 칩니다");
	}
}

//class Racoon{
//	public void dick() {
//		System.out.println("땅을 팝니다");
//	}
//}

class DuckRacoon extends Duck implements Racoon {		
	
	@Override
	public void dig() {
		System.out.println("땅을 판다");
		
	}		
	
}

// 2.interface + interface




public class TestMain {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();
		
		
		
	}

}
