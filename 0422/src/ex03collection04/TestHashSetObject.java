package ex03collection04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSetObject {

	public static void main(String[] args) {
		
		//Set : 자료를 중복하지 않는다.
		Set<Member> set = new HashSet<Member>(); //hashSet의 부모가 Set임. 모든걸 커버하려고 
		
		set.add(new Member("홍길동",27));	//홍길동 자바의 옵티마이저가 같은 공간에 저장 그다음에 동일한 문자가 있을경우 그 주소 값을 그대로 가져옴, hashCode객체의 주소값이 같은지 다른지, 홍길동+나이의 해쉬코드와 아래의 홍길동+나이의 해쉬코드를 비교해서 같으면 equals를 한번더 비교 
		set.add(new Member("홍길동",27));	//equals 대상의 
		set.add(new Member("홍길순",27));	
		
		System.out.println("자료수:"+set.size());
		
		set.remove(new Member("홍길순",27));
		System.out.println("자료수:" + set.size());
		
		for (Iterator iterator = set.iterator() ;	
					  iterator.hasNext();) {
			Member member = (Member) iterator.next();
			System.out.println(member.getName() + "," + member.getAge());	//.으로는 private에 접근불가!!
			
		}
		
		

	}
		

}
