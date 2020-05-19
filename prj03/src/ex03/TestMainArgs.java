//======================================연습횟수=====================================  //
// 2월 23일 토요일 1 2 번 연습 
package ex03;

import java.util.Arrays;

//======================================key point=====================================  //
// main에서 parament 값이 3개 5개 나눠져 있다. 각각의 메소드를 한번에 계산하고 싶으면 argument에 ...을 붙힌다.
// ...와 [] 의 차이점은 []은 둘다 배열형식  ...은 개수 수정이 가능하다. 
// 또한 add메소드내에서 argument v 는 main에서 소수점으로 던져줬다.
public class TestMainArgs {
	
	public static void main(String[] args) {

		double r1 = add(1.0,2.0,3.0);
		System.out.println(r1);
		
		double r2 = add(1.0,2.0,3.0,4.0,5.0);
		System.out.println(r2);
		
		int [] r3 = {1,2,3};
		Cal(r3);
		System.out.println(Arrays.toString(r3));
		
		char [] r4 = {'A','B'};
		System.out.println(r4);
	}
	
	public static double add(double ... v) {  // ...가 가변인수 그래서 main에서 인수가 3개 5개에 갯수에 맞춰서 생성됌
		//...와 [] 의 차이점은 []은 던지고 받는사람 모두 배열형식 ...는 인수갯수가 수정이 가능.!
		double sum=0.0;
		for (int i=0; i<v.length;i++) {
			sum +=v[i];
		}
		return sum;
		
	}
	
	public static int[] Cal(int... x) {
		
		
		return x;
		
	}

	// 가변인자  : Paramiter 의 갯수가 유동적
	
	/*
	public static double add (double a1, double a2, double a3) {
		double sum = 0.0 ;
		sum = a1 + a2+ a3;
		return sum;	
	}
	public static int add (int a1, int a2, int a3) {
		int sum = 0 ;
		sum = a1 + a2+ a3;
		return sum;	
	}
	 
	
	public static void main(String[] args) {
		double n1 = add(1.0,2.0,3.0);
		System.out.println(n1);
		int n2 = add(2,3,4);
		System.out.println(n2);
		int n3 = add( 5, 7);
		

	}
	이렇게 만들면 맨밑에 add(5,7)두개를 났을 때 오류가 난다*/
}
