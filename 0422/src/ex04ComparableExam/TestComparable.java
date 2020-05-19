package ex04ComparableExam;

import java.util.Iterator;
import java.util.TreeSet;

// TreeSet을 이용할 경우 속도가 더 빠르고 
// TreeSet에 사용할 객체는 반드시 implements Comparable <Person> 해야한다.

// implement하지 않으면 
//java.lang.ClassCastException : 예외발생
//내부적으로 compareTo() 호출한다, compareTo()를 override 해야한다.

// 객체를 비교하려면 (정렬하기 위해서
// implements Comparable<Person>하라

//treeset을 사용하려면 이 객체는 반드시 implements 를 해야한다. 

class Person implements Comparable<Person>{ //< 1.여기를 반드시 해야함.  그다음에 override
	int num;
	String name;
	int age;
	public Person(int num,String name, int age) {
		this.num = num;
		this.name = name;
		this.age = age;
	}
	
	// 나이가 같으면 저장하지 마라.
	@Override
	public int compareTo(Person o) { // <--2.왜 이런짓을 하느냐 treeSet을 쓰는 이유는 , 자료를 중복하지 않고 저장하려는 목적 . 중복을 막을수 있는 능력이 있는데 여기에 비교할 영역을 저장해준다.
		//return name.compareTo(o.name)- age - o.age;// 만약 45 - 45 = 0  이다. 앞에꺼 크면 양수 // 뒤에꺼 크면 음수 .
		return num-o.num;			//이건 기본키를 기준으로 한다.
	}
}
public class TestComparable {

	public static void main(String[] args) {
		// TreeSet : 중복하지 않고 tree 저장
		// 나이가 같으면 저장하지 마라.
		TreeSet<Person> treeSet = new TreeSet<> (); // person타입을 담는 TreeSet . 제네릭을 쓴 이유는 person만 담을것이다. 
													//set은 여러개의 변수를 모아 둔것.
		treeSet.add(new Person(1,"홍길동",45));		//이것보다는 기본키 (바뀔수 없는 식별번호)를 사용하는게 더 훌륭하지.
		treeSet.add(new Person(2,"홍길순",25));		//map 시리즈들은 put해서 값을 넣고 set은 arrayList ,vetor은 add 이다.
		treeSet.add(new Person(3,"박명수",31));
		treeSet.add(new Person(1,"홍길동",45));
		treeSet.add(new Person(4,"고길동",45));
		
		for (Iterator<Person> iterator = treeSet.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator. next();
			System.out.println(person.name + "," + person.age);
		}
	}
}
