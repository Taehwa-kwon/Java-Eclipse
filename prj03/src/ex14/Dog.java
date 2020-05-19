package ex14;

public class Dog extends Animal  {
	
	public void swim() {
		System.out.println( name + "가 헤엄을 칩니다.");
	}

	@Override
	public void cry() {
		System.out.println(name + "가 짖는다. 왕 왕");


	}

}
