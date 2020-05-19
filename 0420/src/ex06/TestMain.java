package ex06;
//abstract는 클래스앞에 메소드앞에 붙일수 있는데 반드시 자식에서는 extends를 받아서 재정의 해줘야한다.


	//public abstract class Animal {			// 나 코딩이 없는 코드를 갖고 있다! <이런걸 알려줌
												// public class Cat extends Animal 은 cry를 재정의 해야함 . 
		//String name;
		//public void eat (String food) {
		//}
		//추상 메소드 ( 코딩이 없는 함수)
		//abstract public void cry();
		//}

//상속에서 가만히 생각해보니깐 DOG에서 bark하고 CAT은 meow 하는데 다시 우는 동작을 추상메소드로 올린다.
//override 재정의의 경우 2가지 . 1.코딩안한걸 추가하는것 2.정의한것을 다시 고친다는것  

//--------------------------------------------------------------------------------------------------------------

/*설명
abstract class Pet {
	public abstract void eat();
	public abstract void eat();
	public abstract void eat();
}
							원래 인터페이스는 abstract 를 가진 메소드를 더 간편하게 아래처럼 한꺼번에 적은것.
							
interface Pet {
	void eat();
	void cry();
	void run();
	
}
*/

//--------------------------------------------------------------------------------------------------------------

interface Printable {
	//interface 는 모든 메소드가 abstract 인것 .. 	
	void print(String doc);
}

class SamsungPrintDrive implements Printable{		//Printable 을 구현한 samsungPrintDrive.

	@Override
	public void print(String doc) {					// 그 해당 구현내용을 적어줌
		System.out.println("삼성 프린터입니다." + doc);
		
	}		 
}
class LGPrintDrive implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("LG 프린터 입니다"+doc);
		
	}
}

class PDFfilePrint implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("PDF파일 생성합니다" + doc);
		
	}
	
}

public class TestMain {
	
	public static void main(String[] args) {
		Printable prn1 = new SamsungPrintDrive();			//프린터 목록을 표시하는 것
		prn1.print("삼성 프린터 정상 작동");						//이게 버튼 누르면 뜨는 것 
		Printable prn2 = new LGPrintDrive();				//프린터 목록을 표시하는 것
		prn2.print("LG 프린터 정상 작동");						//이게 버튼 누르면 뜨는 것
		Printable prn3 = new PDFfilePrint();				// (하지만 내 임의의 생각임 : 자식이 부모로 가는거라고 생각하면됌)
		prn3.print("PDF 인쇄 생성");
	}
}
