package ex04;

import java.util.Calendar;
import java.util.Scanner;

public class Ex04_Test01_2 {

	public static void main(String[] args) {
			
		int age;
		boolean adult;
		
		int thisyear=2020;
		Calendar calendar = Calendar.getInstance();
		int thisYear= Calendar.YEAR;
		
		int birthYear = 0;
		String animal;
		
		Scanner in = new Scanner(System.in);
		System.out.println("태어난 연도를 입력하시오 = ");
		birthYear = in.nextInt();
		age=thisyear-birthYear+1;
		
		System.out.println(age);
		
		adult = (age>19);
		if (adult=true)
			System.out.println("성인");
		else
			System.out.println("미성년자");

		}
		
	}
