package day11.exercise2;

import day11.exercise2.Outer.Inner;

public class Ex2 {

	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		System.out.println("Inner�� ��� ���� iv = " + inner.iv);
	}

}
