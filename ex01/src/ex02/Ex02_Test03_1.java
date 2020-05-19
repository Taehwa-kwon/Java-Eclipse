	

package ex02;

//===========================================================================  //
//	10000점이상 = vip          5000점 이상 = gold              1000점이상 = silver 		//
//			당신의 점수를 입력하시오                                 당신의 등급은 grade 입니다 	     	   		//
//===========================================================================  //
public class Ex02_Test03_1 {

	public static void main(String[] args) {
	
		String 	name 	="태화";
		int 	point	= 12000;
		String	grade 	="";
		
//		grade = "VIP";
//		grade = "gold";
//		grade = "silver";
		
		
		// 중첩 if (nested if)
		if (point >= 10000) 
			grade = "VIP";
		 else 
			 if ( point >= 5000 ) 
				 	grade = "gold";
			  else 
				 if (point >= 1000)
				 grade = "sliver";
			 
		
		System.out.println(name + " 님은 " + grade + "입니다" );
		
	}

}
