package day17;

interface Parent {  }

class Child implements Parent {

	@Override
	public String toString() {
		return "Child []";
	}
}

class Child2 implements Parent {

	@Override
	public String toString() {
		return "Child2 []";
	}
}

public class FruitBoxEx1 {

	public static void main(String[] args) {
//		Box<String> box1 = new Box<>();
//		box1.add("JAVA1");
//		box1.add("JAVA2");
//		box1.add("JAVA3");
//		System.out.println(box1.size() + "��");
//		String s = box1.get(0);		//box.get() �� ���� ���� T�ϱ�!
//		System.out.println(s);
//		System.out.println("=========================");
		
		Box<Fruit> fruitBox = new Box<>();
		Box<Apple> appleBox = new Box<>();
		Box<Parent> p  = new Box<>();
		p.add(new Child());
		p.add(new Child2());
		
		System.out.println(p);
		
		appleBox.add(new Apple());
		System.out.println(appleBox);
		//appleBox.add(new Fruit());	// ��� �ȵ� 
		
		fruitBox.add(new Fruit());	// �Ű������� T�ϱ� FruitŸ�Ը� �� �� ����
		fruitBox.add(new Apple());	// Apple�� Fruit�� ��ӹ޾����Ƿ� �̷��� �� ���� �ִ�.
		fruitBox.add(new Grape());	// Grape�� Fruit�� ��ӹ���	
//		fruitBox.add(new Toy());	// �Ű������� Toy�� ���� �� ����.(��ӵ� �ȹ޾���)
		
		System.out.println(fruitBox);
		System.out.println(fruitBox.size() + "��");

		for(int i = 0; i < fruitBox.size(); i++){
			Fruit f = fruitBox.get(i);	// TŸ�� ��, FruitŸ���� ���� ��
			System.out.println(f);			
		}
		System.out.println("=========================");
	}

}
