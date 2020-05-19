package ex04ComparableExam;

import java.util.TreeSet;
	//TreeSet의 사용 약속 !-------
	// 사용되는 class 는 반드시 comparable interface를 implement해야 한다.
	// 否则的话 出现classCastException 



	//접근제한자 : Access modifier
	//private default protected public (4종류)

	// private 				: 만든 클래스 안의 전역변수
	// package(default) 	: 같은 패키지(bin폴더)안의 전역변수	(아무것도 안적었을때 )
	// protected			: 같은 패키지 + 상속받은 관계 안의 전역변수
	// public 				: 모든 class 안에서 전역변수


	//	자바에서 모든 클래스는 사실 Object를 암시적으로 상속받고 있는 것이다. 

class Student implements Comparable<Student>{	//4. TreeSet의 약속 		
						//	자바는 컴파일할떄 이 클래스 1개당 1개의 dll을 만듬. C#은 전체를 하나의 Dll을 만들고
	 					//	Dll은 동적 링크라고 하며 실행 파일에서 해당 라이브러리의 기능을 사용 시에만, 라이브러리 파일을 참조하여(혹은 다운로드받아) 기능을 호출한다.
						// 	라이브러리: 우리가 sysout이런거 하면 어디서 불러오는거지? math() 메소드는 ? 그런걸 편하게 해둔게 라이브러리.

	private int 	num;
	private String 	name;
	private double 	celcius;
	
	Student(){}
	
	Student(int num, String name, double celcius){
		this.num=num;
		this.name=name;
		this.celcius=celcius;
	}

	@Override
	public int compareTo(Student o) {	//5.인터페이스 사용은 compareTo 재정의하고 여기서 인자에 타입은 이 모든것들이 Student 타입이니깐. 
		//object compareto 는 비교할때만 , To
		return this.num -o.num; //return 0;은 에러없이 끝났다는 말을 한다.
	}
}

public class TestComparable3 {

	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<>();
		
		Student s1 = new Student (1,"태화",36.4);//1.이렇게 넣고
		treeSet.add(s1);//2.이렇게 하면 두번 일하는거지? 차라리
		
		treeSet.add( new Student (1,"태화",36.4)); //3.이렇게
		treeSet.add( new Student (2,"석준",36.9));//3.이렇게
		treeSet.add( new Student (3,"원석",36.8));//3.이렇게
		treeSet.add( new Student (3,"원석",36.8));//3.이렇게
		
		System.out.println(treeSet.size());
		
		
		
		
		
		
		//treeSet.add();

	}

}
