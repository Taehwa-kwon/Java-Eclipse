//MID,NAME,EMAIL,PHONE,POINT,ML.MLEVEL, RDATE

public class Member {	//5.
	
	private int mid;
	private String name;
	private String email;
	private String phone;
	private int point;
	private String mlevel;
	private String rdate; 
	
	//13 생성자 생성
	public Member() {}
	//14.목록조회 생성자
	public Member(int mid, String name, String email, String mlevel, String rdate) {
		this.mid = mid;
		this.name = name;
		this.email = email;
		this.mlevel = mlevel;
		this.rdate = rdate;
	}
	//15. 개인조회 생성자
	public Member(int mid, String name, String email, String phone, int point, String mlevel, String rdate) {
		this.mid = mid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.point = point;
		this.mlevel = mlevel;
		this.rdate = rdate;
	}
	// addMember의 생성자
	public Member(String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public Member(int mid,String name, String email, String phone, int point) {
		this.mid = mid;
		this.name=name;
		this.email = email;
		this.phone = phone;
		this.point = point;
	}
	// 목록조회 mid,name,email,mlevel,rdate
	public String listinfo() { //16
		String fmt ="%10d %10s %10s %10s %10s ";
		String msg = String.format(fmt, mid,name,email,mlevel,rdate);
		return msg;
	}
	
	//getter /setter 
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
	public String getMlevel() {
		return mlevel;
	}
	public void setMlevel(String mlevel) {
		this.mlevel = mlevel;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	@Override	//17번째 debugging 
	public String toString() {
		return "Member [mid=" + mid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", point=" + point
				+ ", mlevel=" + mlevel + ", rdate=" + rdate + "]";
	}
	public String info() { //23
		String fmt ="%10d %10s %10s %10s %10d %10s %10s ";
		String msg = String.format(fmt, mid,name,email,phone,point , mlevel, rdate);
		return msg;
	}
	
	
}
