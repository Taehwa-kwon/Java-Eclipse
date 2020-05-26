//지역선언  1:서울 2:부산 3:인천 4:대전 5:대구 6:광주 7:제주
package ex02;

import java.util.Scanner;

public class Ex02_Test04_2 {


	public static void main(String[] args) {
		//======================================변수선언=====================================  //		
		int number =0 ;
		String name = "";
		int birthYear = 0, thisYear=2020, age=0;
		boolean adult;
		int kor,eng,mat;
		int tot=0, avg=0;
		char grade =' ';
		//================================================================================  //
		
		
		//======================================input=====================================  //
		// 						지역선언  1:서울 2:부산 3:인천 4:대전 5:대구 6:광주 7:제주  					//
		Scanner in = new Scanner(System.in);
		
		System.out.println("당신의 번호를 입력하시오 : ");
		number = in.nextInt();
		System.out.println("당신의 이름을 입력하시오 : ");
		name = in.next();
		System.out.println("당신이 태어난 연도를 입력하시오");
		birthYear = in.nextInt();
		System.out.println("당신의 출생지를 입력하시오");
		System.out.println("1.서울 2.부산 3.인천 4.대전 5.대구 6광주 7.제주\n");
		int sido = in.nextInt();
		
		System.out.println("국어점수=");
		kor = in.nextInt();
		System.out.println("영어점수=");
		eng = in.nextInt();
		System.out.println("수학점수=");
		mat = in.nextInt();

		//===============================================================================  //
		
		//======================================Process=====================================  //
		
		String address = "";
		switch(sido) {
		case 1 : address="서울"; break;
		case 2 : address="부산"; break;
		case 3 : address="인천"; break;
		case 4 : address="대전"; break;
		case 5 : address="대구"; break;
		case 6 : address="광주"; break;
		case 7 : address="제주"; break;
		default : address="제3의 지역" ; break;
		}
		
		age = thisYear-birthYear+1;
		
		adult=(age>=19)? true : false ;//불린타입이니깐 true false로만 반환받음 
		
		
		//총점
		tot=kor + eng + mat ;

		//평균
		avg = tot / 3;

		//등급
		if ( 90 <= avg && avg <= 100 ) 
			grade = 'A' ;
		else 
			if( 80 <= avg && avg < 90 )
				grade = 'B';
			else
				if(70<=avg && avg <80)
					grade = 'C';
				else
					if(60<=avg && avg <70)
						grade ='D';
					else
						grade = 'F';

		//=====================================output=====================================  //
		System.out.println("번호" + number);
		System.out.println("이름" + name);
		System.out.println("주소" + address);
		System.out.println("나이" + age);
		System.out.println("성인" + adult);
		System.out.println("총점" + tot);
		System.out.println("평균" + avg);
		System.out.println("등급" + grade);
			}
		}

