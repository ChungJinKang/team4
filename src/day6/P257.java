package day6;

import util.MyMath;

public class P257 {

	public static void main(String[] args) {
		double n = MyMath.add(66, 128);
		System.out.println(n);
		System.out.println(MyMath.divide(256, 0));
		System.out.println(MyMath.exec('+', 1, 3));
		System.out.println(MyMath.exec('+', 1, 2, 3));
		
		double[] d = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(MyMath.exec('+', d));
		System.out.println(MyMath.exec('+', 1,2,3,4,5,6,7,8,9,10));
	}

}
