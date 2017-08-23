package day16;

import java.util.Arrays;

public class ComparatorTest2 {

	public static void main(String[] args) {
		Car[] cars = new Car[5];

		cars[0] = new Car("BMW520", "white", 6000);
		cars[1] = new Car("그랜져", "red", 7000);
		cars[2] = new Car("소나타", "green", 8000);
		cars[3] = new Car("봉고", "black", 4000);
		cars[4] = new Car("버스", "yellow", 6000);
		
		//System.out.println(Arrays.toString(cars));
		print(cars);
		// sort할 능력이 없음!!!
		// sort할려면 반드시 Comparable를 구현해야 한대
		Arrays.sort(cars);
		print(cars);
		
	}
	public static void print(Car[] cars) {
		for(Car c : cars) {
			System.out.println(c);
		}
	}

}
