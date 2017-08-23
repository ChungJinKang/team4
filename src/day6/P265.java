package day6;

import java.util.Arrays;

public class P265 {

	public static void main(String[] args) {
		Data d = new Data();
		
		change(d);
		System.out.println(d.x);
		
		System.out.println();
		
		int i = 9;
		change(i);
		System.out.println(i);
		
		System.out.println();
		
		int[] num = {9,9,9,9};
		change(num);
		System.out.println(Arrays.toString(num));
	}
	
	// call by value
	public static void change(int x) {
		x = 1000;
		System.out.println("change() x = " + x);
	}
	// call by ref
	public static void change(Data d) {
		d.x = 1000;
		System.out.println("change() d.x = " + d.x);
	}
	// call by ref
	public static void change(int[] d) {
		d[0] = 1000;
		System.out.println("change() d[0] = " + d[0]);
	}
}

class Data {
	int x;
}