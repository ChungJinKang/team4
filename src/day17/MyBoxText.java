package day17;

public class MyBoxText {

	public static void main(String[] args) {
		MyBox<Fruit> b1 = new MyBox<>();
		MyBox<Apple> b2 = new MyBox<>();
		MyBox<Grape> b3 = new MyBox<>();
//		MyBox<Toy> b4 = new MyBox<>();
		
		b1.add(new Fruit());
		b1.add(new Apple());
		b1.add(new Grape());
		
//		b2.add(new Fruit());
		b2.add(new Apple());
//		b2.add(new Grape());
		
//		b3.add(new Fruit());
//		b3.add(new Apple());
		b3.add(new Grape());
	}

}
