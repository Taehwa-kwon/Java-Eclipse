package ex03collection02;

public class Board {
// 수시로 증가, 감소하는 게시판 글의 수
	//ArrayList와 Vetor의 차이는 쓰레드의 유무차이. 있으면 vetor
	private int bnum; //boardNumber
	private String subject;
	private String content;

	public Board(int bnum, String subject, String content) {
		this.bnum = bnum;
		this.subject = subject;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Board [bnum=" + bnum + ", subject=" + subject + ", content=" + content + "]";
	}
	
		


}
