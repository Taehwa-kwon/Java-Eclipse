package ex05;

public class Ex05_Test04_3 {

	static int [] data;
	
	public static void main(String[] args) {
		data= new int [] {8,7,9,5,3};
		
		System.out.println("---변경전---");
		disp_array();
		
		System.out.println("---변경후---");
		selection_sort_asc();
		
		disp_array();
	}
	
		private static void selection_sort_asc() {
		int n = data.length;
		for (int i =0; i< n-1; i++) {
			for (int j= i+1; j<n; j++)
				if (data[i]>data[j]) {
					int temp = 0;
					data[i]=data[j];
					data[j]=temp;
				}
			
		}
		
	}

		private static void disp_array() {
			for (int i = 0; i <data.length; i++) {
				System.out.printf("%4d" , data[i] );    //%04d 는 앞에 3칸은 0으로 나온다는거 
			
		}
	
	 System.out.println();
	

	}

	}

