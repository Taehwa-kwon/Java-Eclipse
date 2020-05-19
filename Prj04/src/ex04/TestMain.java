package ex04;

//class Member { //예외발생

class Member implements Cloneable {
	

	String id ; 
	String name ;
	String password; 
	int age;
	boolean adult;
	public Member(String id, String name, String password, int age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		if(age>19)
			this.adult =true;
		else
			this.adult=false;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + ", adult=" + adult
				+ "]";
	}
	public Member getClone() {
		//clone () 객체를 복사해준다.
		//CloneNotSupportedException 를 발생시키므로 예외처리를 해야함 
		// 반드시 implements Cloneable를 사용 : 안하면 예외발생
		Member cloned = null;  
		try {
			cloned = (Member) clone();  //try catch 빼고 f2 throw 해도 문제없다.
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // clone이라는 함수 자체가 객체를 카피해주는 능력을 가지고 있다.
		
		
		return cloned;
	}
	
}
public class TestMain {

	public static void main(String[] args) {
		Member m1 = new Member ( "blue", "하늘이", "1111",17);
		System.out.println(m1);   //이상태로 출력하면 이상한 해쉬코드가 나옴 그래서  toString 해준다.
		//getClone() : 객체를 복사해준다.
		Member m2 = m1.getClone();
		System.out.println(m2);
		
		m1.age = 29;
		System.out.println(m2.age);

	}

}
