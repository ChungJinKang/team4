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
	

	// �Ա�
	public boolean deposit(int money) {
		if(money >= 0) {
			balance += money;
			return true;	// �Ա� ����
		}
		return false;		// �Ա� ����
	}
	
	// ���
	public int withdraw(int money) {
		if(money >= 0 && balance > money) {
			balance -= money;
			return money;	// ��� �ݾ� ����
		}
		return 0;			// ��� �ݾ��� 0
	}
	
	// a���·� ������ü
	public void transfer(Account a, int money) {
//		if(a != null && a.getAccountNum() != null) {	// ��ü�� null�� �ƴϰ� ���°� �����Ҷ�
//			if(balance >= money && a.deposit(money)) {	// �x���� ���� ����ϰ�, ��ü�� ���¿��� �Ա��� �����Ҷ�
//					balance -= money;
//			}
//		}
		if(a == null || a.getAccountNum() == null)
			return;
		if(a.deposit(money))
			withdraw(money);
		
	}
	
	// �����������
	public void print() {
		System.out.println("[ ���� ���� ]");
		System.out.printf("���� ��ȣ: %s%n", accountNum);
		System.out.printf("�ܰ�: %d%n", balance);
	}
}
