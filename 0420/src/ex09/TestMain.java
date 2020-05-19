package ex09;
//중첩 클래스 : nested class
//Outer class ( inner class)


//class 안에 class 를 넣은 이유는 저 안에서만 사용하고 버리려고. 밖에 빼버리면 너무 복잡해짐

class Test{	//Outer class Start
	static int a= 10; //여기 static 은 필수 
	int b = 20;
	
	void write() {
		final int c= 30;		// 이 내용들을 내부클래스에서 사용하려면(이용하려면) final을 붙여야한다. 
		int d = 40;				// 원칙은 final필요
		
		class LocalTest{		//Inner class Start
			void write() {
				System.out.println("a: "+ a);
				System.out.println("b: "+ b);
				System.out.println("c: "+ c);
				
				//예를들어 값을 변경한다
				// c=12; final이라서 변경 불가
				// d=20; //final을 붙이지 않아서 error
				
				int innerC = c;				// 지역(내부)변수를 만들어서 이렇게 운영하기. error발생원인 . finaal 안붙여서
				innerC += 30;	//사용가능
				int innerD = d;				//	 하지만 java 1.9부터 final 없어도 됌 (하지만 이건 java1.8버전임..ㅡ뭐지..)
				innerD += 40;
				int innerA = a;
				int innerB = b;
				innerA+= 10;
				innerB+= 20;
				System.out.println(innerC); 
				System.out.println(innerD);
				System.out.println(innerA);
				System.out.println(innerB);
				
				System.out.println("d: "+ d);
				
			} //inner Write End
		} //inner class End
		LocalTest lt = new LocalTest();	
		lt.write();
	}	//Outer class	End
}


public class TestMain {

	public static void main(String[] args) {
		//여기는 outter을 작동시킴 . 그래야지 바깥부터 안까지 내용들이 실행되니깐
		Test te = new Test();
		te.write();
	}

}
