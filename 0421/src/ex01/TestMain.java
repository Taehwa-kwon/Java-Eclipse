package ex01;

class Apple {}
class Banana {}

class Box { 
	 Object fruit; 				//Object 타입은 모든타입을 다 받으려는 용도
	 							// 박스안의 박스(아무과일이나 타입도 아무거나 다 받을수 있다)
	 
}
public class TestMain {

//제너릭 사용 안하기
	public static void main(String[] args) {
		Box box = new Box();
		Apple redApple = new Apple ();
		Banana yellowBanana = new Banana();
		//박스에 저장
		box.fruit = redApple;			//과일담는 박스안에 레드애플을 넣는다.
		box.fruit = yellowBanana;
		//박스에서 꺼내기
		Apple apple1 = (Apple)box.fruit;		//fruit는 object 타입이고 꺼내서 Apple로 넣으려면 타입변환을 꼭 해야한다. (문제점 하나)
												// 부모를 자식으로 넣을순 없지 .. 그래서 타입변환!
		
		
		box.fruit = "썩은 과일";					//
		String str = (String)box.fruit;			// 
		System.out.println(str);				//설령 이게 되더라도 이건 문법적으로,기능상으로 말도 안되는것 

	}

}
