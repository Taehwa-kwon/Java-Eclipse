package ex01.generic01;

class Apple2 {}

class Melon{}

class newBox<T>{		//T타입만 받아라.
	T t; 				//T타입
						//
}

//제너릭
public class TestMain2 {
	public static void main(String[] args) {
		
		Apple2 greenApple = new Apple2();					//greanApple은 Apple2타입으로 만들고 아래에서는 Apple2타입으로만 받아야한다.이유는 <> 이 뜻은 apple2만 받는다는 뜻이니깐
		newBox<Apple2> box1 = new newBox<Apple2>();			//newBox에 greenApple 을 넣었다 . < >안에 타입자체가 전달되어서 T로 변환도기ㅗ  
		//박스에 담기
		box1.t = greenApple;
		//꺼내기
		Apple2 newApple = box1.t;
		
		newBox<String> box2 = new newBox<String>();		//이건 String 이니깐 newBox<T> 여기서 T = String 으로 자동으로 바뀜
		box2.t			="권태화";
		String name = box2.t;
		System.out.println(name);

		Melon melon = new Melon();
		newBox<Melon> box3  = new newBox<>();				//자바1.8버전 에서는 생략가능 . new 할떄 < > <--이거 
		box3.t = melon;
		Melon newMelon = box3.t;
		
		newBox<Integer> box4 = new newBox<>();
		box4.t=1234;
		int num1 = box4.t;
	}
}
