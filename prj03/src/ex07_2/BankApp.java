package ex07_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BankApp {
		private static Account2[] accountArray = new Account2[100];
		private static Scanner scanner = new Scanner(System.in);
		private static final String PREFIX = "Bank-";
		private static int seq=0; //계좌번호 자동 발급
		private static boolean isCreated=false; //계좌 등록여부 확인
		
		public static void main(String[] args) {
			boolean run=true;
			while(run) {
				System.out.println("---------------------------------------");
				System.out.println("| 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 |");
				System.out.println("---------------------------------------");
				System.out.println("선택>");
				int selectNo = scanner.nextInt();
				switch(selectNo) {
				case 1: createAccount(); break;
				case 2: accountList(); break;
				case 3: deposit(); break;
				case 4: withdraw(); break;
				case 5: run=false; break;
				}
			}
			System.out.println("프로그램 종료");
			
	}
/*===========================withdraw 메소드=====================================*/
		private static void withdraw() {
			if(!isRegistered()) {
				System.out.println("먼저 계좌를 등록 하세요");
				return ;
			}
			//accountList 메소드
			accountList();
			//계좌번호 선택
			System.out.println("출금할 계좌번호를 선택하세요");
			//출금 (잔액<출금액)
			
			Account2 account;  //class 생성
			while(true) {
				String ano = scanner.next(); //출금 계좌번호 입력
				account = findAccount(ano);
				if(account == null)
					System.out.println("계좌번호를 다시 입력하시오");
				else break;
			}
			//출금처리
			System.out.println("출금할 금액을 입력하시오");
			int amount = scanner.nextInt();
			int result;
			try {
				result = account.withdraw(amount); // 잔액 > 출금액보다 큰 경우
				System.out.println("출금액"+result);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}	
		}
/*===========================withdraw 메소드=====================================*/
		private static void deposit() {
			if(!isRegistered()) {//if(!isCreated)
				System.out.println("먼저 계좌를 등록하시오");
				return; //메소드 호출한 곳으로 돌아감.
			}
		//계좌번호 출력
		accountList();
		//계좌번호 선택
		System.out.println("입금할 계좌번호를 선택하시오");
			//입금
		Account2 account;
		while(true) {
			String ano = scanner.next(); //계좌번호 입력
			account = findAccount(ano);  //입력된 값으로 계좌배열에서 해당하는 계좌정보를 찾아서 리턴받음
			if(account == null) //해당하는 계좌가 없으면
		System.out.println("계좌번호를 정확히 입력하시오");
			else
				break; // 계속 입력받다가 계좌번호가 맞아서 계좌정보를 얻어오면 반복문을 빠져나옴
		}
		System.out.println("입금할 금액을 입력하시오");
		int amount = scanner.nextInt();
		account.deposit(amount); // 입금처리
		System.out.println("예금 성공");
}

/*===========================accountList메소드=====================================*/		
		private static void accountList() {
		if (!isRegistered()) {
			System.out.println("먼저 계좌등록을 하시오");
			return; //메소드 호출한 곳으로 돌아감.
		}
			for (int i=0; i<accountArray.length;i++) {
				if(accountArray[i]!=null) {
					System.out.println(accountArray[i].getAno()+accountArray[i].getOwner()+accountArray[i].getBalance());
				}
			}
		} 
/*===========================createAccount메소드=====================================*/				
		private static void createAccount() {
			//bank-0001,홍길동,100000
			//계좌번호 자동발번
		String ano
		= PREFIX+String.format(new DecimalFormat("0000").format(++seq));
		System.out.println("소유자명");
		String owner = scanner.next();//소유주 입력
		System.out.println("초기입금액");
		int amount = scanner.nextInt(); //초기 입금액 입력
			for(int i=0; i<accountArray.length;i++) {
				if(accountArray[i]==null) {
					accountArray[i] = new Account2(ano,owner,amount);
					System.out.println("계좌 등록 성공");
					isCreated=true;
					//isCreated 변수는 static 이라서 최종값을 가지고 있음
					break;
				}
				//반복문 빠져나가기
			}
		}
		
		//계좌 등록 여부 확인
		private static boolean isRegistered() {
		return isCreated;// 최종상태값을 리턴
		//초기값은 false 고, 계좌등록시 true
		}
		
		//입력된 계좌번호로 계좌정보 조회
		private static Account2 findAccount(String ano) {
			Account2 account = null;
			for (int i = 0; i < accountArray.length; i++) {
				if (accountArray[i]!=null) {
					if (accountArray[i].getAno().equals(ano)) {
						//문자열의 내용비교
					}
					account = accountArray[i];
				}
			}
			return account;
		}

}
