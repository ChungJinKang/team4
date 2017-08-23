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
	public void run() {	// public 붙여야한당~(인터페이스의 메서드는 public abstract이 꼭 들어가므로!)
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.println(c + "....." + tName);	// getName() 없음
			// run()은 형태 유지해야함. 여기서 try catch~
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
			// run()은 형태 유지해야함. 여기서 try catch~
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
				Thread.sleep((int)(Math.random()*500));	//sleep은 static메서드이므로 이렇게 쓸 수 있음
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("===== main 시작 =====");
		System.out.println(Thread.currentThread().getName() + " 쓰레드");
		
		MyThread t1 = new MyThread("대문자1");
		MyThread t2 = new MyThread("대문자2");
		MyThreadLower t3 = new MyThreadLower("소문자1");
		Thread t4 = new Thread(t3);
		t1.start();
		t2.start();
		t4.start();
		
		print();
		
		
		System.out.println("===== main 끝 =====");
	}

}
