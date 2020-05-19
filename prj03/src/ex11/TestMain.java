package ex11;

public class TestMain {

	public static void main(String[] args) {
		
	//	Person p1 = new Person(); //Person을 사용하기 위해서
	//	p1.name= "아이유";  //이렇게 직접적으로 넣는거는 굉장히 안좋은 코딩 .
							//값을 넣는방법은 2가지가 있다. 1.생성자에 값을 추가한다.
		Person p1 = new Person("아이유","010-1111-1111"); 
		
		p1.info();
		// System.out.println("p1의 이름: " + p1.name ); //필드안에는 반드시 private 이니깐 이렇게단순하게는 안꺼내짐 .  
		System.out.println("p1의 이름: " + p1.getName()); //그래서 Getter 을 통해서 Person10행 getName:정보를 꺼내는 함수
		
		Person ptemp = new Person(); //입력을 키보드로 받을꺼니깐 이렇게 표현. 만약에 기본생성자  public Person() {} 이게 없으면 오류가 생김. 무조건 만들어놓고 보는게 좋음
		//ptemp.name = "아이유" ; // 이렇게 단순하게 정보를 전달하면 안됌
		ptemp.setName("아이유"); // 값을 전달하는 함수.
		
	}

}
