package day17;

public class BoxTest {

	public static void main(String[] args) {
		// Generic�� �� ���� ���
		Box b = new Box();
		b.setItem("���");
		String s = (String)b.getItem();
		b.setItem(1000);
		Integer i = (Integer)b.getItem();
		b.setItem(new Car("�׷���"));
		Car c = (Car)b.getItem();

		Box<String> b1 = new Box<>();
		b1.setItem("���");
//		b1.setItem(1000);// String��!!
		String s2 = b1.getItem();	// String�̶�� Ȯ���� �����Ƿ� String���� ���� �� �ִ�.
		System.out.println(s2);

		
		Box<Car> b2 = new Box<>();
		b2.setItem(new Car("BMW"));
		Car s3 = b2.getItem();	// String�̶�� Ȯ���� �����Ƿ� String���� ���� �� �ִ�.
		System.out.println(s3);
	}

}
