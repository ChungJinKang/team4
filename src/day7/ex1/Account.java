package day7.ex1;

public class Account {
	// ���� ��ȣ, �ܰ�
	// encapsulation ����~~
	private String account;
	private int balance;	

	public Account() {
		super();	// �θ��� ������ �Լ��� call �ϴ� ����, ������ �ڵ� ȣ�� ��
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
	
	// �Ա�, ���,  ������ü, �����������
	public void deposit(int money) {
		balance += money;
		print();
	}
	public void withdraw(int money) {
		if(balance >= money)
			balance -= money;
		else
			System.out.println("�ܰ� ����");
		print();
	}
	public void print() {
		System.out.printf("[���¹�ȣ:%12s �ܰ� :%d]%n", account, balance);
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
