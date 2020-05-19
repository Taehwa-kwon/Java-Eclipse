package ex07;

interface IDuck{
	void swim();
}
interface IRacoon{
	void dig();
}

class DuckRacoonTest implements IDuck, IRacoon {
	
	@Override
	public void dig() {
		System.out.println("땅을 판다");
	}	

	@Override
	public void swim() {
		System.out.println("헤엄을 친다");
	}
	
}

public class TestMain2 {
	
	
	public static void main(String[] args) {
		DuckRacoonTest dr = new DuckRacoonTest();
		dr.swim();
		dr.dig();
	}
}


