package ex03collection02;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		//변수 여러개를 한번에 처리하려면 클래스를 만들어야 한다.
		
		ArrayList<Board> boardList = new ArrayList<>(); //한개의 번호,주제,내용을 다 입력한다.

		boardList.add( new Board(1,"제목","내용"));			
		boardList.add( new Board(2,"제목","내용"));			
		boardList.add( new Board(3,"제목","내용"));			
		boardList.add( new Board(4,"제목","내용"));			
		boardList.add( new Board(5,"제목","내용"));			
		boardList.add( new Board(6,"제목","내용"));		
		
		ArrayList_display(boardList);
		
	}

	private static void ArrayList_display(ArrayList<Board> boardList) {
		for (Board board : boardList) {
			System.out.println(board);
		}
		
	}			

}
