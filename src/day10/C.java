package day10;

import day10.test.AA;

// AA�� public�ϹǷ� �ٸ� ��Ű�������� �� �� ����
public class C extends AA {
	public void print() {
		System.out.println(this.a);
		System.out.println(this.b);
//		System.out.println(this.c);
//		System.out.println(this.d);
	}
}

// B Ŭ������ default class�̹Ƿ� ���� ��Ű�������� �� �� ����
//class AAA extends day10.Test.B {
//	
//}

class HHH {
	public void print() {
		day10.test.AA a = new day10.test.AA();
		System.out.println(a.a);
	}
}