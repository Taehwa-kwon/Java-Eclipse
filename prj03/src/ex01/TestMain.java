//======================================연습횟수=====================================  //
// 2월 23일 토요일 1 2 3 4 번 연습 
package ex01;
//======================================key point=====================================  //
// main 안의 재반복은 데이터타입 입력 필요없고 맨아래 method 로 반복 계산을 진행한다.
public class TestMain {
	
	public static void main(String[] args) {
		int num=1;
		String name="아이유";
		int kor =100, eng=100, mat=100;
		int tot1 = sum(kor, eng, mat);
		int avg1 = avg(kor, eng, mat);
		
		System.out.printf("번호 :%d 이름: %s 총점: %d 평균: %d\n",num,name,tot1,avg1);
		                                                                      
		 num = 2;
		 name = "전소미";
		 kor = 100; eng=100; mat=90; // 선언은 변수에서 , 찍어도 되는데 실행은;로 마무리
		 tot1 = sum(kor, eng, mat);
		 avg1 = avg(kor, eng, mat);
		 
		 System.out.printf("번호 :%d 이름: %s 총점: %s 평균: %d\n",num,name,tot1 ,avg1);

		  num=3;
		  name="유이";
		  kor =100; eng=90; mat=100;
		  tot1 = sum(kor, eng, mat);
		  avg1 = avg(kor, eng, mat);
			
		  System.out.printf("번호 :%d 이름: %s 총점: %s 평균: %d\n",num,name,tot1, avg1);
	}

	private static int avg(int kor, int eng, int mat) { // static 이라는 것을 달게 되면 avg라는 메소드는 
		int avg1 = (int)(((kor + eng + mat) /3.0)+0.5) ;	// 즉 static 이 붙어있는 클래스 메소드는 static 이 붙어있지않는 인스턴스 메소드와는 다르게 클래스에 직접 접근해서 실행할수 있다.
		return avg1;
	}

	private static int sum(int kor, int eng, int mat) {
		int tot1 = kor + eng + mat;
		return tot1;
	}
}
