package day17;

public class JuiceTest {

	public static void main(String[] args) {
		MyBox<Fruit> b1 = new MyBox<>();
		b1.add(new Fruit());
		b1.add(new Apple());
		b1.add(new Grape());
		
		Juice j = JuiceMaker.makeJuice(b1);
		System.out.println(j);

		System.out.println("--------------------------------");
		MyBox<Apple> b2 = new MyBox<>();
//		b2.add(new Fruit());
		b2.add(new Apple());
//		b2.add(new Grape());
		
		Juice j2 = JuiceMaker.makeJuice(b2);
		System.out.println(j2);
		
		MyBox<Fruit> aa = new MyBox<Fruit>();
		// 아래와 같이 다른 타입을 넣을 수 없다.
		// only Fruit 타입만 가능
		// 같은 맥락으로 매개변수에도 입력 안된다!
		MyBox<? extends Fruit> bb = new MyBox<Apple>();
		MyBox<? extends Fruit> cc = new MyBox<Grape>();
	}

}
