package day12.inner;

public class Test01 {

	public static void main(String[] args) {
		A a = new A();
//		a.printA();
		a.m();
		
		A.B b = new A().new B();
		//b.printB();
		
		A.C c = new A.C();
		//c.printC();
	}
}

class A {
	String name = "A";
	String addr = "Outer A";
	
	void printA() {
		System.out.println(name);
		
		B b = new B();
		//b.printB();
		System.out.println(b.name);
		
	}
	
	void m() {
		// Local class
		class D {
			D() {
				System.out.println("D() »ý¼º ");
			}
			String sss = "ddddd";
			void printD() {
				System.out.println(sss);
			}
		}
		D d = new D();
		d.printD();
	}
	
	// Inner class
	class B {
		String name = "B";
		
		void printB() {
			System.out.println(name);
			System.out.println(this.name);
			
			System.out.println(addr);
			System.out.println(A.this.name);
		}
	}
	
	// Static inner class
	static class C {
		String nameC = "C";
		
		void printC() {
			System.out.println(nameC);
		}
	}
	
}