package day18.thread;

public class SharedArea {
	Account lee;
	Account sung;
	
	public SharedArea(Account lee, Account sung) {
		this.lee = lee;
		this.sung = sung;
	}
	public synchronized void print() {
		int amount = lee.balance + sung.balance;
		System.out.println("�ܰ��հ�= " + amount);
	}
	public void trensfer() {
		synchronized(this) {	// SharedArea�� �����ϱ� ������ this!!!, �� ��ü�� ���� �ɰڴ�.
			// lee���� ����
			int amount = lee.withdraw(100);
			// sung�� �Ա�
			sung.deoposit(amount);
			System.out.println(amount + "�� ��ü��");				
		}
	}
	
}
