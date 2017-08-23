package day15.ch11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
	
	// ���׸����� Ÿ���� ����ؼ� �޴°� �����ϴϱ� ��� ��
	// ��� �޽����� ���ֱ� ���� ������̼�
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));	// 1~3 ��ġ ������
		// 4 2 0
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println("list1.containAll(list2): " + list1.containsAll(list2));
		// 4 2 AA 0 B C
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");	// 3��° �ִ� �����Ͱ� �ڷ� �з����� ���ڸ��� "A" ����
		print(list1, list2);
		
		list2.set(3, "AA");	// 3��° ���������� �� �����͸� ����
		print(list1, list2);
		
		// ��ġ�� �κи� ����� �������� ���� -> 0, 2, 4�� ����
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
		
		// ��ġ�� �κ� ���� -> AA B C�� ����
		// �ڿ������� ������ �����Ͱ� �������� ó�� �ѹ濡 ����
		for(int i = list2.size() - 1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	}
	
	@SuppressWarnings("rawtypes")
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	}

}
