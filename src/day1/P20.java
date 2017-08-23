package day1;

public class P20 {
	public static void main(String[] args) {
		int age = 20;
		System.out.println(age);
		age += 5;
		System.out.println(age);
		
		int x = 10;
		int y = 90;
		int temp;
		
		// x, y swapping
		temp = 10;
		x = y;
		y = temp;
		
		System.out.println("x=" + x + ", y=" + y);
		System.out.println(""+x+y);
	}

}
