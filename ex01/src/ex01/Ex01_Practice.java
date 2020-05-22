

package ex01;

import java.util.Scanner;

public class Ex01_Practice {
	static String name;
	static int kor,eng,mat, tot;
	static double avg;
	

	public static void main(String[] args) {
	
		input();
		process();
		output();
	}
	
	private static void input() { //해당 메소드가 void 인데 값을 저장할수 있는 이유는 static 변수가 있어서 값을 저장할 수 있다. 
		Scanner in = new Scanner(System.in);
		System.out.println("이름 : ");
		name = in.next(); 
		System.out.println("국어 : ");
		kor = in.nextInt();
		System.out.println("영어 : ");
		eng = in.nextInt();
		System.out.println("수학 : ");
		mat = in.nextInt();
		

	}
	
	private static void process() {
		tot = kor +eng + mat;
		avg = round ( tot/3.0 );
		System.out.println("데이터를 출력한다");
	
		
	}
	
	private static double round(double d) {
		
		int val=0;
		val = (int) (d + 0.5);
		
		
		return val;
	}

	private static void output() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("합계 : " + tot);
		System.out.println("평균 : " + avg);
		
		
	}
	
}
	


		
		
	
