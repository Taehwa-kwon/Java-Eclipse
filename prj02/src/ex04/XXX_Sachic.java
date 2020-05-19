package ex04;

public class XXX_Sachic {
	// fields 
	private int v1;
	private int v2;

	// Constructor 생성자 
	public XXX_Sachic (int v1, int v2) { 
		// 인자에 어떤 값이 있다면 무조건 생성자를 만들어 줘야한다. 앞으로 class 
		//입력값 체크 ex03 Sachic 에 있는 if 처럼 하기 
		
		
		this.v1 =v1;
		this.v2= v2;
	}
	//기본생성자 (객체지향언어에서는  인자가 다르고 (파라멘트) 이름이 같은 생성자를 여러개 만들수 있다 ) OVERLOADING ! - 다중적재한다.!  
	public XXX_Sachic () {}

	// Method
	
	public int add() { 
		return v1+v2;
		}
	
	public int sub() { 
		return v1-v2;
		}
	
	public int mul() { 
		return v1*v2;
		}
	
	public int div() { 
		return v1/v2;
		}
	
	public int add(int i, int j) {
		
		return i+j;
	}
	public void setV1(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setV2(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}
