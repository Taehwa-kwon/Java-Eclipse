package ex05;

public class Ex05_Test05_1 {

	
	
	public static void main(String[] args) {
		//bubble- sort : ascending 작은-> 큰 올림차순 
		int [] data = new int[] {8,7,9,5,3};
		
		
		disp_arr( data );
		bubble_sort_asc(data);  
		disp_arr(data);

	}
	
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
	
	private static void disp_arr(int [] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.printf("%4d",data[i]);  //데이터의 i번째를 찍어라
		}
		System.out.println();
	}

}
