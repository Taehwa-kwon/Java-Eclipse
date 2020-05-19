package ex06;

public class Ex06_Test {

	public static void main(String[] args) {
		
		String s1 = "Hello 이순신 123 a";
		String s2 = new String ("안녕하세요 Mark 31");
		
		System.out.println(s1);
		System.out.println(s2);
		
		int len1=s1.length();
		System.out.println(len1);
		
		char c1 = s1.charAt(7);
		System.out.println(c1);
		System.out.println(s1.codePointAt(7));
		
		String s3 = "이순신";
		String s4 = "이순신1";
		boolean isSame = s3.contentEquals("이순신");
		boolean isSame1 = s3.contentEquals("이순신");
		
		System.out.println(isSame);
		System.out.println(isSame1);
		
	}

}
