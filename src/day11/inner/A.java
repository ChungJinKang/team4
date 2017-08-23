package day11.inner;


// workspace\bins -> A.class, B.class µÑ ´Ù »ý±è
public class A {
	String nameA = "A";
	
}

class B {
	A a;
	
	public B() {
		super();
	}
	public B(A a) {
		super();
		this.a = a;
	}
	
	public A getA() {
		return a;
	}
	public void setA(A a) {
		this.a = a;
	}

	public void print() {
		System.out.println(a.nameA);
	}
}

