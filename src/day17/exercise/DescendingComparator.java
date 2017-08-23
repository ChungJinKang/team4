package day17.exercise;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o2.price - o1.price;	// 가격 기준으로 내림차순 정렬
//		return o2.name.compareTo(o1.name);	// 이름 기준으로 내림차순 정렬
	}

}
