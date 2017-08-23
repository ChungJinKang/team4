package day5;

import java.util.Arrays;

public class P215 {

	public static void main(String[] args) {
		int[][] t = new int[4][3];
		
		/*
		System.out.println(t);
		System.out.println(t[0]);
		System.out.println(t[0][1]);
		System.out.println(Arrays.toString(t));
		System.out.println(Arrays.toString(t[0]));
		*/
		
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j < t[i].length; j++){
				//System.out.print(t[i][j] + " ");
				t[i][j] = (int)(Math.random()*9 + 1);
			} //System.out.println();
		}
		
		for(int i = 0; i < t.length; i++) {
			for(int j = 0; j < t[i].length; j++){
				System.out.print(t[i][j] + " ");
				//t[i][j] = (int)(Math.random()*9 + 1);
			} System.out.println();
		}
		
		System.out.println();
		int[][] two = {
				{1, 2, 3, 4, 5, 6, 7}, 
				{1}, 
				{3, 4, 5}, 
				{9, 8}
		};		
		
		for(int i =0; i < two.length; i++) {
			for(int j = 0; j < two[i].length; j++) {
				System.out.print(two[i][j] + " ");
			} System.out.println();
		}
		for(int i=0; i<two.length; i++) {
			System.out.println(Arrays.toString(two[i]));
		}

			
	}

}
