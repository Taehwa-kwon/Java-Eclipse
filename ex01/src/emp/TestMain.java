/*
100,King,19900223,300.5,400.0,10
200,Kwon,19801212,200.5,700.5,20
300,Kim,20120105,400.05,200.5,30
400,Li,20091222,100.5,100.5,10
 
 */
package emp;

import java.util.Scanner;

public class TestMain {
	
	
	//1. 전역변수 선언
	
	
	final static int N =2;
	
	//======================================입력변수선언=====================================  //
	//  						계산할 경우를 제외하고는 전부다 string 해도 됌
	//						배열을 만들면 new 를 써줘야 한다. 그래서 초기화를 하러 간다.
	static String [] empid ;    
	static String [] name ;
	static String [] hiredate;
	static double [] sal ;
	static double [] comm;
	static String [] deptid;
	
	static String [] part_number ;
	static String [] part_name ;
	static String [] part_salary ;
	//====================================================================================  //
	
	//======================================출력을 위한 추가 변수 선언=================================//
	static double [] pay;
	static String [] deptname;
	static int [] years;
	static int [] payrank;
	
	static int [] part_salary_avg; 
	static int [] salary_higer;
	static int [] salary_lower;
	//====================================================================================  //
	


	//======================================첫번째 틀 잡기==========================================//
	public static void main(String[] args) {
		input();
		process();
		output();
	}
	//=======================================================================================//
	
	//======================================두번째 input========================================//
	//  			사번 		이름		입사일 		월급 		보너스	부서명 
	// 			   empid,  name,  hiredate, 	sal, 	comm, 	deptid
	
	private static void input() {
			
			Scanner in = new Scanner(System.in); 
	
			init_data();  /*사용을 위해서 입출력 변수 초기화 하기*/ 
			
			System.out.println("데이터를 입력");
			System.out.println("예) 사번: 이름: 입사일: 월급: 보너스: 부서번호  (추가정보: 공백없이 콤마로 구분하시오)");
			// 100,King,19900223,300.5,400.0,10    << 이게 하나의 문자열이 된다.이게 inStr에 들어온다.
			
			for (int i = 0; i < N; i++) {
				String inStr 	= in.nextLine();  /* 번호,이름,입사일 이렇게 쭉 입력 하는거니깐 한줄짜리 배열을 만들기 위해서 앞에 String타입의 inStr 변수명을 지정한다.*/
												  /*in.nextLine 은 문자열을 입력해서 Scanner 은 Enter 로 마무리하고 nextLine 은 한줄 데이터를 String type 으로 리턴해준다. */	
												  
												  /*nextLine 의 버그 존재 : 이유는 첫번째 입력하고 Enter 을 입력하면 이것 마저도 데이터로 인식. */		
				in.nextLine();				      /* in.nextLine(); //이렇게 넣으면 enter 은 무시해라 */
				
				
				String [] token = inStr.split(","); 	/*콤마를 기준으로 잘라내기 위해서 split 함수를 사용!! */
														/*그 다음 token 이라는 배열명에 저장한다. */
				empid[i] 		= token[0];				/*여기서는 세로열을 각각의 사원번호,이름,입사일 등등 으로 저장*/ 
				name[i]  		= token[1];
				hiredate[i]  	= token[2];
				sal[i] 			= Double.valueOf(token[3]); /*여기서 문제는  sal,comm는 더블형이고 token은 String 형으로 만들었으니깐 더블형을 문자형으로 바꿔야한다. */
				comm[i] 		= Double.valueOf(token[4]);
				deptid[i] 		= token[5];
				
			}
		}
		//======================================형변환================================================//
		//	문자 -> 숫자
		//	1.Integer.valueOf(변수명)		String->Int  (배열은 객체니깐)
		//	2.Double.valueOf(변수명)		String->Double (객체) 
		//		
		//	Integer.parselnt() 일반 문자형을 숫자형으로 변환 
		//	Double.valueOf()
		//
		//	숫자 -> 문자
		//	1.Integer.toString(변수명) 	Int -> String 
		//	2.Double.toString (변수명) 	Double->String 
		//==========================================================================================//
			
