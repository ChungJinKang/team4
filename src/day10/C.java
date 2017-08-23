package day10;

import day10.test.AA;

// AA는 public하므로 다른 패키지에서도 쓸 수 있음
public class C extends AA {
	public void print() {
		System.out.println(this.a);
		System.out.println(this.b);
//		System.out.println(this.c);
//		System.out.println(this.d);
	}
}

// B 클래스는 default class이므로 같은 패키지에서만 쓸 수 있음
//class AAA extends day10.Test.B {
//	
//}

class HHH {
	public void print() {
		day10.test.AA a = new day10.test.AA();
		System.out.println(a.a);
	}
}