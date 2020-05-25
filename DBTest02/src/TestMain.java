import java.util.List;

public class TestMain { //4.

		public static void main(String[] args) {
			DBhandler db = new DBhandler();//4. 목적은 생성자를 생성하는 것 . 생성자에 저렇게 db.open()을 넣어두면  객체를 안만들어도 가능함 .
			
			//여러명의 목록조회
			List<Member> list = db.getMemberList();//4.적어주고  			//7.create 메소드
			//List 의 경우 배열의 일종이지만 자료형의 개수가 가변인 상황에서 사용이 유리하다. 
				//제네릭
			
			//ArrayList aList = new ArrayList();
			//aList.add("hello");
			//aList.add("java");
			//예전의 자바에서 이렇게 타입설정 안하고 넣는것은 문제가 아니지만 꺼낼때는 아래처럼 해야해서 귀찮음. 
			//String hello = (String) aList.get(0); // Object 를 String 으로 캐스팅한다. (String)
			//String java = (String) aList.get(1);
			
			//이게 제네릭스의 장점임 
			//ArrayList<String> aList = new ArrayList<String>();
			//aList.add("hello");
			//aList.add("java");
			//String hello = aList.get(0);
			//String java = aList.get(1);
			
			for (Member member : list) { //4
				//System.out.println(member.toString());
				System.out.println(member.listinfo()); //16.
			}
			
			
			//ArrayList<String> aList = new ArrayList<String>();
			//String자리에는 다양한 자료형이 올수 있다. 
			
			//개인조회
			//Member m = db.getMember(); //4.
			db.close();//4.
			
			
	}


}
