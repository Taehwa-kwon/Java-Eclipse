package ex10;
//공통된걸 모아서 한 클래스에 뺴놓고

public class Animal  {

	String name;
	int age;
	
	public void eat(String food) {
		System.out.println(this.name + "가" + food + "를 먹는다");
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";

	}
}
