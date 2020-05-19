package ex04;

public class TestMain {

	public static void main(String[] args) {
		
		Dog dog 	= new Dog();
		dog.name 	= "바둑이";
		dog.age		= 1;
		dog.eat();
		dog.bark();
		
		Cat cat		= new Cat();
		cat.name	= "수수";
		cat.age		= 2;
		cat.eat();
		cat.barkbark();
				
		Animal an1 	= new Animal();
		an1.name	= "동물";
		an1.age		= 6;
		an1.eat();
		
		an1 = dog;    //업캐스팅을 한다. 부모 = 자식      Dog 클래스인 dog를 Animal클래스로 변경 
		//an1.eat();
		System.out.println("----------------");
		//------------------------------------------------------------//
		Dog newDog = dog;	// int a = b;  dog에 있는 정보들을 newDog에 다 넣는것
		newDog.eat();
		
		//newDog = cat; 이건 절때 안됌. 자식 부모간의 관계가 아니라서.
		
		newDog = (Dog)an1;	//자식 = (자식) 부모  임 .. 이건 다되는건 아니고   			위에서 an1 = dog; 이렇게 바꿨을경우에만 가능
		newDog.eat();
		
		
		System.out.println("----");
		animal_eat(an1);
		animal_eat(dog);
		animal_eat(cat);

		
	}

	private static void animal_eat(Animal an1) {
		an1.eat();
		
		if( an1 instanceof Dog) //an1 이 Dog 자식인가?  객체 instanceof 클래스 // 부모 조상  
			((Dog)an1).bark();
		if( an1 instanceof Cat)
			((Cat)an1).barkbark(); //an1 이 cat의 자식인가?
		
	}

}
