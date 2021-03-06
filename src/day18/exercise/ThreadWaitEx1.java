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
			// 임의의 요리를 하나 선택해서 table에 추가한다.
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
		// 테이블에 음식이 가득 찼으면, 테이블에 음식을 추가하지 않는다.
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
		notify();	// 기다리고 있는 CUST를 깨우기 위함.
		System.out.println("Dishes: " + dishes.toString());
	}
	public void remove(String dishName) {
		synchronized(this) {
			// 음식이 없어서 못먹는 경우 기다림
			String name = Thread.currentThread().getName();

			while(dishes.size() == 0) {
				System.out.println(name + " is waiting.");
				try {
					wait();		// CUST 쓰레드를 기다리게 한다.
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			// 지정된 요리와 일치하는 요리를 테이블에서 제거한다.
			for(int i = 0; i < dishes.size(); i++) {
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);
					notify();	// 잠자고 있는 COOK을 깨우기 위함
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