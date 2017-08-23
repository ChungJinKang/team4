package day16;

import java.util.Arrays;
import java.util.Comparator;

class DescendingSort implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		String c1 = (String)obj1;
		String c2 = (String)obj2;
		return c2.compareToIgnoreCase(c1);	// c2�� ���ʿ� ������ descending
	}
	
}

public class ComparatorEx {

	public static void main(String[] args) {
		String str1 = "A";
		String str2 = "Z";
		
		System.out.println(str1.compareTo(str2));
		
		String[] arr = {"cat", "Dog", "lion", "tiger"};
		
		System.out.println("����: " + Arrays.toString(arr));
		System.out.println("sort ��: " + Arrays.toString(arr));
		
		Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER); 	// ��ҹ��� ���� x
		System.out.println("��ҹ��� �������� sort ��: " + Arrays.toString(arr));
		
		// desc sort
		Arrays.sort(arr, new DescendingSort()); 	// ��ҹ��� ���� x
		System.out.println("��ҹ��� �������� sort ��: " + Arrays.toString(arr));
	}

}
