package ex05;

import java.util.Scanner;

public class Ex05_Practice {

	public static void main(String[] args) {
		String ddi = "";
		int birthYear= 0;
		
		System.out.println("당신이 태어난 년도를 입력하시오 = ");
		Scanner in = new Scanner(System.in);
		birthYear = in.nextInt ();
		ddi = getDdi(birthYear);
		 
		
		
		System.out.println("당신의 띠는 = " + ddi );
	}

	private static String getDdi(int birthYear) {
		String ddi = "";
		
		switch (birthYear % 12) {
		case 0 : ddi = "원숭이"; break;
		case 1 : ddi = "닭" ; break;
		case 2 : ddi = "개" ; break;
		case 3 : ddi = "돼지"; break;
		case 4 : ddi = "쥐" ; break;
		case 5 : ddi = "소" ; break;
		case 6 : ddi = "호랑이"; break;
		case 7 : ddi = "토끼"; break;
		case 8 : ddi = "용"; break;
		case 9 : ddi = "뱀"; break;
		case 10: ddi = "말"; break;
		case 11 : ddi = "양"; break;
		}

		
		return ddi;
	}

}
