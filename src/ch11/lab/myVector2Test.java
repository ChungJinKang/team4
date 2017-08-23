package ch11.lab;

import java.util.Iterator;

public class myVector2Test {

	public static void main(String[] args) {
		MyVector2 v = new MyVector2();
		v.add("0");
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		
		System.out.println("삭제 전: " + v);
		Iterator it = v.iterator();
		it.next();
		it.remove();	// remove()는 next()가 호출된 이후에야 쓸 수 있음
		it.next();
		it.remove();
		
		System.out.println("삭제 후: " + v);
	}

}
