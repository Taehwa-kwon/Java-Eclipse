package ex01;
//익명클래스 !! 람다 뭐,, 몰라 -- 소개하기 위해서 

interface Command {
	void execute();
}

class Commandprocess {
	public void process(Command command) {
		command.execute();
	}
}

public class TestMain {
//익명 클래스 Anonymous Class
//함수의 인자로 클래스 사용가능  (cp.process(new Command() <-- new Command 라는 인자를 만들었다 -> 프로세스는 그 밑에 @Override 부터 끝까지 )
	public static void main (String[] args) {
		Commandprocess cp = new Commandprocess();
		cp.process(new Command() {
			@Override
			public void execute() {
				System.out.println("내용보기 실행");
			}
		});
		
	}
	
}