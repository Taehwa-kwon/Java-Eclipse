package ex04ComparableExam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

	class treeSet {
}


public class TestComparable2 {
	
	
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();		//Q1, Q2.어떤경우에 Set<Person> treeSet = new TreeSet<>();	을 하냐? 
	
		ArrayList<Person> al = new ArrayList<>();		//A1.이 친구와
		Vector<Person> v = new Vector <> ();			//A1.이  친구의 조상을 한번에 
														
		List<Person> list = new ArrayList<>();			//A2. List를 Array로
		List<Person> list2 = new Vector<>();			//A2. List를 Vector로 
		
	//	HashSet<Person> set = new HashSet<>();		//Q3.만약 얘를 활성화 한다. 얘의 부모는 Set이다. 나머지의 부모는 List이고 그럼 어떻게 해야하냐 하면 공통분모인 Collection을 사용한다.
		
	
	
	listDisplay(al);
	listDisplay(v);
	listDisplay(list);
	listDisplay(list2);
//	listDisplay(set);
	
	
	
	}
//	private static void listDisplay(Collection<Person> v) {		//A3.이렇게 공통조상으로해서 한번에 메소드 다 모을수 있음
//		// TODO Auto-generated method stub
//		
//	}
	
	private static void listDisplay(List<Person> v) {		//Q2.이렇게 공통조상으로해서 한번에 메소드 다 모을수 있음
		// TODO Auto-generated method stub
		
	}
//
//
//	private static void listDisplay(Vector<Person> v) {			//A1.Vetor의 메소드 따로
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void listDisplay(ArrayList<Person> al) {		//A1. ArrayList 메소드 따로.. 매우 귀찮아서
//		// TODO Auto-generated method stub
//		
//	}
}
