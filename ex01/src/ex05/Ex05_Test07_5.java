//3개의 데이터를 줄테니깐 +-*/ 4개의 계산한 값을 가져와보자  -- 정답! 아래 
package ex05;

public class Ex05_Test07_5 {

	public static void main(String[] args) {
		
		int [] v = new int [] {10,20,30};
		
		int [] B= func1(v);
		for (int i = 0; i < v.length; i++) {
			System.out.println(B[i]);
		}
		
	}

	private static int[] func1(int[] v) {
		int [] A = new int [4];
		A[0] = v[0]+v[1]+v[2];
		A[1] = v[0]-v[1]-v[2];
		A[2] = v[0]*v[1]*v[2];
		A[3] = v[0]/v[1]/v[2];
		
		return A;
		
	}

}

