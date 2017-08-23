package day5;

import java.util.Arrays;

import util.Sort;

public class ChungJin {

	public static void main(String[] args) {
		int[] num = new int[6];
		int[] spec = new int[46];
		int tmp = 0;
		
		for(int i = 0; i < num.length; i++) {
			tmp = (int)(Math.random() * 45) + 1;
			
			if(spec[tmp] == 0) {
				spec[tmp] = 1;
				num[i] = tmp;
			} else {
				--i;	// 한번 더 실행하기 위해!
			}
			
		}
		
		//Sort srt = new Sort();
		//srt.sort(num);
		/*
		tmp = 0;
		for(int i = 0; i < num.length - 1; i++) {
			for(int j = i + 1; j < num.length; j++) {
				if(num[i] < num[j]) {
					// swap
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		*/
		
		Sort.decend(num);
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		} System.out.println();
		
		int[] num2 = {7,9,3,4,6,7,9,10,11,55,99,100};
		Sort.decend(num2);
		System.out.println(Arrays.toString(num2));
		
		
	}

}
