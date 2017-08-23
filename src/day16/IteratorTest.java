package day16;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorTest {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("������");
		v.add("ȭ����");
		v.add("�����");
		v.add("�Ͽ���");
		
		// �� ������ �����̷�
		System.out.println("===== Enumeration =====");
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		System.out.println("===== LinkedList =====");
		LinkedList<String> link = new LinkedList<>();
		link.add("������");
		link.add("ȭ����");
		link.add("�����");
		link.add("�Ͽ���");
		
		Iterator<String> it = link.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		ListIterator<String> it2 = link.listIterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		while(it2.hasPrevious()) {
			System.out.println(it2.previous());
		}
		
//		String s = it2.next();
//		System.out.println("�ڷ�: " + s);
//		s = it2.next();
//		System.out.println("�ڷ�: " + s);
//		s = it2.previous();
//		System.out.println("������: " + s);
//		s = it2.previous();
//		System.out.println("������: " + s);
	}

}
