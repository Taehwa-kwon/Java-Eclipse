//학점 뽑아내기 
//  0 1 2 3 4 5 6 7 8 9 10
//	F F F F F F D C B A A

// 성적 /10 
package ex05;

import java.util.Scanner;

public class Ex05_Test01_4 {

    public static void main(String[] args) {

		char  [] score  = { 'F' , 'F', 'F', 'F', 'F', 'D', 'C', 'B', 'A', 'A' };
		int grade = 0;
		int tot = grade;
		char Pscore;
		
		Scanner in = new Scanner(System.in);
		System.out.print("당신의 점수는 = " );
		grade = in.nextInt();
		
		tot = grade/ 10 ;
		
		//방법1.
		if(grade<=100 && grade>=90) {
			System.out.println(score[9]);
		}else if(grade<=89&& grade>=80)
			System.out.println(score[8]);
		else if (grade<=79 && grade>=70);
		System.out.println(score[7]);
		
		//방법2.
		Pscore = score[tot];
		//방법3.
		Pscore = score[grade/10];
		//방법4.
		
		
		System.out.println(Pscore);
		System.out.println(tot);
		
System.out.println(score[0]);// F
System.out.println(score[1]);// F
System.out.println(score[2]);// F
System.out.println(score[3]);// F
System.out.println(score[4]);// F
System.out.println(score[5]);// D 
System.out.println(score[7]);// B 
System.out.println(score[8]);// A 
System.out.println(score[9]);// A 
//System.out.println(score[10]);// D 
//System.out.println(score[11]);// D 
System.out.println(score.length); //10개 
		

			
		}



	}


