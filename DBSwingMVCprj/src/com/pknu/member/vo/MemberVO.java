package com.pknu.member.vo;

public class MemberVO {
	//1. 필드를 먼저 생성한다.
	//static을 붙이면 생성자가 안만들어지네 ?? 
	// 정적공간 : Static : 메모리의 지정된 공간에 딱 하나씩만 존재하게 된다. 컴파일할때부터 이 요소가 차지할 메모리 용량을 딱 지정해줌 .
	// 동적공간 : Static이 없는 것 
	private  String id;
	private  String pwd;
	private  String name;
	private  String job;
	private  String gender;
	private  String intro;
	private  String regdate;
	
	
	
	//2.Constructor생성자 생성
	public MemberVO(String id, String pwd, String name, String job, String gender, String intro, String regdate) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.job = job;
		this.gender = gender;
		this.intro = intro;
		this.regdate = regdate;
	}
	//16. 방법2 배열 생성자 
	public MemberVO(String[] cols) {
		this.id = cols[0];
		this.pwd = cols[1];
		this.name = cols[2];
		this.job = cols[3];
		this.gender = cols[4];
		this.intro = cols[5];
		this.regdate = cols[6];
	}
	//추가 생성자
		public MemberVO(String id, String pwd, String name, String job, String gender, String intro) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.job = job;
		this.gender = gender;
		this.intro = intro;
	}
		
	public MemberVO(String id) {
		this.id = id;
		}
	
	//삭제하는 생성자 
	public MemberVO(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	//3.toString
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", job=" + job + ", gender=" + gender
				+ ", intro=" + intro + ", regdate=" + regdate + "]";
	}
	//4.Getter/Setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	public String info() {
		String fmt = "%s %s %s %s %s %s %s";
		//String genderKor = (gender.equals("M"))?"남자 " : "여자 ";
		String genderKor = "";
		switch(gender) {
		case "M" : genderKor = "남자"; break;
		case "F" : genderKor = "여자"; break;
		default : genderKor = "N/A";
		}
		String rdate = regdate.substring(0,10);
		
		//String year = rdate.substring(rdate.indexOf("-")-1); 
		
		String msg = String.format(fmt, id, pwd, name, job, genderKor, intro, rdate);
		
		return msg;
	}
	
	
	
	public String listInfo() {
		String fmt = "%s %s %s %s %s %s %s";
		String msg = String.format(fmt, id, pwd, name, job, gender, intro, regdate);
		
		return msg;
	}
	
	
	
	
	
}
