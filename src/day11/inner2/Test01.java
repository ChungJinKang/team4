package day11.inner2;

public class Test01 {

	public static void main(String[] args) {
		A a = new A();
		//System.out.println(a.nameA);	// a. ���� �� ���̴� �� nameA��!
		
		a.nameA = "~~~~";		// �� ������ print �Ϸ���~
		A.B bb = a.new B();		// �̹� ������ a�ȿ� BŬ���� ����
		bb.print();
		
		A.B b = new A().new B();	// A�� �����ϰ� �� �ȿ� B ����
		b.print();
	}

}
