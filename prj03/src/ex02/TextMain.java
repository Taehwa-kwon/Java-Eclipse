//======================================연습횟수=====================================  //
// 2월 23일 토요일 1 2 3 4 번 연습 
package ex02;
//======================================key point=====================================  //
// 새로운 클래스안에서 모든 정의를 마치고 메인에서 사용할때는 해당 클래스 타입의 변수명을 입력해주면 됌. s 
class Student {
	int num;
	String name;
	int kor, eng, mat;
	int tot, avg;
}

public class TextMain {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.num = 1;
		s.name = "아이유";
		s.kor = 100; s.eng=100; s.mat =100;
		
		 s.tot = s.kor + s.eng + s.mat;
		 s.avg = (s.kor + s.eng + s.mat)/3;
		System.out.println("번호\t 이름\t 총점\t 평균\t");
		System.out.printf("%d\t %s\t %d\t %d\t \n", s.num,s.name,s.tot, s.avg);
		
	}
}
