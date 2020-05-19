package ex02;
	// new 를 통해서 만들것이기 때문에 add  // new 를 통해서 만든다면 static	
	
	//=====================================중요한 개념=====================================  //
	// return값이 전달되는 이유도 새로운 클래스는 기본형이 아니라 참조형이라서 return값이 전달된다.
	
	public class Sachic {
		
		public int add(int v1, int v2) {  
			return v1 + v2;
		}
	
		public int sub(int v1, int v2 ) { 
			return v1 - v2 ;
			
		}
		public int mul(int v1, int v2 ) { 
			return v1 * v2 ;
			
		}
		public int div(int v1, int v2 ) { 
			int v;
		//======================================try catch=====================================  //	
		// 				catch (Exception e ) 는 고정격식
		try {
			v = v1 / v2;
			return v ;
		}catch (Exception e) {
			System.out.println("계산오류발생" + e.getMessage()); // e.getMessage 를 통해서 자세한 오류의 메세지를 확인가능
			return 0;
		}
		
	}
	
}
