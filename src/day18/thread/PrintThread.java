package day18.thread;


// 3�� �ܰ��հ� ���
// ��ȸ
public class PrintThread extends Thread {
	SharedArea share;
	
	public PrintThread(SharedArea share) {
		this.share = share;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			share.print();
		}
	}
	
}
