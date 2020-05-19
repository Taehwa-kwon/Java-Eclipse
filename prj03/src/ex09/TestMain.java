package ex09;
//cat 정보

public class TestMain { // 이게 실행 클래스
	
//==========================설명 ==================================//	
// 첫번째 줄은 Cat라는 클래스를 만들고 Cat이라는 생성자를 만들어 인스턴스화 해서 cat1에 저장한다.
// 두번째, 세번째 줄은 바로 인스턴스에 값을 지정한다.
// 네번째 다섯번째
// 
	public static void main(String[] args) {
		Cat cat1 = new Cat ();
		cat1.name ="야옹이 " ; //클래스의 변수를 바로 입력
		cat1.age = 4;
		cat1.eat("물고기"); //
		cat1.meow();
		
		Cat cat2 = new Cat ();
		cat2.name ="몽실이 " ; //클래스의 변수를 바로 입력
		cat2.age = 2;
		cat2.eat("멸치"); //
		cat2.meow();

		
		Dog dog = new Dog ();
		dog.name = "바둑이";
		dog.age = 3;
		dog.eat("개껌");
		dog.bark();
		
		Cow cow = new Cow ();
		cow.name = "얼룩이";
		cow.age = 7;
		System.out.println(cow);
		cow.eat("풀");
		cow.moo();
		
		
	}

}
