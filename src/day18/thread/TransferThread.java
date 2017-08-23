package day18.thread;

// 계좌이체 
// 100만원씩 12번 이체해보자
public class TransferThread extends Thread {
	SharedArea sharedArea;
	
	public TransferThread() {
		super();
	}
	public TransferThread(SharedArea sharedArea) {
		super();
		this.sharedArea = sharedArea;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 12; i++) {
			sharedArea.trensfer();
		}
	}
	
	
}
