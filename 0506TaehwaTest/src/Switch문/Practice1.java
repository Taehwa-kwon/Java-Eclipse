package Switch문;

import java.util.Scanner;

public class Practice1 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int deptNo;
		
		System.out.println("부서번호를 입력하시오");
		System.out.println("10 : 인사부 , 20: 자재부 , 30 : 총무 , 40 : 전략 ");
		deptNo = in.nextInt();
		
		String deptName;
		deptName = getDeptnoInfo(deptNo);
		System.out.println(deptName);
		
	}

	private static String getDeptnoInfo(int deptNo) {
		String dAddress = "";
		String dName= "";
		switch (deptNo) {
		case 10: dAddress="서울";			break;
		case 20: dAddress="부산";			break;
		case 30: dAddress="경기도";			break;
		case 40: dAddress="서울본사";			break;
		default:	break;
		}
		switch(deptNo) {
		case 10: dName="인사부";			break;
		case 20: dName="자재부";			break;
		case 30: dName="총무부";			break;
		case 40: dName="전략부";			break;
		}
		
		return dName+dAddress;
	}
}
