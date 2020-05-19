package ex04;

				//%-10d : 전체 10자리에 10진수를 출력하라 
				//	  : -왼쪽 정렬
				//	  : 숫자기준 기본정렬은 오른쪽 - 
				//%d = decimal 10진수
				//%o = octal 
				//%x = hexa
				//%s = string 
				//%f = float ,double
				//%c = char
				//
				//----------------------------------------------------------
				//중괄호 안의 변수는 반드시 중괄호 안에서만 사용가능 
				////main 안에  
				////void 의 뜻은 리턴값을 무시한다.
				////얘는 리턴값을 반환하니깐 int 로 적는다 . 
				////여기서 중요한거는 main 안에 add를 아래에 int v = v1 + v2; 로 받아서 그 리턴값을 다시 위의 c=add(a,b); 여기로  반환
				//c=add(a,b) 인수 인자 / 던진다 paramater argument - > public static int add (int v1, v2) / dummy 가인수 가인자
				//-----------------------------------------------------------

		public class Ex04_Test03_1 {
		
			public static void main(String[] args) {
				int a = 7, b = 2;
				int c;
		
				c = add(a, b);
		
				System.out.printf("a=%d b=%d c=%d", a, b, c);
		
				// printf
			}
		
			public static int add(int v1, int v2) {
				int v = v1 + v2;
				return v;
			}
		}
