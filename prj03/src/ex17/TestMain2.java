package ex17;
//java 는 다중상속이 되나?
//답은 안된다  extends 는 안되지만 emplements 로 구현은 할수 있다.
//extends 는 한개만 가능하다. 

interface Duck {
	public void swim();

}
interface Racoon {
	public void dig();
}

class DuckRacoon implements Duck, Racoon {

	@Override
	public void dig() {
		System.out.println("땅파기");
		
	}

	@Override
	public void swim() {
		System.out.println("어푸어푸");
		
	}
	
}

public class TestMain2 {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();
		
	}

}
