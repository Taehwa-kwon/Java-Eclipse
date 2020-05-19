package ex05;
//======================================설명=====================================  //
// new 해도 서로 s1,s2 는 1차이 나는 메모리에 저장하지 않고 마구잡이 저장
class Student {
}
public class TestMain {

public static void main(String[] args) {
	//String [] args : main 함수의 인수처리 
	//명령형 인자 처리 
	// package explore 의 prj03_.ex05-> 해당 파일 오른쪽 마우스 -> run As -> Run cofiguration -> arguments 탭에 인자를 입력 (공백으로 인자를 분리)
	for (int i = 0; i < args.length; i++) {
		System.out.println(i + ":" + args[i]);
	}
		Object obj = new Object();
		System.out.println(obj); //equals , hashCode메모상의 위치 , toString 이 인스턴스 정보를 출력해준다. + 메모리의 위치까지 ,   
		
		Student s1= new Student();
		System.out.println(s1);
		
		Student s2= new Student();
		System.out.println(s2);
	}
}