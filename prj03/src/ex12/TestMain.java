package ex12;


class InstCnt{
	//int instNum = 0;
	static int instNum = 0;  // static 을 붙이자 결과값 1,2,3 이 도출됌 . static 은 
	InstCnt() {
		instNum = instNum + 1;
		System.out.println(instNum);
	}
	
}

public class TestMain {

	public static void main(String[] args) {
		InstCnt ic1 = new InstCnt();
		InstCnt ic2 = new InstCnt();
		InstCnt ic3 = new InstCnt();
		

	}

}
