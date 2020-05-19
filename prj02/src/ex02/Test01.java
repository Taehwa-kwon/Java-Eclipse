package ex02;

public class Test01 {

	public static void main(String[] args) {
		
		//======================================변수선언=====================================  //
		int v1=7, v2=2;
		int v;
		
		//======================================클래스======================================
		Sachic s1 = new Sachic();
		
		//뒤에서 부터 해석하면 새로운 Sachic()객체를 만들어 인스턴스화 시켜 s1 Sachic 타입에 넣는다.  
		//그 다음 v=s1.add(v1.v2) 
		//Sachic 클래스타입 s1.이라는 경로에 add라는 메소드를 생성 v1v2 라는 parament값 전달 
		// 아래의 계산식을 진행하려면 반드시 add라는 메소드가 선행되어야 한다.
		
		v=s1.add(v1, v2);		
		System.out.println("add의 값"+v);
		
		v=s1.div(v1, v2);
		System.out.println("나누기의 값"+ v);
		

	}

}
