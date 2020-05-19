//2차원 배열을 통한 별 그리기 

package ex04;

public class Ex04_Test07_1 {

	static char [][] shape ;  
	// 5줄 5칸 //원래는 char [][] shape = new char[5][5]; 가 public static void 밑에있는데 위로 올리려면  
	// shape = new char[5][5] 를 밑으로 내리고 위에 선언을 해줘야 하니깐 static char[][] shape; 이렇게 함 
	public static void main(String[] args) {	
		shape = new char[5][5];
		
		init_array();
		fill_array();
		disp_array();
		
		System.out.println("=============================");
		init_array();
		fill_array2();
		disp_array();
	}
	
/*	
	public static void init_array() {
		for(int i =0;i<5;i++) {
	    	for (int j = 0; j < shape[0].length; j++) {
	    		shape[i][j] = ' ';
			}
		}
	}
		
		char [][] shape2 = new char[][] { // 첫 번째 방법
			{' ',' ',' ',' ',' ',},
			{' ',' ',' ',' ',' ',},
			{' ',' ',' ',' ',' ',},
			{' ',' ',' ',' ',' ',},
			{' ',' ',' ',' ',' ',}
			}
*/
		
		
		//2번 째 방법
	public static void init_array() {
		for(int i =0;i<5;i++) {
	    	for (int j = 0; j < shape[0].length; j++) {
	    		shape[i][j] = ' ';
		    }
		}	
	}
	
	
	public static void fill_array() {
		for (int i = 0; i < 5; i++) { 
			for (int j = 0; j < shape[0].length; j++) {
				shape[i][j] = '*' ;
			}
		}
	}
	public static void fill_array2() {
		for(int i =0;i<5;i++) {
			for (int j = i; j < 5; j++) {
				shape[i][j] = '*';
			}
		}
	}

	public static void disp_array() {
		for(int i =0;i<5;i++) {
	    	for (int j = 0; j < shape[0].length; j++) {
	    		System.out.printf("%c", shape[i][j]);
		    }
	    	System.out.print("\n");
		}	
	}
}


