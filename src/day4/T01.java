package day4;

import java.util.Arrays;

public class T01 {

	public static void main(String[] args) {
		/*
		int sum = 0;
		int index = 1;
		
		while(sum < 100) {
			sum += ((int)Math.pow(-1, index%2)) * (-1) * index;
			index++;
		}
		//System.out.println((int)Math.pow(-1, index%2));
		*/
		/*
		while(sum < 100) {
			if(index % 2 == 0)
				sum += (-1)*index;		
			else
				sum += index;
			index++;
			
		}
		*/
//		System.out.println(sum + " " + index);
		
		
		/*
		int[] arr = {3, 2, 5, 1, 8, 4};
		int i, j, temp;
		for(i = 0; i < arr.length - 1; i++) {
			for(j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					//swap
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		*/
		
		int[] arr = {10, 20, 30, 40, 50}; 
		
		// TODO arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성
		int sum = 0;
		for(int i= 0; i< arr.length; i++)
			sum += arr[i];
		
		System.out.println("sum="+sum);
		
	}

}
