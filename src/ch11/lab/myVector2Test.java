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
		
		System.out.println("���� ��: " + v);
		Iterator it = v.iterator();
		it.next();
		it.remove();	// remove()�� next()�� ȣ��� ���Ŀ��� �� �� ����
		it.next();
		it.remove();
		
		System.out.println("���� ��: " + v);
	}

}
