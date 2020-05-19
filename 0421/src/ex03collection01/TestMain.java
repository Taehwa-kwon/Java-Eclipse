package ex03collection01;

import java.util.ArrayList;

class Car{}

public class TestMain {

	public static void main(String[] args) {
		//제네릭 버전이 아닌것-----------------
		// 해당 타입의 변수만 저장할 수 있도록 타입을 제한하는 것이 제네릭임
		
		//ArrayList 순서를 유지하고 저장 + 중복 저장 가능
		ArrayList al = new ArrayList();			//ArrayList를 쓴다는 것은 Object로 작업
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40.7);
		al.add("taehwa");
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println("ArrayList(제네릭 버전x)"+al.get(i));
		}
		
		System.out.println("=======================");
	
		
		al.add( new Car());
		Car mycar = (Car) al.get(5);		//5번째 자리에 이 값을 넣어준다. object 타입이니깐 Car타입으로 바꿔서 넣어야한다.
		System.out.println(al.get(5));
		
		
		System.out.println("=======================");
		//-----------------------------------------------------------------
		
		
		//Generic 버전 자바1.5버전부터 가능
		// 해당 타입의 변수만 저장할 수 있도록 타입을 제한하는 것이 제네릭임
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("1번");
		names.add("2번");
		names.add("3번");
		names.add("4번");
		names.add("5번");  // 중복값도 가능.
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println("Generic 기본 출력" + names.get(i));
		}
		
		//names 출력함수 : 출력
		p_taehwa(names);
		
		//요소삭제
		names.remove(2);
		
		
		//출력
		System.out.println("=======================");
		for (int i = 0; i < names.size(); i++) {
			System.out.println("삭제후 출력"+names.get(i));
		}
		System.out.println("=======================");
		
		//요소추가
		names.add("Taehwa");
		//출력
		for (int i = 0; i < names.size(); i++) {
			System.out.println("요소 추가후 출력"+names.get(i));
		}
	}

	private static void p_taehwa(ArrayList<String> names) {
		System.out.println("=======================");
		for (int i = 0; i < names.size(); i++) {
			 System.out.println("ArrayList"+ names.get(i));
		}
	}

}
