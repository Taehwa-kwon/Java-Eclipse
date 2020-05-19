package ex03collection06;

//hash 는 중복하지 않는 특징이 있다 ( equals와 hashCode를 통해서)

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import ex03collection04.Member;

public class TestHashMap {

	public static void main(String[] args) {
		Map<Student, Integer> map =new HashMap<Student,Integer>();
		
		map.put(new Student(1,"홍길동"),95);
		map.put(new Student(2,"홍길순"),90);
		map.put(new Student(1,"홍길동"),95);
		
		System.out.println(map.size()); //지금은 3이 나옴. 이러면 안되지 ...2개가 나와야하는데 ㅡㅡ ㅅㅂ 그래서 Hash로 풀어야함
		
		mapDisplay(map);
		
	
		

	}

	private static void mapDisplay(Map<Student, Integer> map) {
		//출력하는것도 해보자
	}

}
