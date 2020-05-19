package ex03;

public class Professor extends Person{
	String subject;
	
	
	public void teaching() {
		System.out.println("  " + name + " 교수님이 " + subject + "을(를) 가르칩니다.");
	}
}



//p1 기준으로 스택영역에 p1이 저장 //	힙은 name 과 tel // 메소드는 메소드의 다른 영역에 저장된다 (toString 포함)
//pr1 기준으로 스택영역에 pr1 이 저장 // 힙은 p1의 내용들을 복사해와서 그대로 붙이고(참조가 아님)  + subject 저장된다 // teaching은 메소드 영역에 따로 저장된다.
//Professor 인 pr1 은 p1의 힙 영역에 저장되어 있는것을 그대로 가져와서 복사해 붙여놨다. p1과 pr1은 완전히 다른 객체다. 단순히 코딩을 편하게 하기 위해서 만든 것!!! 