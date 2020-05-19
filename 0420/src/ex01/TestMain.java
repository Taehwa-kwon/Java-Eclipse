//질문 1. 메소드에 리턴타입이 있는것과 void해서 tot = this.kor + this.eng + this.mat; 숫자타입은 void 로 리턴 가능한가? 이렇게 하는것의 차이
//질문 2. 객체에 매개변수로 값을 넣고 생성자에서도 값을 입력했을때 어떤게 적용되는가 
package ex01;

class Student {
	//클래스의 기능은 2가지가 있다.
	
	//1. data 를 담아놓는 공간 (Field)		전역변수
	String 	name;		
	int 	kor, eng, mat;
	int		tot, avg;
	
	// 기본 생성자 (construct)
	public Student() {}
	// 오버로드된 생성자 (혹은 인자있는 생성자)
	public Student(String name, int kor, int eng, int mat) { 		//Student(String string, int i, int j, int k) 시그니처라고 표현
		this.name	= name;		//이건 지역변수들
		this.kor 	= kor;		//이건 지역변수들
		this.eng	= eng;		//이건 지역변수들
		this.mat	= mat;		//이건 지역변수들
	}
	
	//2. method 기능을 담는 용도
	//public int calcTot() {
	
	//int tot = this.kor + this.eng + this.mat;  			//this 를 써서 S1,S2 각각의 객체에 대한 필드를 사용
															// { } 중괄호 안에서 int tot 해서 사용하면 이 함수가 종료되면 스택에 저장되어 있는 값들이 사라져서 메모리를 적게 사용 가능.
	//return tot; 											// 값을 리턴하기 때문에 자료형 타입인 int 를 method앞에 붙여준다.

//	}
	
	void calcTot() {
		//int tot = this.kor + this.eng + this.mat;  		//this 를 써서 S1,S2 각각의 객체에 대한 필드를 사용
															// { } 중괄호 안에서 int tot 해서 사용하면 이 함수가 종료되면 스택에 저장되어 있는 값들이 사라져서 메모리를 적게 사용 가능.
		//return tot; 										// 값을 리턴하기 때문에 자료형 타입인 int 를 method앞에 붙여준다.
		
		tot = this.kor + this.eng + this.mat;
		avg = (this.kor + this.eng + this.mat)/3;
	}
															// 분명히 상속의 문제점도 존재한다. 위에서 고쳐야하면 아래도 전부다 고쳐야하기때문에 현장에서는 잘 사용하지 않음
															// 인터페이스는 자주 사용..
	void calcAvg () {
		this.avg =this.tot / 3;
	}
	
	//Alt Shift S >> generate toString(); -> 모두선택 
	@Override
	public String toString() {
		calcTot();
		calcAvg();
		
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot=" + tot + ", avg="
				+ avg + "]";								// \n 줄바꿈
															// 롬복 라이브러리 사용법도 한번 봐도됌
	}
	
}

public class TestMain {

	public static void main(String[] args) {
														// 여기에서main에서  String name 하면 한사람의 내용만 담을수 있는데 클래스로 담으면 여러가지 데이터를 한꺼번에 담을수 있다. 
		System.out.println("테스트");
		Student s1 = new Student();
		Student s2 = new Student("권태화",100,100,100);	// 생성자로 가자
			
		s1.name = "아이유";
		s1.kor 	= 80; 
		s1.eng	= 90; 
		s1.mat 	= 80;
		
		//여기서 개개인별로 계산을 해도 되는데 위에 클래스에서 한꺼번에 사용하는게 더 편함
		
		//계산
		//int tot, avg;
		//tot	= s1.kor + s1.eng + s1.mat;
		//avg = tot / 3;
		
		s1.calcTot();
		s1.calcAvg();
		
		System.out.println("이름 : " + s1.name );
		System.out.println("국어 : " + s1.kor );
		System.out.println("영어 : " + s1.eng );
		System.out.println("수학 : " + s1.mat );
		System.out.println("총점 : " + s1.tot );
		System.out.println("평균 : " + s1.avg );
		
		
		//System.out.println(tot);
		System.out.println(s2.toString());

	}

}
