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
//		System.out.println(box1.size() + "개");
//		String s = box1.get(0);		//box.get() 의 리턴 값은 T니까!
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
		//appleBox.add(new Fruit());	// 당근 안됨 
		
		fruitBox.add(new Fruit());	// 매개변수가 T니까 Fruit타입만 들어갈 수 있음
		fruitBox.add(new Apple());	// Apple이 Fruit을 상속받았으므로 이렇게 할 수도 있다.
		fruitBox.add(new Grape());	// Grape도 Fruit을 상속받음	
//		fruitBox.add(new Toy());	// 매개변수로 Toy는 넣을 수 없음.(상속도 안받았음)
		
		System.out.println(fruitBox);
		System.out.println(fruitBox.size() + "개");

		for(int i = 0; i < fruitBox.size(); i++){
			Fruit f = fruitBox.get(i);	// T타입 즉, Fruit타입이 리턴 됨
			System.out.println(f);			
		}
		System.out.println("=========================");
	}

}
