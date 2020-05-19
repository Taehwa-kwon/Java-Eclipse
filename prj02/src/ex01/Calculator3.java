package ex01;
	class Calculator3_1{
		// sum 이라는 메소드는 static 이라는 키워드를 달게되면 클래스 소속의 메소드가 된다. 
		//클래스 소속의 메소드에 int left, int right 를 준다.
		//클래스에 직접적으로 접근해서 값을 사용할 수 있다.
		public static void sum(int left, int right) { 
			System.out.println(left+right);			
		}											
		
		public static void avg(int left, int right) {
			System.out.println((left+right)/2);
		}
	}

public class Calculator3 {

	public static void main(String[] args) {
		Calculator3_1.sum(10,20);// 여기서는 인스턴스가 존재하지 않고 클래스 에 접근해서 메소드를 호출하고 있다.
		Calculator3_1.avg(10,20);

		Calculator3_1.sum(20,40);
		Calculator3_1.avg(20,40);

		
	}

}

// 클래스 소속으로 만드는 이유는 메모리를 절약할수 있고 1회용으로 사용가능 
// 인스턴스 new 를 하는 이유는 여러가지 
