package ex03;

public class TestMain {

	public static void main(String[] args) {
		// 객체 상속
		// 상속 : 공통되는 부분을 추출하여 부모클래스로 뺀다.
		// 예를들어 학생 , 교수, 직원이 있을경우 학생교수직원의 공통적인 부분은 이름, 나이,성별 등등이 있다.
		// 공통되는 부분을 빼서 Person이라는 클래스로 빼놓는다. 
		// 그거를 받아서 사용하는 것. 상속의 주된 목적은 밑에 클래스에 공통되는 부분을 모아놓음
		
		Person p1 	= new Person();
		p1.name 	="차은우";
		p1.tel		="010-6565-6581";
		System.out.println(p1); 			// ToString 이 없으면 객체의 메모리 위치값을 나타냄.	
		System.out.println(p1.toString());	// 위에 것과 아래것의 차이는 재정의라는 것인데 원래는 아래처럼 적어야 하는데 이미 Person 에 override 를 했다	
		
		System.out.println("----");
		
		Professor pr1 = new Professor();
		pr1.name 	= "소미";
		pr1.tel 	= "010-0000-0000";
		pr1.subject = "음악";
		
		System.out.println(pr1);
		pr1.teaching();
		
		System.out.println("----");
		
		Student s1 = new Student();
		s1.name = "연우";
		System.out.println(s1);
		s1.study();
		
		System.out.println("----");
		
		
		TestClass tc1= new TestClass(); //new 를 할때 힙메모리에 위치값을 만듬 
		System.out.println( tc1 );
	}

}
