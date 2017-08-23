package day7.ex1;

public class Account {
	// 계좌 번호, 잔고
	// encapsulation 과정~~
	private String account;
	private int balance;	

	public Account() {
		super();	// 부모의 생성자 함수를 call 하는 문장, 지워도 자동 호출 됨
	}
	public Account(String account, int balance) {
		super();
		this.account = account;
		this.balance = balance;
	}
	
	public String getAccount() {
		return account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 입금, 출금,  계좌이체, 통장정보출력
	public void deposit(int money) {
		balance += money;
		print();
	}
	public void withdraw(int money) {
		if(balance >= money)
			balance -= money;
		else
			System.out.println("잔고 부족");
		print();
	}
	public void print() {
		System.out.printf("[계좌번호:%12s 잔고 :%d]%n", account, balance);
	}
	public void transfer(Account to, int money) {
//		if(balance >= money) {
//			balance -= money;
//			to.balance += money;
//		}
		
		withdraw(money);
		to.deposit(money);
		
	}
	public void transfer(Account from, Account to, int money) {
//		if(from.balance >= money) { 
//			from.balance -= money;
//			to.balance += money;
//		}
		from.withdraw(money);
		to.deposit(money);
	}
}
