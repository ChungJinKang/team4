package day12.exception;

public class Test07 {

	public static void main(String[] args) {
		Account account = new Account("2017002", 2000);
		
		try {
			account.withdraw(200);
			account.withdraw(700);
			account.withdraw(2000);
		} catch (MoneyCheckedException e) {
			System.out.println(e.getMessage());
		}
		// 반납할 자원있으면 final 쓰시오
		
		System.out.println("MAIN END");
	}

}

//day8에서 좀 가져옴
class Account {
	private String account;
	private int balance;	

	public Account() {
		super();	// 부모의 생성자 함수를 call 하는 문장, 지워도 자동 호출 됨
	}
	public Account(String account, int balance) {
		super();
		this.account = account;
		this.balance = balance;
		System.out.println("계좌 개설 성공!!!");
		print();
	}
	
	// 입금, 출금,  계좌이체, 통장정보출력
	public void deposit(int money) throws MoneyCheckedException {
		if(money <= 0 ) throw new MoneyCheckedException();
		balance += money;
		print();
	}
	// MoneyCheckedException -> Exception보다 의미 있도록 사용자 정의 예외 클래스 만듦 
	public void withdraw(int money) throws MoneyCheckedException {
		if(balance < money) throw new MoneyCheckedException("잔고 부족");
		
		balance -= money;
		System.out.println("출금 완료");
		print();
	}
	public void print() {
		System.out.printf("[계좌번호:%12s 잔고 :%d]%n", account, balance);
	}
	// 이 메소드는 static이 안됨
	public void transfer(Account to, int money) {
		try {
			withdraw(money);
		} catch (MoneyCheckedException e) {
			e.printStackTrace();
		}
		try {
			to.deposit(money);
		} catch (MoneyCheckedException e) {
			e.printStackTrace();
		}
	}
	@Override
	public String toString() {
		return "Account [account=" + account + ", balance=" + balance + "]";
	}
	
}

class MoneyCheckedException extends Exception {
	MoneyCheckedException() { 
		super("Money 확인"); 
	}
	MoneyCheckedException(String msg) { 
		super(msg);
	}
}
