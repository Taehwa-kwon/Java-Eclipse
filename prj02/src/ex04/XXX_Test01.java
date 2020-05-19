package ex04;

public class XXX_Test01 {

	public static void main(String[] args) {
		
		XXX_Sachic s = new XXX_Sachic(7,2);
		
		int v = s.add();
		System.out.println(v);
		
		
		s.setV1(321);
		s.setV2(-300);
		
		
		
		v=s.add();
		System.out.println(v);
		
		

		//int v1 = s.getV1();
		//System.out.println(v1);
		
		
		
		
		XXX_Sachic s2 = new XXX_Sachic(120,4);
		
		System.out.println( s2.sub() );

	}

}
