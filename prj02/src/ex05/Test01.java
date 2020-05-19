package ex05;

public class Test01 {

	public static void main(String[] args) {
	int v ;
	Sachic s =new Sachic();
	//설명
	// Sachic이라는 생성자를 new 전체를 인스턴스화 해서 Sachic이라는 데이터 타입형태의 s안에 넣어둔다.	
	
	v = s.add(7,2);
	//add메소드를 통해서 다음을 실행한다. 
	
	System.out.println(v);
	
	//s.v1 =123; // 변수는 public 안되고 함수만 public 
	// s.v2 = 200;
	s.setV1(321);
	s.setV2(-300);
	v=s.add();
	System.out.println(v);

	}

}
