package day18.thread;

// 공유자원
// 계좌이체, 잔고 출력 쓰레드가 사용
public class Account {
	String accNo;
	String ownerName;
	int balance;
	
	public Account(String accNo, String ownerName, int balance) {
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// 예금
	void deoposit(int amount) {
		balance += amount;
	}
	
	// 인출
	int withdraw(int amount) {
		if(amount > balance) {
			System.out.println("잔고가 부족합니다.");
			return 0;
		}
			
		balance -= amount;
		return amount;
	}
}
