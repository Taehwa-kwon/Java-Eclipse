package ex15;

//인터페이스 확실히 이해하기! 사용법 , 개념 
/* https://opentutorials.org/module/2495/14142
 * 
 * interface inter {
 * public void z();
 * }
 * 
 * class A implements inter {
 * public void z() {}
 * }
 * 
 * 클래스 A 뒤의 implements Inter는 이 클래스가 인터페이스 Inter를 구현하고 있다는 의미다. 
 * 그것은  interface Inter의 맴버인 public void z() 메소드를 클래스 A가 반드시 포함하고 있어야 한다는 뜻이다.
 * 
 * 상속은  : 상위 클래스의 기능을 하위 클래스가 물려받는것 (extends사용)
 * 인터페이스 : 하위클래스에 특정한 메소드가 반드시 존재하도록 강요한다 ( implements사용) 
 */

public class TestMain{
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.name = "세바스찬";
		dog.cry();
		
		Cat cat = new Cat();
		cat.name = "야옹이";
		cat.cry();
		
		pet_action(cat);
		pet_action(dog);
	}
	
	private static void pet_action(IPet pet) {
		pet.cry();
	}
}
	


