package 매개변수;

import java.util.Scanner;

public class Practice1 {
	//필드
	static String name;
	static int kor,eng,mat,tot;
	static double avg;

	public static void main(String[] args) {
	input();
	process();
	output();
	}

	private static void input() {
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
		tot = kor+eng+mat;
		avg = round(tot/3.0);
		
	}

	private static double round(double d) {
		double A;
		A=(int) (d+0.5);
		
		return A;
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
