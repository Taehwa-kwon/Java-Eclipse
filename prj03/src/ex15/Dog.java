package ex15;
//class 새로 만들기해서 interface 에 add 눌러서 원하는 IPet 을 입력해주면 바로 생성됌

	public class Dog implements IPet {
		String name;

		@Override
		public void cry() {
			Dog dog = new Dog();
			dog.name= "세바스찬";

	}

}
