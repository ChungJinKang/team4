package day18.thread;

public class ProducerThread extends Thread {
	MailBox box;
	String[] messages;
	
	
	ProducerThread(MailBox box, String[] messages) {
		this.box = box;
		this.messages = messages;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < messages.length; i++) {
			System.out.println(messages[i] + " ÀúÀåÇÔ");
			box.setMessage(messages[i]);
		}
	}
}
