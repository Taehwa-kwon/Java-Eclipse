package ex03collection04;

public class Member {
	
		 private int age;
		 private String name;
	
	public Member(String name, int age) {
		this.name= name;
		this.age=age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	/*	
	@Override
	public int hashCode() {				//hashcode 같은 객체인지 // equals는 내용이 같은지 
		return name.hashCode()+age;	}	
	
	@Override								// equals 는 메소드이며 내용자체를 비교  , == 연산자는 주소를 비교 
	public boolean equals(Object obj) {		//	set객체안에 Set클래스니깐 이미 이러한 hashCode와 equals의 메소드가 저장되어있다. 그래서 따로 사용하는 부분이 없어도 사용가능
		if(obj instanceof Member) {			//	멤버의 인스턴스냐 아니냐 보고 
			Member mem = (Member) obj;		// obj의 타입에 있는것을 Member타입에 넣으려면 (Member) 강제타입변환 해야함. 부모타입을 -> 자식타입으로 저장하려면
			return mem.name.equals(this.name)&&
					(mem.age == this.age);
		}
		return false;
	}
*/	

	
}
