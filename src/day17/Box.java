package day17;

import java.util.ArrayList;

//Fruit�� ��� �޴� �͸����� ����!!!
//<T extends Fruit>

public class Box<T> {	
//	private Object item;	// �����ؾ� �� ���
	private T item;
	ArrayList<T> list = new ArrayList<T>();	// ������ ������ �ֱ� ���� ����Ʈ
	
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	
	@Override
	public String toString() {
		return list.toString();	// ArrayList�� �ִ� toString ȣ��
	}
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	
}
