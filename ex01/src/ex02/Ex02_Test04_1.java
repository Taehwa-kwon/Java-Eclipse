package ex02;

import java.util.Calendar;
import java.util.Scanner;

public class Ex02_Test04_1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);	
	//변수선언
	 int number; 
	 String name;
	 boolean adult; 
	 int birthyear =0 ,thisYear , age=0;
	 double kor = 0.0,eng = 0.0 , tot=0.0;
	 String grade= "";
	 double result =0.0 ;
	 
	 Calendar calendar = Calendar.getInstance();
	  thisYear = calendar.get(Calendar.YEAR);
	 System.out.println(thisYear);
	
	//입력 
	 System.out.println("번호");
	 number = sc.nextInt();
	 System.out.println("이름");
	 name = sc.next();
	 System.out.println("나이");
	 age = sc.nextInt();
	 
	 System.out.println("kor");
	 kor = sc.nextDouble();
	 System.out.println("eng");
	 eng = sc.nextDouble();
	 
	//프로세스
	 
	 tot = kor + eng ;
	 result = tot/3;
	 age = thisYear-birthyear + 1 ;
	 adult = (age > 19)? true : false;
	 if( result >= 90) 
		 grade = "A" ;
	 	else 
		 if( result >=80) 
			 grade = "B";
		 else grade = "C";
	
	//출력
	 System.out.println("번호는 " + number );
	 System.out.println("이름 " + name );
	 System.out.println("나이 " + age );
	 System.out.println("성인유/무 " + adult );
	 System.out.println("국어점수 " + kor );
	 System.out.println("영어점수 " + eng );
	 System.out.println("총점" + tot );
	 System.out.println("등급" + grade );
	 System.out.println("합계 " + result );
	}
}
