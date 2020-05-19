package IF문;

import java.util.Calendar;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		Scanner in = new Scanner(System.in);
		
		int thisYear = calendar.get(Calendar.YEAR);
		int thisMonth = calendar.get(Calendar.MONTH);
		int thisDate = calendar.get(Calendar.DATE);
		System.out.println(thisYear);
		System.out.println(thisMonth);  //
		System.out.println(thisDate);

		String name = "태화";
		int age;
		System.out.println("태어난 연도를 입력하시오");
		int birthYear = in.nextInt();
		
		age = thisYear-birthYear+1;
		
		if(age>=19)
			System.out.println("성인");
		else 
			System.out.println("미성년자");
		
		System.out.println(age);
		
		System.out.println("거주지를 선택하시오");
		System.out.println("1.서울 2.거제 3.부산 4.경기도");
		int sido = in.nextInt();
		String address = "";
		
		switch(sido) {
		case 1 : address="서울";break; 
		case 2 : address="거제";break; 
		case 3 : address="부산";break; 
		case 4 : address="경기도";break; 
		default : address="외국"; break;
		}
		
		System.out.println(address);
				

	}

}
