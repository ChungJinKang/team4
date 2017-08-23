package day15.ch11;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
	
	// 제네릭스로 타입을 명시해서 받는걸 권장하니까 경고가 뜸
	// 경고 메시지를 없애기 위한 어노테이션
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));	// 1~3 위치 가져옴
		// 4 2 0
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println("list1.containAll(list2): " + list1.containsAll(list2));
		// 4 2 AA 0 B C
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");	// 3번째 있던 데이터가 뒤로 밀려나고 이자리에 "A" 넣음
		print(list1, list2);
		
		list2.set(3, "AA");	// 3번째 지워버리고 새 데이터를 넣음
		print(list1, list2);
		
		// 겹치는 부분만 남기고 나머지는 삭제 -> 0, 2, 4가 남음
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
		
		// 겹치는 부분 삭제 -> AA B C만 남음
		// 뒤에서부터 지워야 데이터가 땡겨져도 처리 한방에 가능
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
