package ex05;

public class Student2 {
	private String stnum;
	private String stname;
	private String totscore;
	private String avgscore;
	private String grade;
	
	


	public Student2(String stnum, String stname, String totscore, String avgscore, String grade) {
		super();
		this.stnum = stnum;
		this.stname = stname;
		this.totscore = totscore;
		this.avgscore = avgscore;
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "Student2 [stnum=" + stnum + ", stname=" + stname + ", totscore=" + totscore + ", avgscore=" + avgscore
				+ ", grade=" + grade + "]";
	}

}
