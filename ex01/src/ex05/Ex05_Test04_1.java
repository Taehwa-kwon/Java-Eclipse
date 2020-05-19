
package ex05;

public class Ex05_Test04_1 {

	static int [] data = new int[] {8,7,9,5,3};

	//이렇게 위에 선언하는것은 다른 클래스에도 사용하기 위함.static 은 메모리에 계속해서 자료를 남겨둠 . + int + [] 배열 + 변수명

	public static void main(String[] args) {
//==================배열선언 방법 3가지 ==================================//
//1		int [] Number = new int [5] ;
//		Number[0] = 8;
//		Number[1] = 7;
//		Number[2] = 3;
//		Number[3] = 4;
//		Number[4] = 9;
		
//2		int [] Number = new int [] {8,7,3,4,9} ;
//3		int [] Number = {8,7,3,4,9} ;
//==================배열선언 방법 3가지 ==================================//		
	
//bubble- sort : ascending 작은-> 큰 올림차순 
		
		
		System.out.println("정렬전");
		disp_arr();   //원래의 배열
		bubble_sort_asc();  //정렬하는 배열,반복문
		System.out.println("정렬후");
		disp_arr(); //결과 값
	}
	
	private static void bubble_sort_asc() {
		int n = data.length; 
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1-i; j++) {
				if(data[j]>data[j+1] ) {           
				   int temp = data [j];
				   data [j] = data[j+1];
				   data[j+1] = temp;       
// 8 	7 	3 	4 	9 
// j   j+1  
//			빈공간 temp
				}
			
		}
	}
		
	}
	
	private static void disp_arr() {
		for (int i = 0; i < data.length; i++) {
			System.out.printf("%4d",data[i]);  //데이터의 i번째를 찍어라
		}
		System.out.println();
	}

}
