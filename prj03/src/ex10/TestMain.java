// https://madplay.github.io/post/java-upcasting-and-downcasting 굉장히 좋은설명

package ex10;

public class TestMain {

	public static void main(String[] args) {
		Cat cat = new Cat ();
		cat.name = "아롱이";
		cat.age = 4;
		cat.eat("고등어");
		cat.meow();
		
		Dog dog = new Dog(); 		//다른 타입객체는 저장안됨 type 불일치 // // Cat cat = new Dog(); error 발생
		dog.name="다롱이";
		dog.eat("사료");
		dog.bark();

		
//		부모클래스이면 자식클래스의 인스턴스를 바꿀수 있다. 
		Animal anim = new Cat(); //upcasting 부모를 바꾸는것
		anim.name = "아롱이 주니어";
		anim.eat("참치");
		Cat cat3 = (Cat) anim;  //anim의 타입을 cat으로 강제변환하는것!  부모를 자식타입으로 바꿔주는걸 downcasting 
		cat3.meow();
		
//		Cat cat4 = new Animal(); // type mismatch 클래스는 같은 타입끼리만 new 를 할수있다.
//		다른타입일경우 new가 되는경우 부모가 상속될때는 가능하다. 
//		anim 은 타입이 
		anim = new Dog();
		anim.name = "멍멍이";
		anim.eat("beaf");
		((Dog)anim).bark();
		
		
		animal_eat(cat, "고등어2");
		animal_eat(dog, "고등어2");

     }

	private static void animal_eat(Animal pet, String food) {
		System.out.println("animal_eat");
		
		pet.eat(food);
		if( pet instanceof Cat  ) // animal_eat(Animal pet,String food) 인데 해당 인스턴스가 Cat 타입(객체) 인가? 
			((Cat) pet).meow();
		if( pet instanceof Dog  )//pet은 dog타입인가?
			((Dog) pet).bark();
	}


	
}
