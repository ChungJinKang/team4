package day11.exercise2;

import day11.exercise2.Outer.Inner;

public class Ex2 {

	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		System.out.println("InnerÀÇ ¸â¹ö º¯¼ö iv = " + inner.iv);
	}

}
