package ex04;

import java.util.Scanner;

public class Ex04_Test02_1 {
	// 여기에 변수를 선언하는것은 아래 모두 사용하고 계속 활용하기 위함이다. 
	// for 문이 아래에 연속되어 사용되는 경우에는 그 해당 for문 에서만 사용하려고 하는거니깐 여기에 선언하면 안됌 
	static String name;
	static int kor, eng, mat;
	static int tot;
	static double avg;
	
	/* -----------------------main ------------------------------ */
	public static void main(String[] args) {

		input();
		process ();
		output ();
	}
	/* -----------------------input ------------------------------ */
	public static void input() {
		//		name = " 정연";   // 바로 주석처리 ctrl /
		//ctrl shift o 누르면 위에  import java.util.Scanner; 이게 바로 뜸
		Scanner in = new Scanner(System.in);  
		System.out.println("이름: ");
		name = in.next();
		System.out.println("국어 점수 : ");
		kor = in.nextInt();
		System.out.println("영어 점수 : ");
		eng = in.nextInt();
		System.out.println("수학 점수 : ");
		mat = in.nextInt();
		
	}
	public static void process() {
		tot = kor + eng + mat;
		//avg=(kor+eng+ mat) /3;
		//첫번째 방법avg = (int)((double) tot / 3.0 + 0.5) ;   //반올림 하기 위한 절차  0.5를 더 하고 double 선언하고 전체를 int로 뽑아낸다.
		//avg = Math.round  // avg = Math.round (정수 혹은 실수값을 넣으면 그 값을 avg에 반환한다) double과 int가 가능하다 .
		avg = round( tot/ 3.0);
	}
	public static int round (double num) {
		int val = 0;
		val = (int)(num + 0.5);
		return val;
}
	
		// 1. round ( tot/ 3.0 )와 아래의 round (double num) 과 실수로 맞춰주고 -> 다시 val = (int) (num + 0.5) 
	
	
	
	
	/* -----------------------output ------------------------------ */
		public static void output() {
			System.out.println("이름"+  name );
			System.out.println("총점:"+ tot);
			System.out.println("평균:"+ avg);
	}

}

		/*
		 <img src="" width="" width ="" > Attribute
		class { property 변수속성  method 함수집합 }
		*/