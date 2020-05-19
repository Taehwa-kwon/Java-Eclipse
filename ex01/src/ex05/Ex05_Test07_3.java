package ex05;

//배열의 문제를 해결해보자. 배열의 값은 여러개이니깐 어떻게 다가져올수있을까? 정답! 아래!

public class Ex05_Test07_3 {

	public static void main(String[] args) {
		
		
		
		int a= 7;
		System.out.println("main1():" + a);
		fun1(a);
		System.out.println("main2():" + a);
		
		int [] arr= new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		System.out.println("배열처리");
		System.out.printf("%d %d %d\n" , arr[0],arr[1],arr[2]);
		double_array (arr); //던지기
		System.out.printf("%d %d %d\n" , arr[0],arr[1],arr[2]);
	}
	private static void double_array(int [] arr) {  //받기 
		arr [0] = arr[0] * 3;		
		arr [1] = arr[1] * 3;		
		arr [2] = arr[2] * 3;		
	}
//a를 꺼내오고싶다. 근데 main 이랑 fun1이랑은 다른 집이니깐 main한테 a를 달라고 해야함   첫번째! main안에서 다른함수한테  a를 줄께 =fun1(a);
	//두번째  private static void fun1(int a) ok! a 받을꼐 
	
	private static void fun1(int a) {
		System.out.println("func1():"+a);
		a= a*3;  //21이지? 그다음에 main으로 보내는데 func1 의 데이터를 모두 없앤다. 
		System.out.println("func2():"+a);
		
	}

}

