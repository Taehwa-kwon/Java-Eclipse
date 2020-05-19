//문자열(String) 조작  (가장 많이 사용하는 문자열 조작!! 중요도 !!)

package 문자열조작;

public class Ex06_Test01_1 {
	
	public static void main(String[] args) {
		//=============================기본형식==========================/
		//=					문자열 담는 방법 2가지 방법 !						/
		
		String s1 = " Hello 李순신 123 a"; // 공백까지도 데이터로 인식  string = 기본형
		String s2 = new String ("안녕하세요 Mark 31");  //여러개를 따로 담을때 new = 참조형
		
		System.out.println(s1);
		System.out.println(s2);
		//=============================================================/
		
		
		//============================문자열 길이==========================/
		int len1= s1.length(); //갯수를 구하기 위해서
	
		System.out.print("length 문자열 길이 "+len1);
		System.out.println();
		
		String s1_length = String.valueOf(s1.length());
		
		System.out.print("String.valueOf");
		System.out.printf(s1_length);
		System.out.println();
		//배열의 길이를 확인하고, 다시 String타입으로 변환,이때 배열은 참조형이기 때문에 valueOf가 온다.
		
		//=====================특정위치의 문자를 뽑아내기=====================//
		char c1 = s1.charAt(7); // " Hello 이순신 123 " 7번째 글자를 꺼내옴 
		System.out.println("charAt특정위치 문자 추출 "  +c1);
		System.out.println(s1.codePointAt(15)); // 15번째 글자의 유니코드 값을 뽑아냄
		
		//=========================문자열 비교(주소의 비교와 data의 비교====================//
		String s3 = "이순신";
		String s4 = "이순신";
		boolean isSame1 = s3=="이순신1"; // 문자열 비교시 사용금지 
		System.out.println("일반 == 주소 비교 ( 주소비교임 )"+isSame1); //true : 위치비교이고 data의 비교는 아니다  ==<--이거는 주소비교
		boolean isSame2 = s3==s4; // 이것도 위치비교 사용금지 
		System.out.println("일반 == 주소 비교 ( 주소비교임 )"+isSame2);
		
		boolean isSame3 = ("이순신").equals("이순신"); // equals 함수의 역할이   date의 비교이다.
		System.out.println("equals 문자열 비교" + isSame3); //이것만 사용해도 됌 

		
		String s5 = new String("이순신");
		String s6 = new String("이순신");
		
		boolean isSame4 =s5 ==s6; 
		System.out.println("new해도 ==은 주소 비교 "+isSame4);  //false : 위치주소 비교
		
		boolean isSame5 = s5.equals(s6);
		System.out.println("new도 equlas 비교"+ isSame5);  //false : data 비교
				
		
		//===========================문자열 순서 비교=========================//
		String s7 = "이순신";
		String s8 = "이이";
		
		//start 
		int eq = s7.compareTo(s8);	 //문자열 순서 비교
		System.out.println("compareTo 문자열 순서 비교"+eq);		 //음수 : 앞 문자가 작다
									// 0 : 같다
									//양수 : 앞 문자가 크다.
		//이걸로 for 문을 돌릴수 있음 . -,0,+ 값이 의미가 있지 그 해당 글자의 코드는 중요하지 않다.
		eq = s7.compareToIgnoreCase (s8); //문자열 순서비교 (대소문자 무시)
		System.out.println("compareToIgnoreCase 대소문자 무시한 문자열 비교 " + eq);
	
		//문자열 결합
		
//		------------concat-------------
		
//		concat 과 + 연산자는 같은 문자열을 합치는 기능
//		그러나 Concat은 합친 문자열을 String으로 생성해준다.
//		하지만 + 연산자는 문자열을 먼저 StringBuilder로 변환시킨 뒤, 
//		Append로 문자열을 더하고 다시 toString 함수로 문자열로 반환해 주는 방식이다.
		
//		---------Append-----------
//		앞서 +연산자는 문자열을 먼저 StringBuilder로 변환시킨 뒤 Append로 문자열을
//		더하고 다시 toString 함수로 변환시켜 반환해준다.
//		
//		두개의 문자열을 더할때는 Concat을 사용하는것이 좋고
//		여러개를 더해줄때는 그냥 + 연산자를 사용하는것이 좋다
		
		String s9 = s7 + "," + s8 ;  //이게 제일낫다
		System.out.println(s9);
		String s10 = s7.concat(",").concat(s8); //method=함수 chaining (java 에서 class 안의 함수는 전부다 method ) 
		System.out.println(s10);
		
		//java 1.6 이전은 : 문자열연산은 전부 stringBuilder 로 쓰이고 있음
		//java 1.6이후는 그냥 아무거나 해도됌 (concat) 
		//컴파일러가 알아서 변환
		// add(추가) , insert(중간에 추가) , append(맨뒤에 추가)
		//StringBuilder : 문자열 연산시 속도가 빠름
		//					thread safe X 
		//StringBuffer: 문자열 연산시 속도가 빠름
		//					thread safe X
		
		StringBuilder sb= new StringBuilder ();		//쌓아놓고 사용. 
		System.out.println(sb);
		sb.append(s7);
		sb.append("-----------");
		sb.append(s8);
		System.out.println(sb);
		System.out.println(sb.toString());
		
		System.out.println( sb.length() );
		// 012 - = 12개      1415
		// 이순신-----------이이
		// 123 			  1516
		
		// sb.substring(start, end);
		// start : 0~ 
		// end   : 1~
		// 지져쓰.. start 는 0부터 시작하고 end 는 1부터 시작 .!! 
		System.out.println(sb.substring(12,15));   //start 번쨰부터 end까지 잘라내기  
		System.out.println(sb.substring(12));   //start 번쨰부터 끝까지 잘라내기  
	
		//---------------------------------------------
		
	}
}
