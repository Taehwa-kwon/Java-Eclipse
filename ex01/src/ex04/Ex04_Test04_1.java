package ex04;

import java.util.Scanner;

public class Ex04_Test04_1 {
	
	//부서번호를 입력받아 부서명 출력     input process output
	// 10: 인사  20: 자재  30:총무  40:전략
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // ctrl shift o 
		int deptNo;
		
		System.out.println("부서번호를 입력");
		System.out.println("10 : 인사부 , 20: 자재부 , 30 : 총무 , 40 : 전략 ");
		deptNo = in.nextInt();
		
		String deptName;
		deptName = getDeptnoInfo(deptNo);
		
		System.out.println(deptName);
		
	}
/*(public private )Access Modifier =접근 한정자
 10 : 인사부(서울) , 20: 자재부(대전) , 30 : 총무(서울) , 40 : 전략(부산)
 여러개의 변수를 한개로 처리하는 방법!! 이유는 아래의 경우에 부서와 지역의 값을 2가지 return 하고 싶은데 1개 밖에 안되서 .. (만약에 2개를 하고 싶으면 switch 를 2개를 한다 )   
	1.배열 
	2.구조체 record => java 에는 없음  
	3.class  
	4.문자열을 전부 붙힌다.출력에서 문자열 + 문자열   
*/	  
	public static String getDeptnoInfo(int deptNo) {  
		String dName = "" ;  //문자열 초기화는 빈 문자열  
		String dAddress = "";  
		switch(deptNo) {  
		case 10: dName = "인사부"; dAddress = "서울"; break ;  
		case 20: dName = "자재부"; dAddress = "대전"; break ;  
		case 30: dName = "총무부"; dAddress = "서울"; break ;  
		case 40: dName = "전략부"; dAddress = "부산"; break ;  
		}  
		return dName+","+dAddress;  
	}  
  
}  
