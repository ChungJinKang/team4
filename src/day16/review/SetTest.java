package day16.review;

import java.util.HashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> data = new HashSet<String>();
		
		//Set : 중복 없다. 순서 없다.
		//HashSet-- 자동 sort 아님
		data.add("수요일");
		data.add("화요일");
		data.add("월요일");
		data.add("화요일");
		
		System.out.println(data);
		
		//sort를 위해선 collections 안에 있는 기능을 이용해야 함
		
		//TreeSet-- 자동 sort
		TreeSet<String> data2 = new TreeSet<String>();
		
		data2.add("화요일");
		data2.add("월요일");
		data2.add("화요일");
		data2.add("수요일");
		
		System.out.println(data2);

		System.out.println("======== HashSet<Car> =======");
		HashSet<Car> data3 = new HashSet<Car>();
		
		data3.add(new Car("수", 1000));
		data3.add(new Car("월", 3000));
		data3.add(new Car("화", 2000));
		data3.add(new Car("화", 2000));
		
		System.out.println(data3);
		

		System.out.println("======== TreeSet<Car> =======");
		TreeSet<Car> data4 = new TreeSet<Car>();
		
		data4.add(new Car("수", 1000));
		data4.add(new Car("월", 3000));
		data4.add(new Car("화", 2000));
		data4.add(new Car("화", 2000));
		
		System.out.println(data4);
	}
}
