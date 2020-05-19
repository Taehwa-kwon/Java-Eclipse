package ex04;

public class Student {
	// Fields  - 즉 저장할공간 System.out.println()에서 System이라는 클래시의 out이라는 멤버변수를 사용한 것 
		private int num;
		private String name;
		private int kor,eng, mat;
	
		//getter   //setter   //private 가 있으면 getter,setter 모두 있어야 한다.
		//alt + shift + s 
		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getKor() {
			return kor;
		}

		public void setKor(int kor) {
			this.kor = kor;
		}

		public int getEng() {
			return eng;
		}

		public void setEng(int eng) {
			this.eng = eng;
		}

		public int getMat() {
			return mat;
		}

		public void setMat(int mat) {
			this.mat = mat;
		}

		// constructor 생성자

		public Student(int num, String name, int kor, int eng, int mat) {
			this.num = num;
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
		}
		
		//methods - 기능을 나타내며 항상 () 을 사용
		public int getTot () {
			int tot = this.kor +this.eng +this.mat ;
			return tot;
		}
		public int getAvg () {
			int avg = getTot()/3 ;
			return avg;
		}
		public char getGrade () {
			char [] grade = {'F','F','F','F','F','F','D','C','B','A','A'};
			
			return grade[ getAvg()/10];
		}
		public void dispScores() {
			System.out.printf(
					"번호:%d 이름:%s 국어:%d 영어:%d 수학:%d 합계:%d 평균:%d 학점:%s  \n",  
					this.num, this.name, this.kor, this.eng, this.mat,
					getTot(), getAvg(), getGrade());
			
		}
}
