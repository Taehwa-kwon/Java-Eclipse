package ex18;

//usb 인터페이스방식으로 접근한다. 
//MS는 interface 를 주고 나머지 각자의 삼성Hpxiaomi등등이 내부적인 override 안의 정보를 적는다.
//이게 드라이브 . 즉 Iot 반이 이러한 정보를 작성한다. 
// 그러니깐 interface 의 장점은 ms사는 이러한 함수명을 내리고 아래 회사들이 거기에 맞춰서 작업만 하면 됌!  

interface Printer {
	public void print(String doc);

}

class SamsungPrinter implements Printer {

	@Override
	public void print(String doc) {
		System.out.println("삼성칼라프린터 입니다\n"+doc);
	}
}

class HpPrinter implements Printer {

	@Override
	public void print(String doc) {
		System.out.println("Hp레이저프린터입니다\n"+doc);
	}
}
	
class LGprinter implements Printer {

	@Override
	public void print(String doc) {
		System.out.println("Lg프린터입니다.");
	}
}
	
class xiaomi implements Printer {

	@Override
	public void print(String doc) {
		System.out.println("xiaomi프린터입니다.");
	}
}
	


public class TestMain {

	static String doc = "인쇄될 내용입니다";
	public static void main(String[] args) {
		SamsungPrinter sp = new SamsungPrinter();
		sp.print(doc);
		LGprinter lp = new LGprinter();
		lp.print(doc);
		xiaomi sop = new xiaomi();
		
		
		System.out.println("===================");
		
		write(sp);
		write(lp);
		write(sop);

	}

	

	private static void write(Printer prn) {
		prn.print(doc);
		
	}

}

