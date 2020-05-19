package ex05;

import java.util.Scanner;

public class Ex05_Test02_2 {
	
	//======================================변수선언=====================================  //
	public static void main (String[] args) {
	int money = 0;
	Scanner in = new Scanner(System.in);
	money = in.nextInt();
	

	//======================================화폐단위 배열=====================================  //
	int [] currency = new int [] {50000,10000,5000,1000,500,100,50,10};
	//======================================화폐 갯수 저장=====================================  //
		int [] count = new int [8];
	
	
	//========================================설명=========================================  //
	//  count[i]=money/currency[i];    <------뒤에서 앞으로 해석
	// 총금액 / 지폐 액면가로 나누면 그 값이 count[i]에 차례대로 저장된다 . 현재 count[]는 빈공간
	// currency[i]*count[i] => 50000*2장   이런 개념 .
	// money(남은금액) = 투입금액 - (지폐 액면가 * 화폐 갯수)
		
		for (int i = 0; i < count.length; i++) {
			count[i]=money/currency[i];
			money = money-count[i]*currency[i];
		}
	
	System.out.println("========================================");
	System.out.println("남은 잔액은 =0 원 입니다.");
	System.out.println("========================================");
		for (int i = 0; i < count.length; i++) {
			System.out.printf("%7d %7d",currency[i],count[i]);
		}
	
	}

	
		

	
	}

