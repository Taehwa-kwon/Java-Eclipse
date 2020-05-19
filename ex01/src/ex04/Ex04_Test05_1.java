package ex04;

public class Ex04_Test05_1 {
		// 배열 : array
		// 같은 이름과 type을 가진 연속적인 변수들의 모음
	//배열의 첨자는 0부터 시작
	//배열의 크기는 변경할 수 없다. (Arrays 클래스를 배우면 가능)
	
	//배열과 반복문을 완전 이해하기 !!

	public static void main (String[] args) {
		//------------------------배열 선언 ----------------------------------------//
				int [] Number = new int[5];
				 Number[0]=8;
				 Number[1]=7;
				 Number[2]=3;
				 Number[3]=4;
				 Number[4]=9;
				 
				 for (int i = 0; i < Number.length; i++) {
					 System.out.print(Number[i]+" ");
					 
				}
				 System.out.println();
				 System.out.println("======");
				 System.out.println("3번째 자리의 값은"+Number[2]);
				 System.out.println(Number.length);
				
		//------------------------배열과 for문 sum값 ----------------------------------------//		
				 int sum=0;

				 for (int i = 0; i < Number.length; i++) {
					 sum=sum + Number[i];
				 }
				 System.out.println("======");
				 System.out.println(sum);	
				 System.out.println("======");
				
		//------------------------배열선언과 생성을 동시에 ----------------------------------------//	
			int [] Number1 = new int [] {8,7,3,4,9};
			for (int i = 0; i < Number1.length; i++) {
				Number1[i]=Number1[i];
				
				System.out.printf("%d번째 = %d \n",i,Number1[i]);
				 System.out.println("======");
				
			}
				
				
				
			}	
		}


