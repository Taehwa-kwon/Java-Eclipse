package ex03collection01;

//import java.awt.List;		윈도우에 있는 함수를 불러올수 있다.
import java.util.Arrays;	//
import java.util.List;		// util 패키지는 java에서 유용한 클래스(Date,Calendar)등이 있고,자료구조와 관련된 Collection 프레임워크 관련 클래스들이 포함) 
//swing은 awt에 있는 그래픽적인 요소를 모아둔것. 윈도우든 유닉스든 모두 상관없이 그래픽적인 요소들을 포함. (윈도우 버튼과, 리눅스 버튼이 모두 달라서 이러한 문제점을 개선한것이 swing(하지만 스윙속도를 포기))

public class TestMain2 {
	
	//배열과 ArrayList 동시에 사용하기
	
	public static void main(String[] args) {
	List<String> list1 = Arrays.asList("세종대왕","이순신","유관순","율곡이이");	//제네릭을 활용해서 동일한 타입을 모아둔것. //Arrays의 asList의 명령을 통해서 저것들을 한번에 담는다.
	//ArrayList<String> list1 = (ArrayList<String>) Arrays.asList("세종대왕","이순신","유관순","율곡이이"); 이것을 간편하게 한것이 List 	

	//enhance for 는 향상된 for문이다.
	//향상된 for문의 장점은 반복변수를 선언하거나 배열의 값을 가져오는 부분 없이 바로 가져올수 있다. for문과 차이는 사실 없음
	
	
	for(String name : list1) {		// list1에 있는 하나씩 name에 담아서 출력출력해주는것.
		System.out.print(name+",");
		
	}
	System.out.println();	

	List<Integer> list2 = Arrays.asList(13,5,7,9,6);
	for (Integer num : list2) {
		System.out.println( num + " ");
		
	}
	}

}
