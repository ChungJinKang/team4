package day16;

import java.util.Arrays;
import java.util.Comparator;

class DescendingSort implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		String c1 = (String)obj1;
		String c2 = (String)obj2;
		return c2.compareToIgnoreCase(c1);	// c2가 왼쪽에 있으면 descending
	}
	
}

public class ComparatorEx {

	public static void main(String[] args) {
		String str1 = "A";
		String str2 = "Z";
		
		System.out.println(str1.compareTo(str2));
		
		String[] arr = {"cat", "Dog", "lion", "tiger"};
		
		System.out.println("원본: " + Arrays.toString(arr));
		System.out.println("sort 후: " + Arrays.toString(arr));
		
		Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER); 	// 대소문자 구별 x
		System.out.println("대소문자 구별없이 sort 후: " + Arrays.toString(arr));
		
		// desc sort
		Arrays.sort(arr, new DescendingSort()); 	// 대소문자 구별 x
		System.out.println("대소문자 구별없이 sort 후: " + Arrays.toString(arr));
	}

}
