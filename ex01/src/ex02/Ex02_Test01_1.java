package ex02;

public class Ex02_Test01_1 {

	public static void main(String[] args) {
		//이항 연산자
		int a1 = 3 ; 
		int	a2 = 4 ; 
		int r1 =  a1 * a2; 
		System.out.println(r1);
		
		//단항 연산자 : 증감 연산자
		
		int b1 = 3;
		int r2 = b1++ ; // 후행 연산자 postfix
		System.out.println("b1=" + b1 + ", b1++=" + r2); 
		
		int b2 = 3;
		int r3 = ++b2; // 선행 연산자 prefix
		System.out.println("b2=" + b2 + ", ++b2=" + r3);
		
		//사칙연산
		
		int r4 = 3 + 4 * 12 ;
		System.out.println(r4 );
		
		int r5 = 3 + 7 / 2 ;
		System.out.println(r5);
		
		double r6 = 3 + 7 / 2 ;
		System.out.println(r6);
		
		double r7 = 3 + 7 % 2 ;
		System.out.println(r7);
		
		double r8 = 3.0 + 7.0 / 2.0 ;
		System.out.println(r8);

		double r9 = 3 + 7.0 / 2.0 ;
		System.out.println(r8);
		
		double r10 = 3 + 7.0 / 2 ;
		System.out.println(r8);
		
		double r11 = 3 + 7.0 % 2.0 ;
		System.out.println(r9);
		
		int c1 = 7, c2 = 2;
		double r12 = 3.0 + c1 / c2;
		System.out.println("r12=" + r12);
		
		double r13 = 3 + 7.0 / (2*1.0) ;
		System.out.println(r13);
		
		// (double) : casting 연산자 -- 강제형 변환
		
		
		double r14 = 3.0 + (double) c1 / (double) c2;
		System.out.println("r14=" + r14);
		
		int r15 = c1 / c2;
		System.out.println("r15=" + r15);
		
		c1 = 0 ; c2 = 2;
		int r16 = c1 / c2;
		System.out.println("r16=" + r16);
		System.out.println(r16);
		
		//devide by zero - 예외(Exception) : 실행할때 발생하는 오류
		//분모가 0이면 연산이 안되는거 .. 
		//예외처리 (try catch) - 오류 발생해도 일단은 뒤에꺼는 실행해라 
		
		try {
			c1 = 7 ; c2 = 0; 
			int r17 = c2 / c1;
			System.out.println("r17=" + r17);
			/*------Exception도 가능-------*/
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException 발생" + e.getMessage());
		}
	
		/* catch(Exception e) {
		System.out.println("Exception 발생" + e.getMessage());
	}
		*/
		
		int age=27;
		boolean adult = age >= 19;
		System.out.println(adult);
				
		System.out.println("\nEnd");
		
		//-----------------------------------------
		//	비교 .논리연산
		//-----------------------------------------

		int num1 = 1;
		String name1 = "아이유";
		int age1 =25;
		String address1 = "부산";
		char gender1 = '남' ;
		
		//여자
		boolean bl1 = 
				gender1 =='여';
		System.out.println("ㅇㅇ"+bl1);
		
		//20대 여자
		boolean bl2 = 
				( 20 <= age1 && age1 < 30 );
	if ( 20<=age1 && age1 < 30)
		System.out.print("남자");
	else System.out.print("여자");


	
		System.out.println(bl2);
		
		//20대 부산 여자
		boolean bl3 = 
				(20 <= age1 ) && (age1 < 30)
				&& (gender1 =='여');
		System.out.println(bl3);
		
		//20대 여자 부산 , 대구 , 창원
		boolean bl4 = 
				(20<=age1) && (age1<30)
				&& (gender1 == '여')
				&& (address1 == "부산"
					|| address1 == "창원"
						|| address1 == "대구") ;	
		// 한번에 다묶어주기 !!!!!!!!!!!
		System.out.println(bl4);
		
	}	
}		
		
		