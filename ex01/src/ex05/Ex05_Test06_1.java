//여기서 의문 . 배열은 temp 넣어서 교환하면 되는데 여기서는 안됌
//
package ex05;

public class Ex05_Test06_1 {

	
	
	public static void main(String[] args) {
	int a=7, b=2;
	
	System.out.printf("a=%d b=%d\n",a,b);
	
	swap(a,b);
	System.out.printf("a=%d b=%d\n",a,b);
		

	}
//이유는 primitive 기본형 타입은 어떤값을 저장하는 공간  
	//call by value 는 값 만을 가져오기 때문에 내부에서 처리하고 보내지를 못한다. 
	private static void swap(int a, int b) {
		int 	temp;
		temp= 	a;
		a=		b;
		b=		temp;
		
	}

}
