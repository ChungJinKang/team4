package day18.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// 공유 자원
public class MailBox {
	String msg;
	boolean request = true;
	
	private ReentrantLock lock = new ReentrantLock();
	private Condition forProducer = lock.newCondition();	// 생산자용 락
	private Condition forConsumer = lock.newCondition();	// 소비자용 락
	
	// 메세지 저장, 생성자로 저장
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
	
	// 메세지 읽기, 소비자로 읽어들임
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
