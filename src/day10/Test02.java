package day10;

public class Test02 {

	public static void main(String[] args) {
		A a = new A();
		Dog d = new Dog("Dog", "Çªµé", "È£¿ì");
		a.p3(d);
		a.p3(new Fish());
		a.p4(d);
		a.p4(new Fish());
		String s = "hi~~";
		a.p4(s);
		
	}

}


class A {
//	public void p1(Dog d) {
//		d.breath();
//	}
//	public void p2(Fish f) {
//		f.breath();
//	}
	public void p3(Animal a) {
		a.breath();
	}
	public void p4(Object a) {
		if(a instanceof Animal) {
			//((Animal)a).breath();
			Animal b = (Animal)a;
			b.breath();
		}
			
	}
	
}