package day11.inner2;

public class A {
	String nameA = "A";
	
	// Inner class		workspace\bins -> A.class, A$B.class ���� ��
	class B {
		void print() {
			System.out.println(nameA);	// Outer class�� �ڿ��� �״�� ������ �� �ִ�.
		}
	}
}
