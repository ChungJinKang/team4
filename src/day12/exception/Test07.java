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
		// �ݳ��� �ڿ������� final ���ÿ�
		
		System.out.println("MAIN END");
	}

}

//day8���� �� ������
class Account {
	private String account;
	private int balance;	

	public Account() {
		super();	// �θ��� ������ �Լ��� call �ϴ� ����, ������ �ڵ� ȣ�� ��
	}
	public Account(String account, int balance) {
		super();
		this.account = account;
		this.balance = balance;
		System.out.println("���� ���� ����!!!");
		print();
	}
	
	// �Ա�, ���,  ������ü, �����������
	public void deposit(int money) throws MoneyCheckedException {
		if(money <= 0 ) throw new MoneyCheckedException();
		balance += money;
		print();
	}
	// MoneyCheckedException -> Exception���� �ǹ� �ֵ��� ����� ���� ���� Ŭ���� ���� 
	public void withdraw(int money) throws MoneyCheckedException {
		if(balance < money) throw new MoneyCheckedException("�ܰ� ����");
		
		balance -= money;
		System.out.println("��� �Ϸ�");
		print();
	}
	public void print() {
		System.out.printf("[���¹�ȣ:%12s �ܰ� :%d]%n", account, balance);
	}
	// �� �޼ҵ�� static�� �ȵ�
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
		super("Money Ȯ��"); 
	}
	MoneyCheckedException(String msg) { 
		super(msg);
	}
}
