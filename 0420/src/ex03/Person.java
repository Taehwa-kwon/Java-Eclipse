package ex03;

//	public class Person extend Object{ //이것이 생략된거다 . Object 안에 tostring hashCode,equals, getClass 등등이 만들어져 있다.
//	암시적으로  object를 상속받고 있다. 모든 클래스가 공통으로 포함하고 있어야 하는 기능을 제공

// 공통부분 
public class Person {
	
	 String name;
	 String tel;
	

	
	//method override
	
	@Override
	public String toString() {
		return " [name=" + name + ", tel=" + tel + "]";
	}
}
