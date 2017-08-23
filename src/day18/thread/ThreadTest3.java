package day18.thread;

import javax.swing.JOptionPane;

class CountThread extends Thread {
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i + " ===> " + getName());
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
}

public class ThreadTest3 {

	public static void main(String[] args) {
		
		
		CountThread a = new CountThread();
		CountThread b = new CountThread();
		b.setPriority(Thread.MAX_PRIORITY);	// 10
		
		a.start();
		b.start();
	
		System.out.println("main: " + Thread.currentThread().getPriority());
		System.out.println("a 이름: " + a.getName());
		System.out.println("a: " + a.getPriority());
		System.out.println("b 이름: " + b.getName());
		System.out.println("b: " + b.getPriority());
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
		System.out.println("당신이 입력한 것은 " + input);
		
	}

}
