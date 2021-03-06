package day7;

public class Account {
	private String accountNum;
	private int balance;
	
	public Account() {
		
	}
	
	public Account(String accountNum, int balance) {
		this.accountNum = accountNum;
		setBalance(balance);
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int money) {
		if(money >= 0)
			balance = money;
	}
	

	// 입금
	public boolean deposit(int money) {
		if(money >= 0) {
			balance += money;
			return true;	// 입금 성공
		}
		return false;		// 입급 실패
	}
	
	// 출금
	public int withdraw(int money) {
		if(money >= 0 && balance > money) {
			balance -= money;
			return money;	// 출금 금액 리턴
		}
		return 0;			// 출금 금액은 0
	}
	
	// a계좌로 계좌이체
	public void transfer(Account a, int money) {
//		if(a != null && a.getAccountNum() != null) {	// 객체가 null이 아니고 계좌가 존재할때
//			if(balance >= money && a.deposit(money)) {	// 춝금할 돈이 충분하고, 이체할 계좌에서 입금이 성공할때
//					balance -= money;
//			}
//		}
		if(a == null || a.getAccountNum() == null)
			return;
		if(a.deposit(money))
			withdraw(money);
		
	}
	
	// 통장정보출력
	public void print() {
		System.out.println("[ 계좌 정보 ]");
		System.out.printf("계좌 번호: %s%n", accountNum);
		System.out.printf("잔고: %d%n", balance);
	}
}
