//별만들기

package ex03;

public class Ex03_Test04_1 {

	public static void main(String[] args) {
		System.out.println("기본형");
		for (int i=1;i<=5;i++) {
			System.out.print("*****\n");
			}
			System.out.println();
			
			
		System.out.println("기본형");
			System.out.println("");
			for (int i=1;i<=5;i++) {
				for(int j=1;j<=5;j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
			
			
		System.out.println("1번 ");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++){
		
			System.out.print("*"); }
		
		System.out.print("\n");
		}
		
		System.out.println("2번 ");
		int rows = 5;
		int cols = 5;
		for (int i=1; i<=rows; i++) {
			for (int j=1; j<=cols; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		
		System.out.println("3번 ");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("4번");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//i=1 일때 true -> j<=i-1(1<0) 이 false -> k<=5 (1<=5) true 5번 반복
//i=2 일때 true -> j<=i-1(1=1) true 그다음 false -> k 4번 출력 
//반복~ 	
		
		System.out.println("8. 여기서부터 보기 ");
		for(int i=1;i<=5;i++) {
			for(int j1=1;j1<=i-1;j1++) {
				System.out.print(" ");
			}
			for(int j2=i;j2<=5;j2++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println();
		
		for (int i = 1; i < 5; i++) {
			for (int j1 = 1; j1 <= 5-i; j1++) {
				System.out.print(" ");
			}
			for (int j2 = 1; j2 <= i; j2++) {
				System.out.print("*");
			}System.out.println();
		}
		
		System.out.println("9.");
		for(int i=0;i<5;i++) {
			for(int j1=0;j1<4-i;j1++) {
				System.out.print(" ");
			}
			for(int j2=0;j2<=i;j2++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println();
		
		
		
		//마름모 만들기 // 

		System.out.println("10.");
		for(int i=1;i<5;i++) {
			for(int j1=1;j1<=5-i;j1++) {
				System.out.print(" ");
			}
			for(int j2=1;j2<=i*2-1;j2++) {
				System.out.print("*");
			}
			System.out.print("\n");
			}
			System.out.println();
			
			////하단////
			
			for(int a=4;a>0;a--) {
				for(int b1=4;b1>a;b1--) {
					System.out.println(" ");
				}
				for(int b2=1;b2<=a*2-1;b2++) {
					System.out.println("*");
					
				}
				System.out.println("\n");
			}
			System.out.println();
	
	}

}


