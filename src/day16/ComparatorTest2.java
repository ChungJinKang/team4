package day16;

import java.util.Arrays;

public class ComparatorTest2 {

	public static void main(String[] args) {
		Car[] cars = new Car[5];

		cars[0] = new Car("BMW520", "white", 6000);
		cars[1] = new Car("�׷���", "red", 7000);
		cars[2] = new Car("�ҳ�Ÿ", "green", 8000);
		cars[3] = new Car("����", "black", 4000);
		cars[4] = new Car("����", "yellow", 6000);
		
		//System.out.println(Arrays.toString(cars));
		print(cars);
		// sort�� �ɷ��� ����!!!
		// sort�ҷ��� �ݵ�� Comparable�� �����ؾ� �Ѵ�
		Arrays.sort(cars);
		print(cars);
		
	}
	public static void print(Car[] cars) {
		for(Car c : cars) {
			System.out.println(c);
		}
	}

}
