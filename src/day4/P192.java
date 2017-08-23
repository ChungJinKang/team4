package day4;

import java.util.Arrays;

public class P192 {

	public static void main(String[] args) {
		int[] num;
		num = new int[5];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*100 + 1);
		}
		
		for(int data : num) {
			System.out.print(data + " ");
		} System.out.println();
		
		int[] num2 = new int[num.length * 2];
		
		//for(int i = 0; i <  num.length; i++) {
		//	num2[i] = num[i];
		//}
		System.out.println(Arrays.toString(num2));
		
		System.arraycopy(num, 1, num2, 4, num.length-1);
		
		//System.out.println();
		System.out.println(Arrays.toString(num2));
		
		
	}

}
