package ex07_1;

public class Practice {
	
	public static void main(String[] args) {
		Practice2 acc1 = new Practice2("권태화",630000.0);
		Practice2 acc2 = new Practice2("권태화2",130000.0);
		
		System.out.println(acc1.info());
		System.out.println(acc2.info());
		
		acc1.deposit(90000.0);
		acc2.deposit(0.0);
		
		System.out.println(acc1.info());
		System.out.println(acc2.info());
		
		acc1.deposit(-50000.0);
		
		try {
			acc2.withdraw(250000.0);
			System.out.println(acc2.toString());
			System.out.println(acc2);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
}
