package day13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		int[] intArr = { 5, 2, 3, 4, 1 };
		System.out.println(Arrays.toString(intArr));
		
		int[] intArr2 = new int[intArr.length * 2];
		System.arraycopy(intArr, 0, intArr2, 0, intArr.length);
		System.out.println(Arrays.toString(intArr2));

		int[] intArr3 = intArr.clone();	// º¹Á¦
		Arrays.sort(intArr3);			// sorting
		System.out.println(Arrays.toString(intArr3));
		
		String[] stringArr = { "a", "b", "c", "d", "e" };
		System.out.println(Arrays.toString(stringArr));
		String[] stringArr2 = stringArr.clone();
		stringArr2[0] = "~~";
		System.out.println(Arrays.toString(stringArr2));
		System.out.println(stringArr==stringArr2);
	}

}
