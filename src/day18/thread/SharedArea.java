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
		System.out.println("잔고합계= " + amount);
	}
	public void trensfer() {
		synchronized(this) {	// SharedArea를 공유하기 때문에 this!!!, 이 객체에 락을 걸겠다.
			// lee에서 인출
			int amount = lee.withdraw(100);
			// sung에 입급
			sung.deoposit(amount);
			System.out.println(amount + "를 이체함");				
		}
	}
	
}
