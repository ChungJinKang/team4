package day18.thread;

// ������ü 
// 100������ 12�� ��ü�غ���
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
