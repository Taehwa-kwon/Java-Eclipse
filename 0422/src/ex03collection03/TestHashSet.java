package ex03collection03;

import java.util.Arrays;
import java.util.HashSet;		//또는 *;
import java.util.Iterator;
import java.util.List;

public class TestHashSet {

	public static void main(String[] args) {
		//제네릭 기법(거의 무조건 씀)
		
		HashSet<String> set = new HashSet<String>(); // 이것은 중복이 불가하고 String 타입만 저장가능

		System.out.println(set.size());
		
		set.add("문자열만 입력가능");
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
//		set.add("Java");	//중복이라서 저장되지 않는다.
		
//		HashSet<String> set2 = new HashSet<String>(); // 이것은 중복이 불가하고 String 타입만 저장가능
//		
////		set2.add("문자열만 입력가능");
//		set2.add("Java");
//		set2.add("c");
//		set2.add("c++");
//		
//		set.retainAll(set2);
//		setDisplay(set);
//		
//		set.addAll(set2);
//		
//		System.out.println("------");
//		
//		setDisplay(set);
//		
//		set.removeAll(set2);
//		
//		System.out.println("------");
//		
//		
//		setDisplay(set2);
		
//		System.out.println("합" +  );
		
		System.out.println(set.size());
		
//		//출력 (방법 1. 구조 무조건 외우기)
//		Iterator<String> iter = set.iterator(); //조회함수   iter라는 저장공간과 set이라는 공간이 있는데 set안에는 위에 4가지 값이 있다. 그래서 iterator이 set데이터의 손가락을 가르키고 iter에 넣는다. iterlater위치가 * 이며
//		while (iter.hasNext()) {				// hasNext을 사용해서 다음의 값이 있나없냐를 체크한다. 
//			String element = iter.next();		//				*----------**----------------------		여기에 iter.next()이 자료를 꺼내고 element에 넣어주고 **의 위치로 이동한다.  
//			System.out.print(element + " ");	//				|문자열만입력가능|java|jdbc|Servlet/jsp|		다시 while문이 반복되서 맨마지막에 hasNext()가 없으니깐 사라짐.
//		}										//				-----------------------------------
//			System.out.println();
//			
//			set.remove("JDBC");		
//			iter = set.iterator();		//지금 이미 손가락이 맨마지막 위치에 있으니깐 앞에 Iterator<String>을 달면 안됌.
//			while (iter.hasNext()) {				 
//				String element = iter.next();		  
//				System.out.print(element + " ");		
//			}
//		System.out.println();
//		//----함수로 만들어서 더 간편하게 할수 있다.-----//
		
		//출력 (방법 2. 함수 방법, 더 간편함)
		setDisplay(set);
		set.remove("JDBC");
		setDisplay(set);
		
		set.clear();			//초기화 : 모두 지우기
		if(set.isEmpty());
			System.out.println("자료없음");
			
	/*
			List<String> list = Arrays.asList("java","JDBC");
			
			setDisplay(list);
			set.addAll(list);			// 여러개 지우기
			set.removeAll(list);
			setDisplay(list);
	}
	*/

	}
	
	private static void setDisplay(HashSet<String> set) {
		Iterator<String> iter = set.iterator(); //조회함수 //  iter라는 저장공간과 set이라는 공간이 있는데 set안에는 위에 4가지 값이 있다. 그래서 iterator이 set데이터의 손가락을 가르키고 iter에 넣는다. iterlater위치가 * 이며
		while (iter.hasNext()) {				// hasNext을 사용해서 다음의 값이 있나없냐를 체크한다. 
			String element = iter.next();		//				*----------**----------------------		여기에 iter.next()이 자료를 꺼내고 element에 넣어주고 **의 위치로 이동한다.  
			System.out.print(element + " ");	//				|문자열만입력가능|java|jdbc|Servlet/jsp|		다시 while문이 반복되서 맨마지막에 hasNext()가 없으니깐 사라짐.
				}	
		System.out.println();
			}
	   }

		

