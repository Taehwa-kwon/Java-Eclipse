//문자열(String) 조작  (가장 많이 사용하는 문자열 조작!! 중요도 !!)
package 문자열조작;

public class Ex06_Test02_1 {

	public static void main(String[] args) {
		//문자열 찾기
		String s1 = "이순신";
		System.out.println( s1.contains("순신")); //일부 포함의 여부
		System.out.println( s1.contentEquals("순신")); // 전체일치
	
		// 포함하는 문자가 있어? 그럼 어디에 있어? 문자열의 위치  활용도가 높다.
		int pos1 = s1.indexOf("순신"); 
		if (pos1<0)
			System.out.println("문자열을 못찾았다");
		else
			System.out.println("순신의 위치= " + pos1); // 0부터 시작하니깐
		
		String s2 = "Java 언어, java 웹, Java 싫어";
		int pos2 = s2.indexOf("Java"); //한글자 찾기
		System.out.println(pos2);
		int pos3 = s2.indexOf("Java", pos2 + 1); //두글자 찾기 // 시작이 0부터 시작 // 첫번쨰 Java + 1 은 그다음 Java 니깐 17번쨰 위치에 존재 
		System.out.println(pos3);
		
		int pos4 = s2.lastIndexOf("Java"); //이건 뒤에서 부터 
		System.out.println(pos4);
		
		int pos5 = s2.lastIndexOf("Java", pos4-1);  
		System.out.println(pos5);
		
		System.out.println(s2.toLowerCase()); // case 가 대소문자
		int pos6_1 = s2.toLowerCase().indexOf("java");
		System.out.println(pos6_1);
		int pos6_2 = s2.toLowerCase().indexOf("java", pos6_1 + 1);
		System.out.println(pos6_2);
		int pos6_3 = s2.toLowerCase().indexOf("java", pos6_2 + 1);
		System.out.println(pos6_3);
		
		//문자열 비어있는지 검사
		String sa1 = "abcdef";
		String sa2 = "";
		
		System.out.println(sa1.isEmpty()); //empty 비어있는지 false
		System.out.println(sa2.isEmpty()); // true
		System.out.println(sa1.equals("")); // true
		System.out.println(sa2 == ""); // true 이지만 주소를 비교하는것임 ..값을 비교한것이 아니다.
		
		// 문자열을 숫자로 변환
		String sv1 = "123";
		// int    n1 = (int)sv1; // error 
		int       n1 = Integer.parseInt(sv1);  
		//int 기본형 = Integer 참조형  10진수값
		//parseInt 문자열을 int 형으로 바꾸는것 
		System.out.println(n1 * 3.5);
		
		int      n2 = Integer.valueOf(sv1); // 추천
		//valueOf는 Integer 래퍼 객체를 반환
		// 참조형 타입인 Integer로 반환
		System.out.println(n2 * 3.5);
		Integer in2 = Integer.valueOf(n2); // int 와 Integer 을 valueOf로 바꿀수 있다.
		System.out.println(in2 );
		
		//-----------------------------------//
		//문자열을 실수로 변경
		
		String sv2 = "189.345";
		double n3 = Double.parseDouble(sv2);
		System.out.println( n3/ 10);
		
		//-------------------------------------//
		//모든 숫자를 글자로 변경
		int num1 = 123;
		// String sv4 = num1.toString (); // error
		//String sv4 = (String) num1; // error cassting 연산자..
		String sv4 = num1 + ""; //잔머리
		String sv5 = String.valueOf(num1); // 추천
		// 실수는 어떻게?
		double num2 = 123.4567;
		String sv6 = String.valueOf(num2);
		System.out.println(sv6);
		
		
	}

}
