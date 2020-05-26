package preparedstatement;

public class Member {
	
	private  int mid;
	private  String name;
	private  String email;
	private  String phone;
	private  int point;
	private  String rdate;
	
	private  String mlevel; //이건 DB에 없지만 내가 추가시켜주는것 
		//기본 생성자
	public Member() {}
		// 생성자
	public Member(int mid, String name, String email, String phone, int point, String rdate) {
		super();
		this.mid = mid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.point = point;
		this.rdate = rdate;
	}
		// 생성자
	public Member(int mid, String name, String email, String phone, int point, String rdate, String mlevel) {
		super();
		this.mid = mid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.point = point;
		this.rdate = rdate;
		this.mlevel = mlevel;
	}
		//출력용 생성자 getMemberList
	public Member(int mid2, String name2, String email2, String mlevel2) {
		this.mid = mid2;
		this.name = name2;
		this.email = email2;
		this.mlevel = mlevel2;
	}
		//추가용 생성자
	public Member(String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
		// 수정용 생성자
	public Member(String name, String email, String phone, int mid) {
		this.mid = mid;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
		// 개인조회 생성자(태화)

	public Member(int mid) {
		this.mid = mid;
	}
		// 개인조회 생성자(선생님)  //매개변수 순서와 아래의 this의 순서가 중요한가?
		public Member(int mid, String name, String email, String phone, String mlevel, int point, String rdate) { 
			this.mid = mid;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.point = point;
			this.rdate = rdate;
			this.mlevel = mlevel;
	}
	// 전체목록 조회 메소드 
	public String listinfo() {
		String fmt = "%10d %10s %10s  %10s";
		String msg = String.format(fmt, mid,name,email,mlevel);
		
		return msg;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

	public String getMlevel() {
		return mlevel;
	}

	public void setMlevel(String mlevel) {
		this.mlevel = mlevel;
	}

	@Override
	public String toString() {
		return "Member [mid=" + mid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", point=" + point
				+ ", rdate=" + rdate + ", mlevel=" + mlevel + "]";
	}
	
	public String info() {
		String fmt = "%10d %10s %10s %10s %10s %10d %10s";
		String msg = String.format(fmt, mid,name,email,phone,mlevel,point,rdate);
		return msg;
	}





	
}
