package ex05;

import java.util.Scanner;

public class Ex05_Test01_1 {

	public static void main(String[] args) {
		//======================================기본구성=====================================  //
		//띠를 구하는 프로그램
		// 소 호랑이 토끼 용 뱀 말 양 원숭이 닭 개 돼지 쥐 
		//5 6   7  8 9 10 11 12 1 2 3 4  
		
		//======================================변수선언=====================================  //
		int birthYear = 0; 
		String A = "";
		Scanner in = new Scanner(System.in);
		
		//====================================method구성=======================================  //
		// 여기서 A = getswitchInfo(birthYear)를 분석해보자 .											//
		// 	 				<<----------------이방향으로 분석한다.
		// 전체적인 흐름으로 본다면  메인과 아래 메소드들을 데이터를 공유할수 없다.
		// 그래서 메인안에서 getswitchInfo라는 자식에게 birthYear 값을 줄테니깐 답을 구해와서 A에게 넣어놔.
		
		birthYear = in.nextInt();
		
			A = getswitchInfo(birthYear); 
			System.out.println("switch를 이용한 " + A + "띠");
			
			
			A = getArrayInfo(birthYear);
			System.out.println("배열을 통한 " + A+ "띠");
				}
	
		//====================================메인 끝=======================================  //

		//=================================new method==================================  //
		//===========================여기서 파라멘트 값은 여기서 사용할 변수다========================  //
		// parament 값은  main의 argument와  같을 필요는 없지만 데이터 타입은 같아야 한다.
		public static String getswitchInfo(int birthYear) {
			String ddi = ""; 
				switch (birthYear % 12) {
				case 0 : ddi = "원숭이"; break;
				case 1 : ddi = "닭"; break;
				case 2 : ddi = "개"; break;
				case 3 : ddi = "돼지"; break;
				case 4 : ddi = "쥐"; break;
				case 5 : ddi = "소"; break;
				case 6 : ddi = "호랑이"; break;
				case 7 : ddi = "토끼"; break;
				case 8 : ddi = "용"; break;
				case 9 : ddi = "뱀"; break;
				case 10: ddi = "말"; break;
				case 11 : ddi = "양"; break;
					}
				return ddi;
				
			}
	
		//=================================new method==================================  //
		// 	포인트!!!!! 결과값은 main 안에 getArrayInfo(int birthYear) 전체로 가는것이다. 
		// 	또한 method 가 String 형식이기 때문에 stack 과 heap 영역에 모두 저장된다.
		// 	String 형식은 참조형 타입이기 때문에 heap영역에 값이 저장되고 그 주소값을 stack 영역에 보관하고 있다.
		//	만약 기본형이고 return 이 없다면 값을 전달하지 않고 그 값은 바로 사라진다. 
		public static String getArrayInfo(int birthYear) {
		
			String ddi = "";
			String [] d = new String [] {
				"원숭이", "닭", "개" , "돼지",  "쥐", "소", "호랑이" , "토끼", "용", "뱀","말","양"		   
			};
			
			ddi = d[birthYear % 12];
			//ddi = d[0]; 이것도 가능하고
			
			return ddi ;
	}

}


