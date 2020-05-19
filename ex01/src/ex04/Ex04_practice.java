package ex04;

import java.util.Scanner;

public class Ex04_practice {

	static String name;
	static double kor, eng, mat, tot;
	static double avg;
	
	public static void main(String[] args) {
	
		input();
		process();
		output();
		
	}

	private static void output() {
		System.out.println("이름"+  name );
		System.out.println("총점:"+ tot);
		System.out.println("평균:"+ avg);
		
	}

	private static void process() {
		tot = kor + eng + mat;
		avg = round(tot/3.0);
		
	}

	private static double round(double d) {
		double val=0;
		val = (d+0.5);
		return val;
	}

	private static void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("이름: ");
		name = in.next();
		System.out.println("국어 점수 : ");
		kor = in.nextDouble();
		
		System.out.println("수학 점수 : ");
		mat = in.nextDouble();
	
		System.out.println("영어 점수 : ");
		eng = in.nextDouble();
		
	}  
	
	
  
}  
