package taehwa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*  // 입력자료 - 하나씩 배열, 만약 한사람의 정보를 묶어서 배열 만들면 class
			사번, 이름, 입사일, 월급, 보너스, 부서번호
			empid, name, hiredate, sal, comm, deptid

	// 출력자료
	// 조건1 : 입사일로 오름차순 정렬
	// 조건2 : 연차 5년마다 추가보너스 sal * 3
	// 조건3 : 연봉순서 등수출력
	// 부서번호 - 10:인사 20:자재 30:총무 40:개발 50:서비스
		사번, 이름, 입사일, 월급, 보너스, 실수령, 부서명, 연차, 연봉순서         계산하면 숫자, 안하면 글자
		empid, name, hiredate, sal, comm, pay, deptname, years, payrank  

	// 부서별정보
	부서번호 부서명 인원수 평균월급 최고월급자 최소월급자
	did, dname, dcount, dtotpay, davgpay, dmaxpay, dminpay, dmaxname, dminname
*/

class Employee{
	static 
	
	 int empid;
	 String name;
	 int hiredate;
	 int sal;
	 int comm;
	 int deptid;

//기본생성자
public Employee() {}
//생성자
public Employee(int empid,String name, int hiredate, int sal, int comm, int deptid) {
	this.empid=empid;
	this.name=name;
	this.hiredate=hiredate;
	this.sal=sal;
	this.comm=comm;
	this.deptid=deptid;	
	}
}
public class HomeWork {

	public static void main(String[] args) throws IOException {	//FileWriter 예외처리
		File file = new File("Finder:");	// Mac 위치지정  역슬래쉬 2개 or / 이거 하나
				
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		//키보드 입력부
		Scanner in = new Scanner(System.in);
		System.out.println("다음을 입력하시오");
		System.out.println("사번\t 이름\t 입사연도\t 월급\t 보너스\t 부서번호\t 종료(Exit)");
		
		//개인별, 팀별 , 사원 월급 , 부서 월급
		bw.write("사번\t 이름\t 입사연도\t 월급\t 보너스\t 부서번호\t 근속년수\t 수령액\t");
		while(true) {
		String inputLine = in.nextLine();
		
		if(inputLine.equalsIgnoreCase("exit" + "Exit" + "e")) break;
		String [] str = inputLine.split(",");	
		
		 int empid = Integer.valueOf(str[0].trim());
		 String name = str[1].trim();
		 int hiredate = Integer.valueOf(str[2].trim());
		 int sal = Integer.valueOf(str[3].trim());
		 int comm=Integer.valueOf(str[4].trim());
		 int deptid=Integer.valueOf(str[5].trim());
		
		
		Employee emp = new Employee(empid, name, hiredate, sal, comm, deptid);
		
		String msg = emp.toString();
		bw.write(msg);
		
		switch(deptid) {
		
		}
		
		}
		
		
		
		
		
		bw.close();
		fw.close();
		
		System.out.println(file.getName()+"정상적으로 저장되었습니다.");
		

		
		
	}

}
