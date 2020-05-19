package ex02;

class Student { 		//private 은 여기 클래스 안에서만 사용할 수 있는 문법적인 뜻
	private int num;
	private String name;
	private int score;
	
	public Student(int num, String name, int score) {
		this.num = num;
		this.name = name;
		
		if(0<=score && score <=100)
		this.score = score;
		else this.score = 0;
	}

	//값을 꺼내기 : Getter 
	
	public int getNum() {
		return num;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
}

public class TestMain {

	public static void main(String[] args) {
		Student s2 = new Student(2,"은영", 100);		//생성자를 통해서 값 저장 가능    - 이건 new 할떄만 넣을수 있지, 만약에 점수를 변경한다..그러면 이 방법ㅇ ㅣ좋지 못하지.
		
		//System.out.println(s2.num+","+s2.name+","+s2.score);
		System.out.println(s2.getNum()+","+s2.getName()+","+s2.getScore());
		
//		Student s1 = new Student();
//		s1.num = 1;
//		s1.name =  "taehwa";
//		s1.score = 100;
	
	}

}
