//3개의 데이터를 줄테니깐 +-*/ 4개의 계산한 값을 가져와보자  -- 정답! 아래 
package ex05;

public class Ex05_Test07_4 {

	public static void main(String[] args) {
		
		int num1 =10, num2=20, num3= 30;
		
		
		int [] v= func1(num1, num2, num3);  //return v; 을 받으려면 앞에 int []  
		
		System.out.println("all +  = " + v[0]);
		System.out.println("all -  = " + v[1]);
		System.out.println("all *  = " + v[2]);
		System.out.println("all /  = " + v[3]);
	}

	private static int [] func1(int num1, int num2, int num3) { //return v; 을 받으려면 void - > int [] 배열로 바꿔줘야함
		int [] v = new int[4]; 
		v[0] = num1 + num2 + num3; 
		v[1] = num1 - num2 - num3; 
		v[2] = num1 * num2 * num3; 
		v[3] = num1 / num2 / num3; 
		return v;
	}

}