	//======================================두번째 - 초기화========================================//
		private static void init_data() {
			// 입력배열 초기화
			empid 		= new String [N];
			name 		= new String [N];
			hiredate 	= new String [N];
			sal			= new double [N];
			comm 		= new double [N];
			deptid 		= new String [N];
			
			part_number = new String [N];
			part_name   = new String [N];
			part_salary = new String [N];
			
			// 3. 출력배열 초기화
			pay 		= new double [N];
			deptname 	= new String [N];
			years 		= new int [N];
			payrank 	= new int [N];
			
			part_salary_avg = new int [N];
			salary_higer = new int [N];
			salary_lower = new int [N];
		}
			
			//===============================출력용 ============================//
					 
		//===================================세번째 - process========================================//
		private static void process() {
			
					//==========================부서명===============================//
			for (int i = 0; i < N; i++) {	//	배열의 개수  0부터 시작하니깐
				switch(deptid[i]) {			// deptid[i] 번쨰 열에 무슨값이 들어오냐 ? 배열 0번쨰에 (즉 첫번째 자리 )  
				case "10" : deptname[i]="인사"; break;	//  10,20,30,40 값이 들어올테니깐 해당 열을 출력해라.
				case "20" : deptname[i]="자재"; break;
				case "30" : deptname[i]="총무"; break;
				case "40" : deptname[i]="개발"; break;
				case "50" : deptname[i]="서비스"; break;
				}
			}
					//==============================================================//
		
		
			
			
					//==========================연차===========================//
			int thisyear=2020;
			int [] hyear = new int [N];    								// 연차배열  
			
			for (int i = 0; i < N; i++) {
				hyear[i] = Integer.valueOf(hiredate[i].substring(0,4));    //Integer 이 int 형으로 뽑는거고 substring 문자열안에 원하는 문자를 뽑는거 
				years [i] = thisyear-hyear[i];
			}
					//========================================================//
			
					//==========================실수령===========================//
			for (int i = 0; i < N; i++) {
				if ( years[i] % 5 == 0 && years[i]!=0)
					pay[i] = sal[i] + comm[i] + sal[i]*3;
				else 
					pay[i] = sal[i] + comm[i] ;
			}
					//=========================================================//
					
					//===========================월급별 순위=======================//
		for (int i = 0; i < N; i++) {
			payrank[i] = 1;
			for (int j = 0; j < N; j++) {
				if(pay[i]<pay[j])
					payrank[i]++;
			}
			
		}
		int pos = 0;
		for (int i = 0; i < N; i++) {
			switch (deptid[i] ) {
			case "10" : pos = 0 ; break;
			case "20" : pos = 1 ; break;
			case "30" : pos = 2 ; break;
			case "40" : pos = 3 ; break;
			case "50" : pos = 4 ; break;
			}
			
			
			
		}
					//=============================================================//
	}
	//========================================================================================//
		
		//======================================세번째 - output========================================//	

		
		//==========================================출력자료==============================================//
		//   사번,     이름,   입사일,    월급,      보너스,      실수령,     부서명,        연차      	연봉순서			//
		//  empid    name  hiredate  salary  commission   pay   department_id   years    pay_rank		//
		//==============================================================================================//
		
		private static void output() {
			System.out.println("==================");
			System.out.println("======사원목록=======");
			System.out.println("==================");
			
			
			String msg = "";
			System.out.println("사번,  이름,  입사일,       월급,    보너스,  실수령,    부서명,연차,연봉순서 ");
			String fmt = 		"%s  %s   %s  %.3f %.3f  %.3f    %s   %d    %d\n"; 							 
			for (int i = 0; i < N; i++) {
					msg = String.format(fmt,empid[i],name[i],hiredate[i],sal[i],comm[i],pay[i],deptname[i],years[i],payrank[i]);
			}
			
			System.out.println(msg);
			
			
			
			
		}
}
