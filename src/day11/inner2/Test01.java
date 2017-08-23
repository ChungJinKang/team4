package day11.inner2;

public class Test01 {

	public static void main(String[] args) {
		A a = new A();
		//System.out.println(a.nameA);	// a. 했을 때 보이는 건 nameA뿐!
		
		a.nameA = "~~~~";		// 이 정보를 print 하려면~
		A.B bb = a.new B();		// 이미 생성된 a안에 B클래스 생성
		bb.print();
		
		A.B b = new A().new B();	// A를 생성하고 그 안에 B 생성
		b.print();
	}

}
