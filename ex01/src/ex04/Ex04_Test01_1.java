package ex04;

public class Ex04_Test01_1 {

	public static void main(String[] args) {
		// 함수 : function
		// method : 클래스안에 있는 함수 
		// main() : 프로그램의 시작점과 끝 점을 결정 // 그냥 레고의 틀을 의미한다. // 메인이 라이브러리를 불러옴 
		// 라이브러리 : 메인이 없는 함수를 모아놓은것 
			input();
			process();
			output();
			
	}
	public static void input() {
		System.out.println("데이터를 입력받는다");
		
	}
	public static void process() {
		System.out.println("데이터를 계산한다");

	}
	
	public static void output() {
		System.out.println("데이터를 출력한다");
	}
}

