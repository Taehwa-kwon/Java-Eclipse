package ex01;

class NewCalculator_1 {
	static double PI = 3.14;
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right= right;
	}
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg () {
		System.out.println(this.left + this.right);
	}
}
//클래스 멤버와 인스턴스 멤버.
//클래스라는 설계도 안에 여러가지의 인스턴스가 들어올수 있다. 각각의 인스턴스안에 변수와 메소드가 있을 수 있다.
		
// sum , avg 는 우리가 만든 객체에 따라서 다른 값을 가진다. 이유는 객체마다 다른 변수값을 가지기 때문에 
// 모든 인스턴스가 공유하는 변수를 줄수있다면 편리하다. 그래서 클래스 변수-> static double pi = 3.14 이것을 설정한다.
// 그 클래스안에 만들어진 인스턴스들은 클래스의 값을 모두 가진다.
// static 이라는 키워드가 들어오면 이 변수가 클래스의 소속이 된다는 뜻. 모든 메소드,인스턴스에서 동일한 값을 가지게 된다.

public class NewCalculator {
	
	public static void main(String[] args) {
		
		NewCalculator_1 c1 = new NewCalculator_1(); 
		System.out.println(c1.PI);   //c1이라는 인스턴스를 통해서 PI에 접근할 수 있지만.
		
		NewCalculator_1 c2 = new NewCalculator_1();
		System.out.println(c2.PI);
		
		System.out.println(NewCalculator_1.PI); // 클래스를 통해서도 PI에 접근이 가능하다.
		
		

	}

}
