//import java.util.Scanner;
//Scanner sc = new Scanner(System.in);
//free=sc.next();

package ex02;

import java.util.Scanner;

public class Ex02_Test02_1 {

		public static void main(String[] args) {
				//키보드로 data 를 입력받는다.
				
				//입력받을 준비
				
		Scanner sc = new Scanner(System.in);  
//reference 타입은 앞에 new를 넣어서 저장
//( String 도 reference 타입이다. 그래서 원래는 String name = new String("Rambo") 
//  Scanner sc = Scanner 일반 value 타입은 이렇게 넣는다.			
// Primitive Type 기본형 = >  byte, short, int, long, char, float, double, boolean,
// Reference type 참조형
				
				//stdin 키보드
				//stdout 모니터
				//stdnax 보조기억장치
				//stderr 에러-모니터
				//stdprl 프린터
						
		
		String name;
		int age;
		int score;
		
		
		System.out.println("이름");
		name = sc.next();//nextLine
		System.out.println("나이");
		age  = sc.nextInt();
		System.out.println("점수");
		score= sc.nextInt();
		
		String result = ""; //빈문자열 (empty)
		
		if ( score >= 60)
			result = "Pass";
		else
			result = "fail";
		
		
		System.out.println("당신의 이름은 " + name + "이고" );
		System.out.println("당신의 나이는 " + age + "살 입니다");
		System.out.println("당신의 성적은 " + score + result + "입니다");
		
				
		}				
				
}
