package day18.thread;

// �����ڿ�
// ������ü, �ܰ� ��� �����尡 ���
public class Account {
	String accNo;
	String ownerName;
	int balance;
	
	public Account(String accNo, String ownerName, int balance) {
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// ����
	void deoposit(int amount) {
		balance += amount;
	}
	
	// ����
	int withdraw(int amount) {
		if(amount > balance) {
			System.out.println("�ܰ� �����մϴ�.");
			return 0;
		}
			
		balance -= amount;
		return amount;
	}
}
