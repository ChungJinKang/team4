package day18.thread;

public class ConsumerThread extends Thread {
	MailBox box;
	int cnt;
	
	public ConsumerThread(MailBox box, int cnt) {
		this.box = box;
		this.cnt = cnt;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < cnt; i++) {
			String msg = box.getMessage();
			System.out.println(msg + " ÀÐ¾úÀ½");
		}
	}
}
