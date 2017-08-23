package day4;

import java.util.Arrays;

public class P200 {

	public static void main(String[] args) {
		int[] num = {9, 8, 11, 56, 22, 1, 77};	// 배열의 선언, 생성, 초기화를 한번에!
		
		System.out.println(Arrays.toString(num));
		
		// 최대값 구하기
		int max = num[0];
		
		for(int i = 1; i < num.length; i++) {
			if(max < num[i])
				max = num[i];
		}
		System.out.println("최대값은 " + max);
		
		int[] num2 = new int[num.length];
		System.arraycopy(num, 0, num2, 0, num.length);
		int temp = 0;
		
		// 내림차순 정렬
		//temp = num2[0];
		
		for(int i=0; i < num2.length-1; i++) {
			temp = num2[i];
			for(int j = i + 1; j < num2.length; j++) {
				if(temp < num2[j]) {
					num2[i] = num2[j];
					num2[j] = temp;
					temp = num2[i];
				}
			}
		}
		
		System.out.println(Arrays.toString(num2));
	}

}
