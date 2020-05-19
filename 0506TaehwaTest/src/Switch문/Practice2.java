package Switch문;

import java.util.Calendar;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String ddi = "";
		Calendar calendar = Calendar.getInstance();
		int thisYear = calendar.get(Calendar.YEAR);

		int birthYear = 0;
		int age = 0;
		
		birthYear=in.nextInt();
		age = thisYear-birthYear+1;
		
		ddi = getInfo(birthYear);
		String ddi2 = getInfo2 (birthYear);
		System.out.println(age);
		System.out.println(ddi);
		System.out.println(ddi2);
		

	}
	private static String getInfo2(int birthYear) {
		String ddi2 = "";
		String [] d = {"원숭이", "닭", "개" , "돼지",  "쥐", "소", "호랑이" , "토끼", "용", "뱀","말","양"};
		ddi2 = d[birthYear%12];
		return ddi2;
	}







	private static String getInfo(int birthYear) {
		String ddi="";
		switch (birthYear%12) {
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
