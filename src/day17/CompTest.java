package day17;

import java.util.Collections;
import java.util.Comparator;

public class CompTest {

	public static void main(String[] args) {
		MyBox<Apple> appleBox = new MyBox<Apple>();
		MyBox<Grape> grapeBox = new MyBox<Grape>();
		
		appleBox.add(new Apple("���1", 300));
		appleBox.add(new Apple("���3", 200));
		appleBox.add(new Apple("���5", 700));
		appleBox.add(new Apple("���2", 900));
		appleBox.add(new Apple("���4", 100));
		
		Collections.sort(appleBox.list, new FruitComp());
		System.out.println(appleBox.list);

		grapeBox.add(new Grape("����1", 300));
		grapeBox.add(new Grape("����3", 200));
		grapeBox.add(new Grape("����5", 700));
		grapeBox.add(new Grape("����2", 900));
		grapeBox.add(new Grape("����4", 100));
		
		Collections.sort(grapeBox.list, new FruitComp());
		System.out.println(grapeBox.list);
	}

}

class FruitComp implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.weight - o2.weight;
	}
	
}

//class AppleComp implements Comparator<Apple> {
//
//	@Override
//	public int compare(Apple o1, Apple o2) {
//		return o1.weight - o2.weight;
//	}
//	
//}

class GrapeComp implements  Comparator<Grape> {

	@Override
	public int compare(Grape o1, Grape o2) {
		return o1.weight - o2.weight;
	}
	
}