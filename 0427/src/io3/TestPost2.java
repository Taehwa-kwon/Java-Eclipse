package io3;

import java.util.Scanner;

public class TestPost2 {

	 public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in); // 사용자의 입력을 받을 Scanner 객체 생성
	  String inputStr = sc.nextLine(); // 사용자가 입력한 문자열(한 문장)을 inputStr에 저장
	  String result = ""; // 중복이 되지 않은 문자열을 저장할 문자열 생성
	  
	  for(int i = 0; i < inputStr.length(); i++) { // i가 0부터 사용자가 입력한 문자열의 길이만큼 반복문을 돌린다.
	   if(!result.contains(String.valueOf(inputStr.charAt(i)))) { // 사용자가 입력받은 문자열의 i번째 문자를 String으로 바꾸고 result에 이 문자가 포함되어 있지 않다면
		   															//charAt 는 해당되는 문자열을 반환 . 
	    result += String.valueOf(inputStr.charAt(i));  // result에 계속 추가, 즉 중복되지 않으면 추가
	    
	    
	    //i 는 몇 글자를 검색하는지 보는거고 ,암누우머누우퍼미미 이렇게 검색하면 결과는 암누우머퍼미 가 나온다 . 
	    // 이유는 뒤에서 부터 읽으면 0 번째인덱스 : 암 이라는 글자를 문자열로 바꿔서 result와 비교하는데 포함되어 있지 않다면 출력한다. 
	   }
	  }
	  System.out.println(result);

	}

}
