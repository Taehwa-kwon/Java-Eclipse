//숫자 반복 문 

package ex03;

public class Ex03_Test05_1 {

	public static void main(String[] args) {
		
		
		//1+2+3+...9+10
		int sum1 = 1+2+3+4+5+6+7+8+9+10;
		System.out.println(sum1);
		
		//sum = n * (n+1) /2) ;
		int n = 10;
		int sum2 = n * (n+1) / 2;
		System.out.println(sum2);
		
		//for 문 사용
		int sum3 = 0;
		for (int i = 1; i <= 10; i++) {
			sum3 = sum3 + i ;
			System.out.print(sum3);
		}
		System.out.println();
			//while for 은 서로 매우유사함
		
		int icnt=1, sum4=0;
		while ( icnt<=10 ) { 
				sum4 = sum4 + icnt;
				icnt++;
				System.out.println("while문 " + sum4);
		}
		
	
		//--------------------------------------
		
		// 1 2 3 4        =10
		//1+3+5+7+9+..+19 = 19
		
		int j1 = -1, sum5 = 0;             // i= 1일때 j=1 이되고 sum5 =1 
		for(int i = 1;i<=10;i++) {    	  //  i= 2가 되면 j=3 이되고 sum5=(앞에 sum5)1+(이번에 j1)3 
			j1 = j1+2;
			sum5 = sum5 + j1;
			
		}
			System.out.println(sum5);
			System.out.println(j1);
			
			
			// 1+2+4+8+16+32+64
			
		int a =1 , sum100=0 ; 
		for (int i = 1;i<=3;i++) {
			sum100 = sum100 + a ; 
			a = a*2;
			System.out.println("a= " + a );
		}System.out.println("sum100= " + sum100);
		
		
		//1+2+3+5+8+13+21+34+55+89
	//그러니깐 1=t1 2=t2 sum=3 이렇게 한칸씩 밀려간다는 느낌으로 이해하면 됌  // 어짜피 출력은 첫번째 t1 이니깐 
		
        int f = 10, t1 = 1, t2 = 2;
        for (int i = 1; i <= f; ++i)
        {
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2; 
            t2 = sum;
        }
		
        System.out.println("\n");
        //초기값 t1 = 1 t2=2 시작
        // t=1 일때 sum = 1 + 2 -> t1=t2;에서 t2의 값이 t1으로 들어가고 t1=1이되고 t2=sum 에서 sum값 3이 t2로 들어간다.
        // 계속 반복 
		
        
        int t=0 , t11=1 ,t12=0, sum10=0 ; 
        for (int i = 1; i <= 20; i++)
        {
        
           t= t11+t12;
           sum10=sum10+t;
           t12=t11;
           t11=t;
           
        }
        System.out.println(t+","+ sum10);
		//for 안에 문자가 사용되면 반드시 초기화를 해줘야 한다.
        
		

	}

}
