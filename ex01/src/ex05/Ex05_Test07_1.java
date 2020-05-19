package ex05;

//new 는 heap에 만들어 ! 그럼 main 에서 heap의 값주소를 main stack에 저장함 . 

public class Ex05_Test07_1 {

	public static void main(String[] args) {
		int a= 7;
		int [] arr= new int [3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		System.out.println("main1():" + a);
		fun1(a);
		System.out.println("main2():" + a);
	}
//a를 꺼내오고싶다. 근데 main 이랑 fun1이랑은 다른 집이니깐 main한테 a를 달라고 해야함  
//첫번째! main안에서 다른함수한테  a를 줄께 =fun1(a);
//두번째  private static void fun1(int a) ok! a 받을꼐 
	
	private static void fun1(int b) {
		System.out.println("func1():"+b);
		b= b*3;  
//21이지? 그 다음에 main으로 보내는데 결과값은 7이다. 이유는 func1 의 데이터를 모두 없앤다.
//+ 보충설명하면 void 는 기본타입이고 return 을 하지않는다 . 
//그래서 만약에 fun1 의 함수에 결과 값을 리턴하고 싶으면 void 를 int 로 바꾸고 return 을 b로 하고 
//System.out.println("main2():" + (fun1(a));이렇게 바꿔준다. 
		System.out.println("func2():"+b);
	}
}

