package day18.thread;

public class MailBoxTest {

	public static void main(String[] args) {
		MailBox box = new MailBox();
		String[] messages = {"호우", "날두는", " 호우!!" + " 하고 날지" + " 호우!"};
		ProducerThread t1 = new ProducerThread(box, messages);
		ConsumerThread t2 = new ConsumerThread(box, messages.length);
		
		t1.start();
		t2.start();
	}

}
