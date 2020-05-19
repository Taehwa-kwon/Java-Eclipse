package ex08;
//https://dduddublog.tistory.com/169

//익명클래스 : Anonymous class 클래스 이름 없음 ( 람다식의 기초가 익명클래스 )
//익명클래스를 사용하는 이유는 보통 부모클래스를 상속받아서 자식클래스에서 사용하기 위해서인데 만약 단순하게 부모클래스를 상속받아 일회성인 경우는 어떻게 ..?
//상속받으려면 매번 여러개의 클래스를 만들어야 하는데 이건 너무 복잡하고 귀찬항진다.그래서익명클래스를 만든다. 

interface Command{
	public void execute();
}

class CommandProcess {
	public void process( Command command) { // < 이 커멘드는 inferface 타입을 뜻함.인터페이스를 인자로 받아서 
		command.execute();	//커멘드안에 execute를 부르는것
	}
}

public class TestMain {

	public static void main(String[] args) {
		
		CommandProcess cp = new CommandProcess();
		cp.process( new Command() {	  
			//1. interface를 new 해서 익명클래스 생성 .. 함수의 인수로 new를 이용해 Command를 만들어줌
			//2. 그 다음에 다시 재정의까지 해주는게 익명클래스 
			
			@Override
			public void execute() {
				System.out.println("내용보기 실행");	//  이것의 장점은 이 함수를 실행할때만 사용하는 것. 반드시 interface로 구현해야 이 익명클래스를 만들수 있다.
												//  main밑에만 간단하게 해야 편리한데 위에 저런걸 만들어야 하면 굉장히 귀찮음.. 그래서 요즘 swing event등등 람다식이 위에 내용들을 다 저장되어있어서 굉장히 편함
				
				
			}		
			
		});
				

	}

}
