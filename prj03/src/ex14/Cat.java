package ex14;

public class Cat extends Animal  {
	
	public void climb() {
		System.out.println(name + "가 켓 타워를 올라 갑니다.");
	}

	@Override
	public void cry() {
		System.out.println(name + "가 짖습니다. 야~옹");


	}

}
