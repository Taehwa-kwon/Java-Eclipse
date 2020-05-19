package ex01;

//============================2. 두번째 순서===============================  //
// public class Calculator 이라는 클래스에 public Calculator 이라는 생성자가 있다.

// 상단의 클래스 이름과 생성자(Construtor) 이름은 반드시 같아야 한다.
// 또한 left,right값을 this.(left,right)를 통해서 전역변수에 올려준다.
// 생성자가 하는 역할은 클래스가 생성될떄 클래스이름과 똑같은 생성자가 생성.
// 그래서 생성자는 모든 과정중에 제일 먼저 실행된다.
public class Calculator {  
	int left, right;   // 전역변수 지정!!
	
	public Calculator (int left, int rigth) {
		this.left=left;
		this.right=rigth;
	}
	
	public void sum() {
		System.out.println(this.left + this.right); 
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	public static void main(String[] args) {
	
		//============================1. 첫번쨰 순서===============================  //
		// 맨 뒤에 Calculator 이라는 생성자에 10과20이라는 파라멘트값을 저장하고
		// new 를 통해 인스턴스화 시켜 Calculator이라는 타입의 c1에 저장한다. < -- 첫 번째 순서
		// 
		// 다시 아래에 c1.sum c1.avg를 실행시키기 위해서는 생성자를 초기화해야한다.
		
		Calculator c1 = new Calculator(10,20); // 맨앞의 Calculator 가 데이터 타입 (=클래스) 맨뒤 Calculator가 생성자(=Construtor) 
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(20,40);
		c2.sum();
		c2.avg();
	}
}

