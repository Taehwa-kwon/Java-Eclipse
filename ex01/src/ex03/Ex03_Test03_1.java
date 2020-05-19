//별만들기 

package ex03;

public class Ex03_Test03_1 {

	public static void main(String[] args) {
		
		
		for (int i=1;i<=5;i++) {
		System.out.print("*****\n");
		}
		System.out.println("===절취선===");
		
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("===절취선===");
		
		
		System.out.println("1.");
		int rows = 5;
		int cols = 5;
		for (int i=1;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println();
	
		System.out.println("5.");
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println();
	
		
		
		System.out.println("6.");
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	
		
		
	}

}
