package day15.ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

class Car {
	String model;
	int price;
	
	public Car() {
		super();
	}
	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}
	
	
}

public class CollectionTest {

	//List, Set, Map
	public static void ListTest() {
		Vector data = new Vector();	// ����� ���� ���� �� ����(�˾Ƽ� ������ �ø�)
		
		// List�� ������ Vector 
		// Vector�� ���� ������ ��ü�� �ִ´�
		data.add(100);	// auto boxing -> new Integer(100);
		data.add(new Integer(100));
		data.add("�ڹ�");
		data.add("�ڹ�");
		data.add(new String("�ڹ�"));
		data.add(new Car("�׷���", 5000));
		
		System.out.println(data.size() + "�� ");
		
		// �ƹ��ų� ����־��� ������ ���� Object�� �ٲ�
		// ���� Ư���� Ÿ������ �־���Ѵ�.
		int i = (Integer)data.get(0);
		System.out.println(i);
		
		Car c = (Car)(data.get(5));
		System.out.println(c);
	}
	
	// �÷��� �����ӿ��� ������ ���׸����� ���ִ� �� ����.
	public static void ListTest2() {
		// ���׸����� �̿��ϸ� Ÿ���� ������ �� �ִ�.
		// List�� Vector, ArrayList, LinkedList... ���� �ְ�
		// ������ �ִ�. �ߺ��� ����Ѵ�.
		Vector<String> data = new Vector<String>();	// ����� ���� ���� �� ����(�˾Ƽ� ������ �ø�)
		
		// List�� ������ Vector 
		// Vector�� ���� ������ ��ü�� �ִ´�
		// ���ڸ� �ִ´�
		data.add("�ڹ�1");
		data.add("�ڹ�2");
		data.add(new String("�ڹ�3"));
		
		System.out.println(data.size() + "�� ");

		// Ȯ�� for
		for(String str : data) {
			System.out.println(str);
		}
		
		// �Ϲ� for
		for(int i = 0; i < data.size(); i++) {
			String s = data.get(i);
			System.out.println(s);
		}
	}
	
	// ArrayList, List�� ������ ��� ���
	public static void ListTest3() {
		// ���׸����� �̿��ϸ� Ÿ���� ������ �� �ִ�.
		// List�� Vector, ArrayList, LinkedList... ���� �ְ�
		// ������ �ִ�. �ߺ��� ����Ѵ�.
		ArrayList<String> data = new ArrayList<String>();	// ����� ���� ���� �� ����(�˾Ƽ� ������ �ø�)
		
		// List�� ������ ArrayList 
		// ArrayList�� ���� ������ ��ü�� �ִ´�
		// ���ڸ� �ִ´�
		data.add("�ڹ�1");
		data.add("�ڹ�2");
		data.add(new String("�ڹ�3"));
		
		System.out.println(data.size() + "�� ");

		// Ȯ�� for
		for(String str : data) {
			System.out.println(str);
		}
		
		// �Ϲ� for
		for(int i = 0; i < data.size(); i++) {
			String s = data.get(i);
			System.out.println(s);
		}
	}
	
	// LinkedList, List�� ������ ��� ���
	public static void ListTest4() {
		// ���׸����� �̿��ϸ� Ÿ���� ������ �� �ִ�.
		// List�� Vector, ArrayList, LinkedList... ���� �ְ�
		// ������ �ִ�. �ߺ��� ����Ѵ�.
		LinkedList<String> data = new LinkedList<String>();	// ����� ���� ���� �� ����(�˾Ƽ� ������ �ø�)
		
		// List�� ������ LikedList
		// LikedList�� ���� ������ ��ü�� �ִ´�
		// ���ڸ� �ִ´�
		data.add("�ڹ�1");
		data.add("�ڹ�2");
		data.add(new String("�ڹ�3"));
		
		System.out.println(data.size() + "�� ");

		// Ȯ�� for
		for(String str : data) {
			System.out.println(str);
		}
		
		// �Ϲ� for
		for(int i = 0; i < data.size(); i++) {
			String s = data.get(i);
			System.out.println(s);
		}
	}
	
	public static void setTest() {
		// ���׸����� �̿��ϸ� Ÿ���� ������ �� �ִ�.
		// Set- HashSet, TreeSet...
		// ������ ����. �ߺ��� ������� �ʴ´�.
		HashSet<String> data = new HashSet<String>();	// ����� ���� ���� �� ����(�˾Ƽ� ������ �ø�)
		
		// Set�� ������ HashSet 
		// �ߺ��� ������� �ʴ´�. ������ ����.
		// ���ڸ� �ִ´�
		data.add("�ڹ�");
		data.add("�ڹ�");
		data.add(new String("�ڹ�"));
		data.add(new String("aaa�ڹ�"));
		
		System.out.println(data.size() + "�� ");

		// Ȯ�� for
		for(String str : data) {
			System.out.println(str);
		}
		
		// �Ϲ� for
//		for(int i = 0; i < data.size(); i++) {
//			String s = data.get(i);	//set�� ���°�� ����! ������ ���� ����
//			System.out.println(s);
//		}
	}
	
	public static void main(String[] args) {
//		ListTest4();
		setTest();
	}

}
