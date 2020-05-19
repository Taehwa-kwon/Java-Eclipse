package ex01.generic01;

class Apple  { }

class Box<Apple>{			//어떻게 보면 사과박스..
	Apple t;
}
class box2<Banana>{
	Banana b;
}


//제너릭 
public class TestMain {
	public static void main(String[] args) {
		Apple redApple = new Apple();
		Box<Apple> box = new Box<Apple>(); //너는 애플만 받아라..
		//과일넣기
		box.t = redApple;
		//꺼내기 
		Apple apple1 = box.t;
		
		
		
		//문제는 바나나를 넣으려면 ..
		//box.t = banana? 또다른 Box<Banana>를 만들어?
		//아니면 class box<banana>를 또만들어? 너무 복잡해
		
		//그래서 Main2 ㄱ
	}
}
