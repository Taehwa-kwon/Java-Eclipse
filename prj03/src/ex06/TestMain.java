package ex06;
//개념을 위한 코딩. 이렇게 코딩하면 안됌

class Student{
	String name;
	String tel;
	public void info() {
		System.out.println(name + "," + tel );
	}
	//== 의 기본값은 hashCode 주소비교
	//String equals 는 값을 비교하도록 재정의 되어있다.
	//기능 재 정의 = overRide
	//기존의 equals 기능을 수정 (재정의를 통해서 아래의 값을 찾아줌  )
	//@override - annotation의 약자 : 컴파일에게 정보를 준다.
	//혹시 오타가 발생하여 다른 메소드로 인식하지 않도록 
	//alt + shift + s 를 눌러서 overRide
	
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (tel == null) {
//			if (other.tel != null)
//				return false;
//		} else if (!tel.equals(other.tel))
//			return false;
//		return true;
//	}
	
	//재정의를 하려면 object 로 받아야 하고 

	@Override
	public boolean equals(Object obj) {
		boolean isSameName = false ; 
		boolean isSameTel = false ; 
		
		Student other = (Student) obj; //이름을 한번더 바꿔줌...
		
		isSameName = this.name.equals(other.name); // obj에 있는 name을 비교해서
		isSameTel = this.tel.equals(other.tel);
		
		return isSameName && isSameTel ;
		
		
	}
	
}
public abstract class TestMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "쯔위";
		s1.tel = "010-1234-1111";
		s1.info();
		
		Student s2 = new Student();
		s2.name = "정연";
		s2.tel = "010-1234-2222";
		s2.info();
 
		Student s3 = new Student();
		s3.name = "정연";
		s3.tel = "010-1234-1111";
		s3.info();
		
//New 를 할 경우 새로운 객체를 만듬. 
		String A = "AAA";
		String B = A;
		String C = new String("AAA");
		// == 이건 주소값을 비교하는 연산자
		//A와 B의 주소값은 같음 / A와 C의 주소값은 다름
		//equals 는 값을 비교하는 메소드
		
		
		//hashCode 비교 
		if (s2==s3)//우리는 값을 비교하고싶다 .즉 같은사람을 찾고싶다.
			System.out.println("1.중복");
		else 
			System.out.println("1.미중복");  //힙 메모리상의 위치가 다름.
		
		if(s2.hashCode()==s3.hashCode()) //이것도 안됌
			System.out.println("2.같은사람");
		else 
			System.out.println("2.다른사람");
		
		//equals () 를 재정하기전에 다른사람이지만 
		//재정의 한 후에는 같은사람
		
		if(s2.equals(s3))			
			System.out.println("3.같은사람");
		else 
			System.out.println("3.다른사람");
		
		
		//값을 비교 이름,전화
		//문자열 비교는 이렇게 하면 안됌 
		//boolean isSameName=s1.name == s3.name;
		boolean isSameName=s2.name.equals(s3.name);
		System.out.println(isSameName);
		
		// 	문자열 비교는 이렇게 하면 안됌
		//boolean isSameTel=s1.tel == s3.tel;
		boolean isSameTel=s2.tel.equals(s3.tel);
		System.out.println(isSameTel);
		
		if (isSameName && isSameTel)
			System.out.println("같은사람");
		else 
			System.out.println("다른사람");
	}

}
