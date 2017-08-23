package day16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayANDLinked {
	// 마지막부터 삭제
	public static void remove(List<String> list) {
		long s = System.currentTimeMillis();
		
		for(int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}
		
		long e = System.currentTimeMillis();
		
		System.out.println(e - s);
	}
	
	// 중간 삭제
	public static void remove2(List<String> list) {
		long s = System.currentTimeMillis();
		
		for(int i = 0; i < 10000; i++) {
			list.remove(i);
		}
		
		long e = System.currentTimeMillis();
		
		System.out.println(e - s);
	}
	
	// 마지막에 추가
	public static void add(List<String> list) {
		long s = System.currentTimeMillis();
		
		for(int i = 0; i < 1000000; i++) {
			list.add(i + "");			
		}
		
		long e = System.currentTimeMillis();
		
		System.out.println(e - s);
	}
	
	// 중간에 삽입
	public static void add2(List<String> list) {
		long s = System.currentTimeMillis();
		
		for(int i = 0; i < 10000; i++) {
			list.add(500, "x");			
		}
		
		long e = System.currentTimeMillis();
		
		System.out.println(e - s);
	}
	
	// 순차적 접근
	public static void access(List<String> list) {
		long s = System.currentTimeMillis();
		
		for(int i = 0; i < 10000; i++) {
			list.get(i);		
		}
		
		long e = System.currentTimeMillis();
		
		System.out.println("access하는데 걸리는 시간" + (e - s));
	}
	
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList(200);	// 공간을 충분히 만들어 줌, 디폴트는 10개니까
		LinkedList<String> lList = new LinkedList();


		System.out.println("=== 순차적으로 add");
		System.out.println("=== ArrayList ===");
		add(alist);
		System.out.println("=== LinkedList ===");
		add(lList);
		
		System.out.println("=== 중간에 add ===");
		System.out.println("=== ArrayList ===");
		add2(alist);
		System.out.println("=== LinkedList ===");
		add2(lList);

		
//		System.out.println("=== 순차적으로 remove");
//		System.out.println("=== ArrayList ===");
//		remove(alist);
//		System.out.println("=== LinkedList ===");
//		remove(lList);
		
//		System.out.println("=== 중간에 remove");
//		System.out.println("=== ArrayList ===");
//		remove2(alist);
//		System.out.println("=== LinkedList ===");
//		remove2(lList);
		
		System.out.println("=== 순차적 접근");
		System.out.println("=== ArrayList ===");
		access(alist);
		System.out.println("=== LinkedList ===");
		access(lList);
	}

}
