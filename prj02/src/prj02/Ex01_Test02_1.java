package prj02;

public class Ex01_Test02_1 {
	//===========================설명===============================  //	
	// 메인안에있는 c=Ex01_Test02_1.add(a,b);   뒤에서 부터 설명
	// add라는 메소드는 Ex01_Test02_1 클래스 안에서 생성한다.
	
	// 아래의 add , sub 는 클래스 class Ex01_Test02_1  안에 있는 인스턴스 
	// 인스턴스는 각각의 다른 결과 값을 만들기 위해서 각각의 실행문을 만들어줘야 함
	static int add(int v1, int v2) {
		int v;
		v= v1 + v2;
		return v;
	}
	static int sub(int v1, int v2) {
		int v;
		v= v1-v2;
		return v;
	}
	
	public static void main(String[] args) {
		int a = 7 , b=2;
		int c=0;
		//===========================설명===============================  //	
		//객체안에 있을때는 반드시 new 를 써야하는데  앞에 클래스를 찾아서 add 메소드를 사용한다 .
		
		c=Ex01_Test02_1.add(a,b);  
		System.out.println(c);
		
		c=Ex01_Test02_1.sub(a, b);
				System.out.println(c);
	}

}
