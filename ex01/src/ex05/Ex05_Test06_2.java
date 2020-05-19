//여기서 의문 . 배열은 temp 넣어서 교환하면 되는데 여기서는 안됌
//
//그래서 해결방법이 Text 6의 문제를 가져와서 수정함 
//필기해놓음 확인


package ex05;

public class Ex05_Test06_2 {



	
	public static void main(String[] args) {
		int [] data= new int [] {8,7,9,5,3};
		
		disp_array(data);
		selection_sort_asc(data);
		disp_array(data);
	}
	
	//하지만 call by Reference 의 경우에는 주소값(즉 전체)을 전달하기 때문에 내부에서 처리하고 반환이 가능하다.
	
		private static void selection_sort_asc( int [] data) {
		int n = data.length;
		for (int i =0; i< n-1; i++) {
			for (int j= 0; j<n-1-i; j++)
				if (data[j]>data[j+1]) {
					int temp = 0;
					temp = data[j];
					data[j] = data[j+1];
					data[j+1]= temp;
				}
			
		}
		
	}

		//필기해놓음 ..!! //
		private static void disp_array(int [] d) {
			for (int i = 0; i < d.length; i++) {
				System.out.printf("%4d",d[i]);  //데이터의 i번째를 찍어라
			}
			System.out.println();
		}

	


	}

	