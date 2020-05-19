//======================================연습횟수=====================================  //
// 2월 23일 토요일 1 2 
package ex04;
//===================================================================================//
//		번호 :     이름 :      국어 :    영어 :   수학 :   합계 :    평균 :     학점 :             		//
//		번호 이름 국어 영어 수학값은 메인에서 전달하고 합계 평균 학점은 다른 클래스에서 구해서 전달하기 .

import java.util.Arrays;

//======================================key point=====================================  //
// 1.시작 - Student s1 = new Student ( ) 값을 입력해서 해당 클래스에 값을 전달해준다.
// 2.Student 에서 필드와 생성자를 입력한다. 필드의 값은 private 이기 때문에 getter /setter 을 펼쳐준다.
// 3. 필드와 생성자끼리 값을 전달 저장해주고.
// 4. 다시 main 에서 s1.dispScores(); 를 생성해준다.
// 5. dispScores() 메소드를 생성해주고 쭉쭉 해나가면 됌!
public class TestMain {

	public static void main(String[] args) {
		
		int [] s100 = new int[] {3,3,3};
		System.out.println(Arrays.toString(s100));
		System.out.println(s100);
		System.out.println(s100.toString());
		System.out.println(s100.hashCode());
		
		Student s1 = new Student(1, "쯔위",100,99,100);
		System.out.println(s1);  
		// ex04.Student@2a139a55 @=헤쉬코드
		// new 를 생성한다는것은 heap공간에 s1에 대한 메모리상의 배치가 일어난다.
		//s1에 대한 배치의 위치가 숫자로 stack에 저장된다. 
		//Student 1 이 stack 에 만들어지고  =new Student 가 heap에 저장.
		// 힙의 메모리의 주소가 @2a139a55(16진수) 이다.
		System.out.println(s1.toString()); // 이건 배열을 뽑아낼때 쓰는것 ,, 만약에 객체 전체값을 알고싶으면 override ToString하면됌 
		System.out.println(","+s1.hashCode()); // 얘는 10진수로 찍히는것 
		s1.dispScores();//번호:1 이름:쯔위 국어:100 영어:99 수학:100 합계:299 평균:99 학점:A  
		
		System.out.println(s1.getNum()+","+s1.getGrade());
		
		
		Student s2 = new Student(2, "쯔위1",90,70,60);
		s2.dispScores();
		System.out.println(s2.getGrade());

		Student s3 = new Student(3, "쯔위2",55,65,78);
		s3.dispScores();
		s3.setMat(98);
		s3.dispScores();

		Student s4 = new Student(4, "쯔위3",82,72,50);
		s4.dispScores();

		Student s5 = new Student(5, "쯔위4",70,100,20);
		s5.dispScores();

		
	}

}
