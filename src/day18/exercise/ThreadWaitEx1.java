package day18.exercise;

import java.util.ArrayList;

public class ThreadWaitEx1 {

	public static void main(String[] args) throws InterruptedException {
		Table table = new Table();
		
		new Thread(new Cook(table), "COOK1").start();
		new Thread(new Customer(table, "donut"), "CUST1").start();
		new Thread(new Customer(table, "burger"), "CUST2").start();
		
		Thread.sleep(5000);
		System.out.println(" ==== END ==== ");
		System.exit(0);
	}

}

class Customer implements Runnable {
	private Table table;
	private String food;
	
	Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + " ate a " + food);
		}
	}
	
}

class Cook implements Runnable {
	private Table table;
	Cook(Table table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		
		while(true) {
			// ������ �丮�� �ϳ� �����ؼ� table�� �߰��Ѵ�.
			int idx = (int)(Math.random()*table.dishNum());
			table.add(table.dishNames[idx]);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}


class Table {
	String[] dishNames = {"donut","donut","burger"};
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {
		// ���̺��� ������ ���� á����, ���̺��� ������ �߰����� �ʴ´�.
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		dishes.add(dish);
		notify();	// ��ٸ��� �ִ� CUST�� ����� ����.
		System.out.println("Dishes: " + dishes.toString());
	}
	public void remove(String dishName) {
		synchronized(this) {
			// ������ ��� ���Դ� ��� ��ٸ�
			String name = Thread.currentThread().getName();

			while(dishes.size() == 0) {
				System.out.println(name + " is waiting.");
				try {
					wait();		// CUST �����带 ��ٸ��� �Ѵ�.
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			// ������ �丮�� ��ġ�ϴ� �丮�� ���̺����� �����Ѵ�.
			for(int i = 0; i < dishes.size(); i++) {
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);
					notify();	// ���ڰ� �ִ� COOK�� ����� ����
					return;			
				}
			}
			
			try {
				System.out.println(name + " is waiting...");
				wait();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
	}
	public int dishNum()	{ return dishNames.length; }
}