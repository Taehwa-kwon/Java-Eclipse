//구구단 만들기 
//2번째는  2단 3단 4단 5단   이렇게 일자로 i는 2*1 3*1 4*1 5*1 로 쭉간다는 사실 
//		6단 7단 8단 9단

package ex04;



public class Ex04_Test10_1 {

	public static void main(String[] args) {
		int sum=0;
		int sum2=0;
		
		System.out.println("구구단 만들기");
		
		for (int i = 0; i <= 9; i++) {
			System.out.println(i + "단 시작");
			for (int j = 1; j <= 9; j++) {
				sum = i*j ;
				System.out.printf("%d * %d = %d \n",i , j,sum);
			}
		}
		System.out.println("--종료---");

		System.out.println("구구단 거꾸로 만들기");
		
		for (int i = 9; i >=0; i--) {
			sum = 0;
			System.out.println(i + "단 시작");
			for (int j = 9; j >=0 ; j--) {
				sum = i*j;
				System.out.printf("%d * %d = %d \n",i,j,sum );
			}
			
		}
		System.out.println("---종료---");
		
	}

}
