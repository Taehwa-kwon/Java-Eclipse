package Switch문;

import java.util.Scanner;

public class Practice3 {
	
	static double avg ;
	public static void main(String[] args) {
	
		char  [] score  = { 'F' , 'F', 'F', 'F', 'F', 'D', 'C', 'B', 'A', 'A' };
		int kor,eng,mat;
		int tot = 0;
		
		Scanner in = new Scanner(System.in);
		kor = in.nextInt();
		eng = in.nextInt();
		mat = in.nextInt();
		
		cal(kor,eng,mat);//주의할 점이 이 전체를 넘겨주고 
		System.out.println(cal(kor,eng,mat)); // 이 전체를 출력해야 정확한 값이 나온다.
		
		tot = cal(kor,eng,mat);
		avg = round(tot/3);
		System.out.println(avg);
		
		
		char A = score[(int) (avg/10)];
		System.out.println(A);
		
	}


	private static double round(int i) {
		int val = 0;
		val = (int) (i+0.5);
		return val;
	}


	private static int avg(int i) {
		int avg = (int)(i+0.5);
		return avg;
	}


	private static int cal(int kor, int eng, int mat) {
		int tot = kor+eng+mat;
		System.out.println(tot);
		return tot;
		
	}

}
