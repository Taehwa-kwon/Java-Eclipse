package ex05;

public class Ex05_Test04_2 {

	
	
	public static void main(String[] args) {
		//================================배열의 순서를 바꾸는 문제====================================  //	
		//					bubble- sort : ascending 작은-> 큰 올림차순 								//
		//	main 위에서  static [] 변수선언 하면 이 파일 전체에서 사용할수  있다. static 은 메모리에 계속 남기겠다는 말. 		//
		//	main 은 부모님이라고 이해하면 됌  disp_arr bubble_sort_asc 각각 다른집이다.							//
		//  main 안에 method 를 선언하고 data - argument를 주고 다른 자식들에게 주고 값을 구해온나 . 명령				//
		//====================================변수 선언==========================================  //
		int [] data = new int[] {8,7,9,5,3};
		disp_arr( data );
		bubble_sort_asc(data);  
		disp_arr(data);
		}
	
		//====================================main 끝 ==========================================  //
	
		//====================================새로운 method 시작===================================  //
		// paramnet 배열을 이용해서 시작
		// n n+1 을 떠올리면 쉬움   ( n = 오늘의 값) ( n+1 내일의 값 ) 처럼 여기면 됌 
		// int temp;  - 빈공간
		// i는 행이고 j는 열이다. 한줄에 나타나는 거니깐 i는 1행 j는 5열이 있다고 생각.
		// 34행 만약에 앞의 값이 뒤에값보다 크다면 위치를 바꿔야 하니깐     앞의 값을 temp(빈공간)에 넣어두고 그렇게 쭉쭊하면됌 			// 
		private static void bubble_sort_asc(int [] data) {

		int n = data.length; 
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1-i; j++) {
				if(data[j]>data[j+1] ) {           //a가 j b가 j+1 temp는 임시저장장소
				   int temp = data [j];
				   data [j] = data[j+1];
				   data[j+1] = temp;       
					}
				}
			}
			
		}
		//====================================새로운 method 시작 ===================================  //
		//								   원래의 배열을 뽑아내는 것 	  								//
		private static void disp_arr(int [] data) {
			for (int i = 0; i < data.length; i++) {
				System.out.printf("%4d",data[i]);  //데이터의 i번째를 찍어라
			}
			System.out.println();
		}
	}
