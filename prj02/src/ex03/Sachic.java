package ex03;

public class Sachic {
	//============================Fields===============================  //
	// 					외부에서 값을 가져오기 위해   private 
	private int v1; 
	private int v2; 
	
	//v1 과 v2 는 메인에서 보내준 전역변수다 . 
	//그런데 문제는 사칙클래스인데 메인에서 미리 값을 넣어줘야 한다 .안그러면 값을 알수가 없다 .
	//들어올수 있는 방법만 알면 한번만 보내면 모두 사용할수 있다.
	//setter 함수로 입력 : 잘못된 값의 입력을 방지한다.
	
	//============Main에서 선언된 set1 메소드와 parament 7의 값을 받는다============  //	
	
	public void set1(int v1) {  
		this.v1 = v1;
		
//		this.v1 = Integer.MAX_VALUE; //
//		if (30<=this.v1 && this.v1 <=75)  //비데의 온도 30도에서 75도까지 가정
//			this.v1= v1 ; 
//			else
//				this.v1 = 40;
//			
	}
	//============Main에서 선언된 set2 메소드와 parament 2의 값을 받는다============  //	
		public void set2(int v2) {
			this.v2 = v2;
		}
		
	//=============================기본 생성자 선언============================  //	
		public Sachic () {} 
	
	//============================Main에서 선언된 Method===========================  //
	public int add() {
		return v1 + v2;
	}
	public int sub() {
		return v1 - v2;
	}
	public int mul() {
		return v1 * v2;
	}
	public int div() {
		int x;
		try {
			x=v1/v2;
			return x;
		} catch (Exception E) {
			System.out.println("계산오류발생" + E.getMessage());
			return 0;	
		}
	}
}
