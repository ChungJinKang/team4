package day18.thread;


class Parent {
	
}

class MyThreadLower extends Parent implements Runnable {
	String tName;
	
	MyThreadLower(String tName) {
		this.tName = tName;
	}
	
//	MyThreadLower(String tName) {
//		super(tName);
//	}
	
	@Override
	public void run() {	// public �ٿ����Ѵ�~(�������̽��� �޼���� public abstract�� �� ���Ƿ�!)
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.println(c + "....." + tName);	// getName() ����
			// run()�� ���� �����ؾ���. ���⼭ try catch~
			try {
				Thread.sleep((int)(Math.random()*500));	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class MyThread extends Thread {

	MyThread(String tName) {
		super(tName);
	}
	
	@Override
	public void run() {
		for(char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c + "....." + getName());
			// run()�� ���� �����ؾ���. ���⼭ try catch~
			try {
				sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadTest {
	public static void print() {
		for(int i = 0; i < 26; i++) {
			System.out.println(i);
			try {
				Thread.sleep((int)(Math.random()*500));	//sleep�� static�޼����̹Ƿ� �̷��� �� �� ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("===== main ���� =====");
		System.out.println(Thread.currentThread().getName() + " ������");
		
		MyThread t1 = new MyThread("�빮��1");
		MyThread t2 = new MyThread("�빮��2");
		MyThreadLower t3 = new MyThreadLower("�ҹ���1");
		Thread t4 = new Thread(t3);
		t1.start();
		t2.start();
		t4.start();
		
		print();
		
		
		System.out.println("===== main �� =====");
	}

}
