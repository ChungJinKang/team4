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
		Vector data = new Vector();	// 사이즈를 몰라도 만들 수 있음(알아서 사이즈 늘림)
		
		// List를 구현한 Vector 
		// Vector에 값을 넣을땐 객체로 넣는다
		data.add(100);	// auto boxing -> new Integer(100);
		data.add(new Integer(100));
		data.add("자바");
		data.add("자바");
		data.add(new String("자바"));
		data.add(new Car("그랜저", 5000));
		
		System.out.println(data.size() + "개 ");
		
		// 아무거나 집어넣었기 때문에 전부 Object로 바뀜
		// 따라서 특정한 타입으로 넣어야한다.
		int i = (Integer)data.get(0);
		System.out.println(i);
		
		Car c = (Car)(data.get(5));
		System.out.println(c);
	}
	
	// 컬렉션 프레임웍을 쓸때는 제네릭스를 써주는 게 좋다.
	public static void ListTest2() {
		// 제네릭스를 이용하면 타입을 제한할 수 있다.
		// List는 Vector, ArrayList, LinkedList... 등이 있고
		// 순서가 있다. 중복을 허용한다.
		Vector<String> data = new Vector<String>();	// 사이즈를 몰라도 만들 수 있음(알아서 사이즈 늘림)
		
		// List를 구현한 Vector 
		// Vector에 값을 넣을땐 객체로 넣는다
		// 문자만 넣는다
		data.add("자바1");
		data.add("자바2");
		data.add(new String("자바3"));
		
		System.out.println(data.size() + "개 ");

		// 확장 for
		for(String str : data) {
			System.out.println(str);
		}
		
		// 일반 for
		for(int i = 0; i < data.size(); i++) {
			String s = data.get(i);
			System.out.println(s);
		}
	}
	
	// ArrayList, List의 공통적 기능 사용
	public static void ListTest3() {
		// 제네릭스를 이용하면 타입을 제한할 수 있다.
		// List는 Vector, ArrayList, LinkedList... 등이 있고
		// 순서가 있다. 중복을 허용한다.
		ArrayList<String> data = new ArrayList<String>();	// 사이즈를 몰라도 만들 수 있음(알아서 사이즈 늘림)
		
		// List를 구현한 ArrayList 
		// ArrayList에 값을 넣을땐 객체로 넣는다
		// 문자만 넣는다
		data.add("자바1");
		data.add("자바2");
		data.add(new String("자바3"));
		
		System.out.println(data.size() + "개 ");

		// 확장 for
		for(String str : data) {
			System.out.println(str);
		}
		
		// 일반 for
		for(int i = 0; i < data.size(); i++) {
			String s = data.get(i);
			System.out.println(s);
		}
	}
	
	// LinkedList, List의 공통적 기능 사용
	public static void ListTest4() {
		// 제네릭스를 이용하면 타입을 제한할 수 있다.
		// List는 Vector, ArrayList, LinkedList... 등이 있고
		// 순서가 있다. 중복을 허용한다.
		LinkedList<String> data = new LinkedList<String>();	// 사이즈를 몰라도 만들 수 있음(알아서 사이즈 늘림)
		
		// List를 구현한 LikedList
		// LikedList에 값을 넣을땐 객체로 넣는다
		// 문자만 넣는다
		data.add("자바1");
		data.add("자바2");
		data.add(new String("자바3"));
		
		System.out.println(data.size() + "개 ");

		// 확장 for
		for(String str : data) {
			System.out.println(str);
		}
		
		// 일반 for
		for(int i = 0; i < data.size(); i++) {
			String s = data.get(i);
			System.out.println(s);
		}
	}
	
	public static void setTest() {
		// 제네릭스를 이용하면 타입을 제한할 수 있다.
		// Set- HashSet, TreeSet...
		// 순서가 없다. 중복을 허용하지 않는다.
		HashSet<String> data = new HashSet<String>();	// 사이즈를 몰라도 만들 수 있음(알아서 사이즈 늘림)
		
		// Set을 구현한 HashSet 
		// 중복을 허용하지 않는다. 순서가 없다.
		// 문자만 넣는다
		data.add("자바");
		data.add("자바");
		data.add(new String("자바"));
		data.add(new String("aaa자바"));
		
		System.out.println(data.size() + "개 ");

		// 확장 for
		for(String str : data) {
			System.out.println(str);
		}
		
		// 일반 for
//		for(int i = 0; i < data.size(); i++) {
//			String s = data.get(i);	//set은 몇번째가 없음! 순서가 없기 때문
//			System.out.println(s);
//		}
	}
	
	public static void main(String[] args) {
//		ListTest4();
		setTest();
	}

}
