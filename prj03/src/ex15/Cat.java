package ex15;

//IPet 에서 interface 받았다면 반드시 override 코딩을 해줘야 한다.
	public class Cat implements IPet {
		String name;

		@Override
		public void cry() {
			Cat cat = new Cat();
			cat.name="고양이";

		}

}
