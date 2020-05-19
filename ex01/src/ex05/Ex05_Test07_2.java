package ex05;

//return 이 반환하는 값은 1개다. 

public class Ex05_Test07_2 {

	public static void main(String[] args) {
		int a= 7;
		int [] arr= new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		System.out.println("main1():" + a);
		a= fun1(a);
		System.out.println("main2():" + a);
	}
//a를 꺼내오고싶다. 근데 main 이랑 fun1이랑은 다른 집이니깐 main한테 a를 달라고 해야함   첫번째! main안에서 다른함수한테  a를 줄께 =fun1(a);
	//두번째  private static int fun1(int a) ok! a 받을꼐 
	
	private static int fun1(int a) {
		System.out.println("func1():"+a);
		a= a*3;  //21이지? 그다음에 main으로 보내는데 func1 의 데이터를 모두 없앤다. 
		System.out.println("func2():"+a);
		return a;
	}

}

