package ex04ComparableExam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

// TreeSet 은 Set의 효과인 중복을 제거하고 sorting하는 효과를 가짐

//Comparator은 compare를 사용 - 객체간의 특정한 정렬이 필요한 경우

class Fruit{
	 String name;
	 int price;

	public Fruit(String name, int price) {		//1.가정 : 누군가가 이미 Fruit를 만들었고 다른곳에서 Fruit를 이용해서 사용했다. 고참이 Fruit를 건들지 말어라 (고치지 말아라)
		this.name = name;
		this.price = price;
	}
	
}
//----------------------------가격순-----------------------------//
class DescendingComparator implements Comparator<Fruit>{ 	//Comparator이거는 별도의 키를 여러가지 만들수 있다.  중복제거효과 + 정렬(오름차순)효과 
																
	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o1.price-o2.price;		//o2.price - o1.price는 내림차순효과
	}
	
}
//----------------------------가격순-----------------------------//


//----------------------------이름순-----------------------------//
class DescendingComparatorByname implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o2.name.compareTo(o1.name);		//글자를 비교할때는 compareTo사용
			
	}
	
}
//----------------------------이름순-----------------------------//

// 중복없이 내림차순 정렬
public class TestComparator {

	public static void main(String[] args) {
		//TreeSet<Fruit> treeSet = new TreeSet<>(); //이렇게하면 오류가 뜬다. 인터페이스 사용하고 재정의하고 사용하면 되는데 가정이 있으니깐.
		
		//----------------------------가격순-----------------------------//
		/*TreeSet<Fruit> treeSet 
			= new TreeSet<Fruit>(new DescendingComparator());	//Fruit를 건들거나 고치면 안되니깐(이 말의 의미는 원래처럼 하면 재정의 해야 비교를 할수 있으니깐) 생성자에 new 해서 넣어준다.*/ 
		//----------------------------이름순-----------------------------//
		TreeSet<Fruit> treeSet
			= new TreeSet<> ( new DescendingComparatorByname());
		
		
		treeSet.add( new Fruit("포도",3000));
		treeSet.add( new Fruit("귤",5000));
		treeSet.add( new Fruit("딸기",6000));
		treeSet.add( new Fruit("딸기",6000));
		treeSet.add( new Fruit("오렌지",2000));
		
		
		
		System.out.println(treeSet.size());
		Iterator<Fruit> iter = treeSet.iterator();
		while(iter.hasNext()) {
			Fruit fruit = iter.next();
			System.out.println(fruit.name+fruit.price);
		}
	}

}
