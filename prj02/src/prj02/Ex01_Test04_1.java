
package prj02; // 패키지란 prj 안에 있는것들 공유하는것. 원래라면  1메인에 1패키지가 되어야 하는데 수업을 편하게 하기 위해서 한 패키지안에 넣어두는것
		//============================설명===============================  //
		//Main안에서 인스턴스해서 새롭게 만들어진 클래스타입 시작
		// Sachic2 클래스 안에 각각의 메소드 실행
class Sachic2 { 
	public int add (int v1, int v2) { // 앞에 생략되어있으면 access Modifier 이 packge 레벨임 ( public, private ) public 을 붙여주자 
		return v1 + v2;
	}
	public int sub (int v1, int v2) {
		return v1 - v2;
	}
	public int mul (int v1, int v2) {
		return v1 * v2;
	}
	public int div (int v1, int v2) {
		return v1 / v2;
	}
}
	
public class Ex01_Test04_1 {  //3행이랑 21행이랑 비교했을때 여기는 public 이 있는데 파일명과 동일하게 이름을 지어줘야 한다. 
	
	public static void main(String[] args) {
		int a= 7 , b=2;
		int c;
		//============================설명===============================  //
		// 생성자를 새로 생성해 인스턴스해서 Sachic2라는 클래스타입의 s1에 저장한다.
		Sachic2 s1 = new Sachic2();
		
		c= s1.add(a,b); //앞에 public 하니깐 여기서 s1. 했을때 add.sub.mul.div 가 나옴 
		System.out.println(c);
		
		c = s1.mul(a, b);
		System.out.println(c);

	}
}


