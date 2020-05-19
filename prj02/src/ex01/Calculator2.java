package ex01;

public class Calculator2 {
	static double PI = 3.14; //static 은 Calculator2 라는 클래스 전체에 클래스 멤버가 된다.
	static int base = 0;
	int left, right;  //이건 인스턴스의 멤버이다. 해당 
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right= right;
	}
	public void sum() {
		System.out.println(this.left + this.right + base);
	}
	
	public void avg () {
		System.out.println((this.left + this.right + base)/2);
	}

	public static void main(String[] args) {

		Calculator2 c1 = new Calculator2();
			c1.setOprands(10, 20); 
			c1.sum();
						
		Calculator2 c2 = new Calculator2();
			c2.setOprands(20, 40);
			c2.sum();
			
		Calculator2.base = 10;
		
		c1.sum();
		c2.sum();
	}
}