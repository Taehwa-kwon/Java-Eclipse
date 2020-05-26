package ex01;

import java.util.Calendar;

public class Ex01_Test03_1 {
	
	// @ : annotation   SuppressWarnings 이건하지마 ! deprecation 경고하지마 
	
		@SuppressWarnings("deprecation")
	
		public static void main(String[] args) {
		System.out.println("Hello");
		
		short num1 = 32767;
		System.out.println(num1);
		
		//num1 = (short) (num1 + (short) 3);
		num1 = (short) (num1+3); 
		System.out.println(num1);
		
		int		 age = 26 ; 
		float	 height = 178.3f;
		float	 height2 = (float) 178.3;
		double 	 height3 = 178.3;
		
		boolean adult = true ;  // boolean type은  true false (데이터) 사용가능 
		if (age < 19)
			adult = false ;
		
		System.out.println(adult);  
		
		height3 = height3 + 10 ; 
		
		System.out.println(height3);
		
		//------------------------------------------------------------------------------------------------//
		boolean b;
		
		b=0 == 0.0 ; 		//뒤에서부터 계산 
		System.out.println(b);
		
		boolean c;
		c = 3 > 3.5 ; 
		System.out.println(c);
		//여기서 보면 정수 실수끼리는 서로 바꿔서 자동 게산됌 implicit 암시적 계산 . 앞에는 int 고 뒤에는 double 이니깐 앞을 double 로  바꿔서 계산
		//------------------------------------------------------------------------------------------------//
		
		//------------------------------------------------------------------------------------------------//
		String hello;
		hello = "안녕" + "하세요" ; 
		System.out.println(hello);
		// String 은 문자와 문자열 계산도 가능하다.
		//------------------------------------------------------------------------------------------------//
		
		
		Calendar calendar = Calendar.getInstance();
		int date = calendar.get(Calendar.DATE);
		System.out.println(date);
		
		
		java.util.Date today = new java.util.Date();
		int year = today.getYear();
		System.out.println(today);
		System.out.println(year);
		
		//또 하나의 방법은 date 해놓고 ctrl shift o 해서 
		//------------------------------------------------------------------------------------------------//
		
		
		//F2 눌러서 오류 확인가능
		// 한줄 복사 ctrl alt 아래 
		// 한줄 올라가기 alt 위로 아래로
		//sysout ctrl spacebar 
		
	}

}
