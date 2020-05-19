package prj02;

public class Ex01_Test01_1 {

		static int add(int x1, int x2) {
			int val;
			val = x1 + x2;
			return val;
		}
		//=====================================Main 변수생성=====================================  //
		public static void main(String[] args) {
			
		int v1=7, v2=2;
		int val1;
		//===========================================================================  //
		
		// val1 = Ex01_Test01_1.add(v1,v2);  이것도 
		val1 = add(v1,v2);  
		
		System.out.printf("%d+%d=%d\n",v1,v2, val1);
		
		Ex01_Test01_1 t1 = new Ex01_Test01_1();  //이건 그렇게 추천하는 타입은 아님
		int val2_2 = t1.add(v1, v2);
		System.out.printf("%d+%d=%d\n",v1,v2, val1);
	}
		
}

