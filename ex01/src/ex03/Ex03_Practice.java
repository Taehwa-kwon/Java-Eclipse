package ex03;

public class Ex03_Practice {

	public static void main(String[] args) {
		
		
	
		int sum1 = 1+2+3+4+5+6+7+8+9+10;
		System.out.println(sum1);
		
		int sum2=0;
		int n=10;
		
		sum2=n*(1+n)/2;
		System.out.println(sum2);
		
		int sum3=0;
		for(int i1=0;i1<=10;i1++) {
			sum3=sum3+i1;
		} System.out.println(sum3);
		
		int j=0;
		int sum4=0;
		
		while(j<=10) {
			sum4=sum4+j;
			j++;
	
		}
		System.out.println(sum4);
		
		int j1=-1 , sum5=0;
		for ( int i=0 ; i<=10; i++) {
			j1=j1+2;
			sum5=sum5+j1;
			
		}
	
		int sum6=0, j2=1;
		for (int i=0; i<=10; i++) {
			System.out.println("i="+i+"일떄");
			sum6=sum6+j2;
			System.out.println("sum6="+sum6);
			j2=j2*2;
			
			System.out.println("j2="+j2);
		}
		System.out.println("계산결과="+sum6);
		
		
		int t1 =1, t2=2 ; 
		for (int i=1;1<=10;i++) {
			System.out.print(t1+"+");
			
			int sum= t1+t2;
			t1=t2;
			t2=sum;
			
		}
	
	}

}
