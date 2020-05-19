package ex07_1;

public class Practice2 {
	private String name;
	private double money;
	

	
	public Practice2(String name, double money) {
		this.name=name;
		this.money=money;
		
	}



	public String info() {
		String fmt = "%s 님의 계좌잔액은 %.3f";
		String msg = String.format(fmt, name,money);
		return msg;
	}



	public void deposit(double amount) {
		if (amount > 0)
			this.money = this.money + amount;
		else
			System.out.println("정확하게 입력하시오");
		
	}



	public void withdraw(double amount) throws Exception {
		if(this.money-amount>0 && amount>0 )
			{this.money=this.money-amount;
		System.out.println(amount + "출금 되었습니다.");}
		else 
			throw new Exception ("잔액이 부족합니다");
	}

	

}
