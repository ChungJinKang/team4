package day16;

import java.util.Arrays;
import java.util.HashSet;


public class HashSetTest2 {

	public static void main(String[] args) {
		HashSet<Car> data = new HashSet<Car>();
		data.add(new Car("그랜져", "black", 5000));
		data.add(new Car("그랜져", "black", 5000));
		data.add(new Car("그랜져2", "black", 5000));
		data.add(new Car("그랜져2", "black", 5000));
		data.add(new Car("그랜져3", "black", 5000));
		
		System.out.println(data);
		//System.out.println(Arrays.toString(data.toArray()).toString());
		
		int sum = 0;
		for(Car c : data) {
			sum += c.price;
			System.out.println(c);
		}
		System.out.println(sum);
	}

}
