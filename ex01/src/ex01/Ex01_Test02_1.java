package ex01;

import java.awt.SystemColor;

public class Ex01_Test02_1 {
	
	public static void main(String[] args) {
		String name = "아이유";
		int  thisYear = 2020 ;
		int birthYear = 1993 ;
		int age;
		
		System.out.println("이름:" + name);

		age = thisYear - birthYear + 1;
	
		if (age >= 19) 
			System.out.println("성인입니다");
		else
			System.out.println("미성년자입니다");
			

		System.out.print("나이는  " + age + " 입니다");
		
	}

}


