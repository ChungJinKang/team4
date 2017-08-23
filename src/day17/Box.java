package day17;

import java.util.ArrayList;

//Fruit를 상속 받는 것만으로 제한!!!
//<T extends Fruit>

public class Box<T> {	
//	private Object item;	// 지양해야 할 방법
	private T item;
	ArrayList<T> list = new ArrayList<T>();	// 과일을 여러개 넣기 위한 리스트
	
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
		return list.toString();	// ArrayList에 있는 toString 호출
	}
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	
}
