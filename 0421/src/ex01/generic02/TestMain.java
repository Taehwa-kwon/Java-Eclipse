package ex01.generic02;

class Car{
	String name;
	public Car() {}
	public Car(String name) {
	this.name = name;
	}
}
class Tv{}

//=================================================================//
class Product <T,M>{ //p1,p2 의 클래스 
	T kind;	// Tv t;
	M model;
	
public Product() {}	//<이건 p1과 p2의 기본생성자

public Product(T kind,M model) {
	this.kind = kind;
	this.model = model;
	
	}
}

//상속
class newProduct <T,M,C> extends Product<T,M> {
	C color;

	public newProduct(T kind, M model, C color) {
		
		super(kind,model);
		this.color = color;
	}
}

public class TestMain {

	public static void main(String[] args) {
		Product<Tv,String> p1 = new Product<Tv,String>(); 	//< > 안에 생략가능   Tv타입,String타입
		p1.kind = new Tv();
		p1.model = "SmartTv";
		
		Car d520 = new Car();
		Product<Car,String> p2 = new Product<>(); 	// < > Car과String
		p2.kind = d520;
		p2.model = "C-class";
		
		newProduct<Car,String,Integer> np1 = new newProduct(d520,"520d",0xff0000);
	}
}
