package day17;

public class BoxTest {

	public static void main(String[] args) {
		// Generic을 안 쓰는 방법
		Box b = new Box();
		b.setItem("사과");
		String s = (String)b.getItem();
		b.setItem(1000);
		Integer i = (Integer)b.getItem();
		b.setItem(new Car("그랜저"));
		Car c = (Car)b.getItem();

		Box<String> b1 = new Box<>();
		b1.setItem("사과");
//		b1.setItem(1000);// String만!!
		String s2 = b1.getItem();	// String이라는 확신이 있으므로 String으로 받을 수 있다.
		System.out.println(s2);

		
		Box<Car> b2 = new Box<>();
		b2.setItem(new Car("BMW"));
		Car s3 = b2.getItem();	// String이라는 확신이 있으므로 String으로 받을 수 있다.
		System.out.println(s3);
	}

}
