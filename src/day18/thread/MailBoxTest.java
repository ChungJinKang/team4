package day18.thread;

public class MailBoxTest {

	public static void main(String[] args) {
		MailBox box = new MailBox();
		String[] messages = {"ȣ��", "���δ�", " ȣ��!!" + " �ϰ� ����" + " ȣ��!"};
		ProducerThread t1 = new ProducerThread(box, messages);
		ConsumerThread t2 = new ConsumerThread(box, messages.length);
		
		t1.start();
		t2.start();
	}

}
