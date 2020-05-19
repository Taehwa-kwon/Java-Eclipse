package ex03collection05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		//Map의 특징은 키는 중복될수 없고 값은 중복가능
		//키값은 대부분이 String 
		//String은 문자열이 같을 경우 동등 객체가 될 수 있도록 hashCode()와 equals() 메소드가 재정의되어 있기 때문
		
		map.put("쯔위",100);	//앞에 key값 //뒤에 values
		map.put("아이유",90);
		map.put("소영",95);
		map.put("수영",93);
		
		System.out.println(map.size()); 
		System.out.println("소영:"+map.get("소영"));	//get()메소드는  키의 값(value)를 리턴
		
		map.put("소영",100); // MAP 에서는 put이 set의 역할을 대신함(수정) 키 값을 기준으로 값을 변경
		System.out.println(map.size());	//
		System.out.println("소영:"+map.get("소영"));  //이렇게 하나하나 해야하나? 이것을 맨밑에서 해결해줌
		System.out.println("쯔위:"+map.get("쯔위"));  //이렇게 하나하나 해야하나? 이것을 맨밑에서 해결해줌
		
		//1.객체를 하나씩 처리 : KeySet 모든 키를 담는것
		System.out.println("=====================");
		Set<String>keySet=map.keySet();	//배열을 대신하는 컬렉션인 set타입으로 꺼냄.// keySet으로 키값을 변수에 담는다.
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next(); //iter.next()가 자료를 꺼내고 변수에 저장
			Integer value = map.get(key);
			System.out.println(key + ":" +value); // 해결방법
			
		}
		//--------------------------------------------------------------
		
		map.remove("아이유");
		System.out.println(map.size());
		
		//2. 객체를 하나씩 처리 : MapEntry
		System.out.println("===========================");		
		Set<Map.Entry<String, Integer>> entrySet= map.entrySet(); //Set<Map.Entry<K,V>>entrySet() 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴
		//map.Entry 가 하나인데 키와 값의 쌍으로 구성된것을 map에 담겨서 Set 배열로 담긴다. 중복되지 아니하는 배열 set에 담아라. 
		Iterator<Map.Entry<String, Integer>> entryIter
				= entrySet.iterator();
		while ( entryIter.hasNext()) {
			Map.Entry <String, Integer> entry = entryIter.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ":" +value);
		}
		
		map.clear();
		if(map.isEmpty())
			System.out.println("자료가 없습니다.");
		
		

	}

}
