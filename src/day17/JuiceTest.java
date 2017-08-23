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
		// �Ʒ��� ���� �ٸ� Ÿ���� ���� �� ����.
		// only Fruit Ÿ�Ը� ����
		// ���� �ƶ����� �Ű��������� �Է� �ȵȴ�!
		MyBox<? extends Fruit> bb = new MyBox<Apple>();
		MyBox<? extends Fruit> cc = new MyBox<Grape>();
	}

}
