package day18.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// ���� �ڿ�
public class MailBox {
	String msg;
	boolean request = true;
	
	private ReentrantLock lock = new ReentrantLock();
	private Condition forProducer = lock.newCondition();	// �����ڿ� ��
	private Condition forConsumer = lock.newCondition();	// �Һ��ڿ� ��
	
	// �޼��� ����, �����ڷ� ����
	public void setMessage(String msg) {
		lock.lock();
		if(!request) {
			try {
				forProducer.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		request = false;
		this.msg = msg;

		forConsumer.signal(); 		//notify();
		lock.unlock();
	}
	
	// �޼��� �б�, �Һ��ڷ� �о����
	public synchronized String getMessage() {
		lock.lock();
		if(request) {
			try {
				forConsumer.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		request = true;
		forProducer.signal(); //notify();
		lock.unlock();
		
		return msg;
	}
	
}
