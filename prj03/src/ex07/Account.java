package ex07;
//은행관련 코딩
//https://micropai.tistory.com/48

public class Account {
	//fields 변수 선언
	private String name;	//	이름
	private double money; 		//돈정보
	
	//Constructor 기본 생성자 (
	public Account() {}
	
	//신규계좌 생성
	public Account( String name, double money) {
		this.name = name;
		this.money = money;
	}
	//Getter / setter  
	
	//Methods
	
	//잔액확인
	public double getBalance () {
		return this.money; //현재잔액 // 정보만을 받아야함, 전달하는 값이 들어가면 안됌
	}
	
	//출금 (인출)
	public void withdraw(double amount) throws Exception {
		if (this.money-amount>0 && amount > 0) {
		this.money -=amount;
		System.out.println(amount + "출금 되었습니다.");
		} else {
			throw new Exception("잔액이 부족합니다."); //에러를 띄우기 위함
		}
	}
	
	//입금
	public void dsposit(double amount) {
		if(amount > 0)
			this.money +=amount;
		else
			System.out.println("입금액을 정확히 입력하시오.");

	}
		//현재 정보 출력
		public String info() {
			String fmt = "%s님의 계좌잔액은 %.3f";
			String msg = String.format(fmt, name, money);
			System.out.printf("%s %.3f",name,money);
			System.out.println("\n");
			return msg;
			
		}

		@Override
		public String toString() {
		
			String fmt = "%s님의 계좌잔액은 %.3f";
			String msg = String.format(fmt, name, money);
			return msg;
		
		}
}
