package emp;

import java.util.Scanner;

public class TestMain3 {
	
	final static int N= 5;
	
	//입력변수
	static String [] empid = new String[N];
	static String [] name = new String[N];
	static String [] hiredate = new String[N];
	static double [] sal = new double[N];
	static double [] comm = new double[N];
	static String [] deptid = new String[N];
	
	static String [] part_number = new String[N];
	static String [] part_name = new String[N];
	static String [] part_salary = new String[N];
	//출력 변수 
	static double [] pay = new double[N];
	static String [] deptname = new String[N];
	static int [] years = new int [N];
	static int [] payrank = new int [N];
	
	static int [] part_salary_avg = new int [N];
	static int [] salary_higer = new int [N];
	static int [] salary_lower = new int [N];
	
	
	
	public static void main(String[] args) {
	input();
	process();
	output();

	}

	private static void input() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("데이터를 입력");
		System.out.println("예) 사번: 이름: 입사일: 월급: 보너스: 부서번호  (추가정보: 공백없이 콤마로 구분하시오)");
		
		for (int i = 0; i < N; i++) {
			String str = in.next();
			
			in.nextLine();
			
			String [] token = str.split(",");
			
			empid[i] = token[0];
			name[i] = token[1];
			hiredate[i] = token[2];
			sal[i] = Double.valueOf(token[3]);
			comm[i] = Double.valueOf(token[3]);
			deptid[i] = token[4];
		}
		
	}
	
	private static void process() {
		for (int i = 0; i <N; i++) {
			switch(deptid[i]) {
			case "10" : deptname[i]="인사" ; break;
			}
			
		}
		
	}

	private static void output() {
		// TODO Auto-generated method stub
		
	}



	


	

}
