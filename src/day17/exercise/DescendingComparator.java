package day17.exercise;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o2.price - o1.price;	// ���� �������� �������� ����
//		return o2.name.compareTo(o1.name);	// �̸� �������� �������� ����
	}

}
