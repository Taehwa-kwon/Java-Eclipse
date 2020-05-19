
package ex05;

public class Ex05_Test04_4 {
	


	public static void main(String[] args) {
	int [] array = new int [] {8,7,5,3,9};
		System.out.println("변경전");
		Disp_array(array);
		System.out.println("변경후");
		Bubble_Sort(array);
		Disp_array(array);
		
		
	}


	private static void Bubble_Sort(int [] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if(array[j]>array[j+1]) {
					int temp=0;
					temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}


	private static void Disp_array(int [] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%4d",array[i]);
		}
		System.out.println();
		
	}

}
