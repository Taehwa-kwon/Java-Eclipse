package 매개변수;

public class Practice2 {
	public static void main(String[] args) {
		int [] v = {10,20,30};
		int [] b =fun1(v);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	private static int[] fun1(int[] v) {
		int [] m = new int [4];
		m[0]=v[0]+v[1]+v[2];
		m[1]=v[0]-v[1]-v[2];
		m[2]=v[0]*v[1]*v[2];
		m[3]=v[0]/v[1]/v[2];
		
		return m;
	}
	
}
