package ex04;

public class Ex04_Test06_1_two_array {

	
/*   2 차원배열
		0 1 2 3
	0   1 2 3 4
	1   5 6 7 8
	2   9 10 11 12
	3  13 14 15 16
	4  17 18 19 20
	
	int [][] arr =new int [][]
*/
	public static void main (String[] args) {
		//------------------------2차원 배열 선언 ----------------------------------------//
				int [][] arr = new int[][]  {
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16},
				};
				
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr.length; j++) {
						System.out.printf("%3d",arr[i][j]);
					}
					System.out.println();
				}
				
				System.out.println(arr.length);
				System.out.println();
				
			// arr.length 는 0,0 1,0 2,0을 말하고
			// arr[0].length 는 0,0 0,1 0,2 0,3 을 말한다 
				
				
		//------------------------2차원 배열 행,열의 총 갯수 알아내기 ----------------------------------------//		
				int [][] arr1= new int[10][10];

				System.out.println(arr1.length); 
				System.out.println(arr1[0].length);
		//------------------------2차원 배열 for을 통한 값 찍어내기 ----------------------------------------//		
				
				int k =1;
				for (int i = 0; i < arr1.length; i++) {
					for (int j = 0; j < arr1.length; j++) {
						arr1[i][j]=k;
						k++;
						System.out.printf("%3d",arr1[i][j]);
					}
					System.out.println();
				}

			}	
		}