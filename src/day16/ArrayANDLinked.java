package day16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayANDLinked {
	// ���������� ����
	public static void remove(List<String> list) {
		long s = System.currentTimeMillis();
		
		for(int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}
		
		long e = System.currentTimeMillis();
		
		System.out.println(e - s);
	}
	
	// �߰� ����
	public static void remove2(List<String> list) {
		long s = System.currentTimeMillis();
		
		for(int i = 0; i < 10000; i++) {
			list.remove(i);
		}
		
		long e = System.currentTimeMillis();
		
		System.out.println(e - s);
	}
	
	// �������� �߰�
	public static void add(List<String> list) {
		long s = System.currentTimeMillis();
		
		for(int i = 0; i < 1000000; i++) {
			list.add(i + "");			
		}
		
		long e = System.currentTimeMillis();
		
		System.out.println(e - s);
	}
	
	// �߰��� ����
	public static void add2(List<String> list) {
		long s = System.currentTimeMillis();
		
		for(int i = 0; i < 10000; i++) {
			list.add(500, "x");			
		}
		
		long e = System.currentTimeMillis();
		
		System.out.println(e - s);
	}
	
	// ������ ����
	public static void access(List<String> list) {
		long s = System.currentTimeMillis();
		
		for(int i = 0; i < 10000; i++) {
			list.get(i);		
		}
		
		long e = System.currentTimeMillis();
		
		System.out.println("access�ϴµ� �ɸ��� �ð�" + (e - s));
	}
	
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList(200);	// ������ ����� ����� ��, ����Ʈ�� 10���ϱ�
		LinkedList<String> lList = new LinkedList();


		System.out.println("=== ���������� add");
		System.out.println("=== ArrayList ===");
		add(alist);
		System.out.println("=== LinkedList ===");
		add(lList);
		
		System.out.println("=== �߰��� add ===");
		System.out.println("=== ArrayList ===");
		add2(alist);
		System.out.println("=== LinkedList ===");
		add2(lList);

		
//		System.out.println("=== ���������� remove");
//		System.out.println("=== ArrayList ===");
//		remove(alist);
//		System.out.println("=== LinkedList ===");
//		remove(lList);
		
//		System.out.println("=== �߰��� remove");
//		System.out.println("=== ArrayList ===");
//		remove2(alist);
//		System.out.println("=== LinkedList ===");
//		remove2(lList);
		
		System.out.println("=== ������ ����");
		System.out.println("=== ArrayList ===");
		access(alist);
		System.out.println("=== LinkedList ===");
		access(lList);
	}

}
