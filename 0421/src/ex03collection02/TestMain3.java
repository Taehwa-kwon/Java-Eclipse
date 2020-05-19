package ex03collection02;

import java.util.*; //이게 전부다 합친것

import java.util.List;
import java.util.Vector;

public class TestMain3 {
	
	//Vector 는 ArrayList의 Thread Safe버전
	
	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();
		
		System.out.println("자료없음 : " + list.isEmpty());
		
		System.out.println("자료추가중....");
		list.add( new Board(1,"제목","내용"));			
		list.add( new Board(2,"제목","내용"));			
		list.add( new Board(3,"제목","내용"));			
		list.add( new Board(4,"제목","내용"));			
		list.add( new Board(5,"제목","내용"));			
		list.add( new Board(6,"제목","내용"));		
		
		System.out.println("자료없음 : " + list.isEmpty());
		System.out.println("자료수 : " + list.size());
		
		listDisplay(list);
		
		list.remove(2);
		
		listDisplay(list);
	
		System.out.println("자료 초기화중");
		list.clear();
		System.out.println("자료없음 : " + list.isEmpty());
		
		
}

	private static void listDisplay(List<Board> list) {
		System.out.println("====================");
		for (Board board : list) {
			System.out.println(board);
		}
		
	}
}
