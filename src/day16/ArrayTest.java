package day16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayTest {
	// ��� ���� - heap������ ����
	String name;
	
	public static void main(String[] args) {
		// ���� ���� - stack�� ����
		//int[] iarr = new int[] {100, 40, 70, 90, 30};	// new�� �迭�� heap�� ����
		int[] iarr = {100, 40, 70, 90, 30};	// new�� �迭�� heap�� ����
		
		System.out.println("Before: " + Arrays.toString(iarr));
		Arrays.sort(iarr);
		System.out.println("After: " + Arrays.toString(iarr));
		
		int[] iarr2 = Arrays.copyOf(iarr, 3);
		System.out.println("3�� ����: " + Arrays.toString(iarr2));

		int[] iarr3 = Arrays.copyOfRange(iarr, 2, 4);
		System.out.println("2,3 ����: " + Arrays.toString(iarr3));
		
		int[] iarr4 = new int[5];
		Arrays.fill(iarr4, 9);
		System.out.println("fill " + Arrays.toString(iarr4));
		
		Arrays.setAll(iarr4, (i)->(int)(Math.random() * 5 + 1));
		System.out.println(Arrays.toString(iarr4));
		
		int[] iarr5 = {100, 40, 70, 90, 30};
		Arrays.sort(iarr5);
		System.out.println("sort ��: " + Arrays.toString(iarr5));
		int idx = Arrays.binarySearch(iarr5, 40);	// ����Ž���� �����Ͱ� sort�Ǿ��־�� ��
		System.out.println(idx + "��°���� ã��");

		// �迭�� list�� ��ȯ
		List list = Arrays.asList(iarr5);
		getData(list);	// iarr5�� int�迭�̹Ƿ�... ���׸��� ���Ⱑ �ָ��ѵ�? -> iteration��?	
	}

	public static void getData(List data) {	// list���� �ϳ��ۿ� �ȵ����ִ�?
		int[] arr = (int[])data.get(0);
		for(int i : arr) {
			System.out.println(i);
		}
	}
	
}
