package ex02;

//Nested Class : 중첩 클래스  // Nested for 중첩 for문  
class Test{
	static int a = 10;  //컴파일할떄 미리 만들어서 모든 컴파일 다같이 쓰려고
	int 	   b = 20; // 여기 중괄호 안에서 살아있고 
	
	void    write() {
		final int c = 30; // 상속이 더이상 안되고 자기만 딱 사용하려고!
		int d 		= 40; //
		
				//Inner Class  이건 안의 클래스  딱 여기 안에서만 사용하려구
					class LocalTest {
						void write() {
							System.out.println("a: " + a );
							System.out.println("b: " + b );
							System.out.println("c: " + c );
							System.out.println("d: " + d );
									 }
									}
							LocalTest ob = new LocalTest();
							ob.write();
					}
	
		}

public class TestMain {

	public static void main(String[] args) {
		Test ob = new Test();
		ob.write();

	}

}
