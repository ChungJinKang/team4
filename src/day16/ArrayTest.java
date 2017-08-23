package day16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayTest {
	// 멤버 변수 - heap역역에 생성
	String name;
	
	public static void main(String[] args) {
		// 지역 변수 - stack에 생성
		//int[] iarr = new int[] {100, 40, 70, 90, 30};	// new한 배열은 heap에 생성
		int[] iarr = {100, 40, 70, 90, 30};	// new한 배열은 heap에 생성
		
		System.out.println("Before: " + Arrays.toString(iarr));
		Arrays.sort(iarr);
		System.out.println("After: " + Arrays.toString(iarr));
		
		int[] iarr2 = Arrays.copyOf(iarr, 3);
		System.out.println("3개 복사: " + Arrays.toString(iarr2));

		int[] iarr3 = Arrays.copyOfRange(iarr, 2, 4);
		System.out.println("2,3 복사: " + Arrays.toString(iarr3));
		
		int[] iarr4 = new int[5];
		Arrays.fill(iarr4, 9);
		System.out.println("fill " + Arrays.toString(iarr4));
		
		Arrays.setAll(iarr4, (i)->(int)(Math.random() * 5 + 1));
		System.out.println(Arrays.toString(iarr4));
		
		int[] iarr5 = {100, 40, 70, 90, 30};
		Arrays.sort(iarr5);
		System.out.println("sort 후: " + Arrays.toString(iarr5));
		int idx = Arrays.binarySearch(iarr5, 40);	// 이진탐색은 데이터가 sort되어있어야 함
		System.out.println(idx + "번째에서 찾음");

		// 배열을 list로 변환
		List list = Arrays.asList(iarr5);
		getData(list);	// iarr5가 int배열이므로... 제네릭스 쓰기가 애매한듯? -> iteration도?	
	}

	public static void getData(List data) {	// list에는 하나밖에 안들어와있다?
		int[] arr = (int[])data.get(0);
		for(int i : arr) {
			System.out.println(i);
		}
	}
	
}
