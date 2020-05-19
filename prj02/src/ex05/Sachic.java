package ex05;

public class Sachic {
	// Fields  :  필드 (멤버변수) 
	private int v1; //외부에서 쓸수 있도록 하면 앞에 public 아니면 private 
	private int v2;
	
	//Getter / Setter  :
	public void setV1(int v1) {
		this.v1 = v1;
	}
	public void setV2(int v2) {
		this.v2= v2;
		
	}
	
	public int getV1() {
		return this.v1;
		
	}
		
	public int getV2() {
		return this.v2;
		
	}
	
	
	
	//Constructor  생성자
		//----	기본생성자 : 전역변수 초기화 ----//
	public Sachic() {     
		System.out.println("기본생성자");
		this.v1 = 0;
		this.v2 = 0;
		
	}
	// Overload 된 생성자 
	public Sachic (int v1, int v2) {
		System.out.println("인자있는 생성자");
		this.v1 = v1;
		this.v2 = v2;

		
	}
	
	
	//Method 1 인자있는 add 메소드들
	public int add(int v1, int v2) { 
		return v1+ v2;
	}
	public int sub(int v1, int v2) { 
		return v1- v2;
	}
	public int mul(int v1, int v2) { 
		return v1* v2;
	}
	public int div(int v1, int v2) { 
		return v1/ v2;
	}
	
	//Method 2   : 인자가 없는 메소드들 
	public int add() { 
		return this.v1 + this.v2; //전역변수는 모두 this를 뿥힌다.  //인자없는 add
	}
	
	public int sub() { 
		return this.v1 - this.v2; 
	}
	
	public int mul() { 
		return this.v1 * this.v2; 
	}
	
	public int div() { 
		return this.v1 / this.v2; 
	}
	
	
	
	
}
