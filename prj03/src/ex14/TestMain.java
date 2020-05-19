package ex14;

public class TestMain {
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.name = "오목";
		cat.climb();
		cat.cry();
		
		
		Dog dog = new Dog();
		dog.name = "바둑";
		dog.swim();
		dog.cry();
		
		
		life(cat, "참치");
		life(dog, "뼈다귀");
		
		//Animal beast = new Animal();     //추상클래스 abstract (new 불가능 )<---> 구상 클래스 concreate (new 가능 ) 
				
	}

	private static void life(Animal pet, String food) {
		pet.eat(food);
		pet.cry();
		if( pet instanceof Cat )
			((Cat) pet).climb();
		if(pet instanceof Dog);
			((Dog) pet).swim();
			
		
	}
}
