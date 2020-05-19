package ex09;

public class Cow {
	String name;
	int age;
	

	public void eat(String food) {
		System.out.println(this.name + "가" + food + "를 먹는다");
	}
	
	public void moo() {
		System.out.println("음~메~~");
		
	}

	@Override
	public String toString() {
		return "Cow [name=" + name + ", age=" + age + "]";
	}
	
	

}
