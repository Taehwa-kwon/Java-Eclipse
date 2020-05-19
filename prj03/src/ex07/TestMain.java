package ex07;

public class TestMain {
	//f3 이랑 alt 뒤로가기
	//계좌정보 입출금 구현
	
	public static void main(String[] args) {
		Account acc1 = new Account("권태화", 630000.0); //내 2월달 월급
		Account acc2 = new Account("송지현", 300000.0); //2월달 국비지원금 ㅋㅋ

		System.out.println(acc1.info());
		System.out.println(acc2.info());
		
		acc1.dsposit(90000.0);
		acc2.dsposit(0.0);
		
		
		System.out.println(acc1.info());
		System.out.println(acc2.info());
		
		acc1.dsposit(-90000.0);
		System.out.println(acc1.info());
		
		try {
			acc2.withdraw(250000.0);
			System.out.println(acc2.toString()); //tostring 가지고 info 처럼 출력가능  //override 를 해야함
			System.out.println(acc2); //  다른방법으로 acc2로만으로도 결과값 도출가능	 	   //override 를 해야함
		} catch (Exception e ) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}

}
