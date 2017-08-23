package day11.inner2;

public class A {
	String nameA = "A";
	
	// Inner class		workspace\bins -> A.class, A$B.class 생성 됨
	class B {
		void print() {
			System.out.println(nameA);	// Outer class의 자원을 그대로 접근할 수 있다.
		}
	}
}
