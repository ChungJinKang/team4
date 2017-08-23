package day16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

class Person { 
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return (name + age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person))
			return false;
		Person p = (Person)obj;
		
		return name.equals(p.name) && age == p.age;
	}
	
	
}

public class HashSetTest {

	public static void main(String[] args) {
		HashSet data = new HashSet();
		data.add("월요일");
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		
		System.out.println(data.contains("월요일"));
		
		System.out.println(data.size());	// 중복을 허용하지 않으므로 3개!!!
		
		// 줄세우기~
		Iterator it = data.iterator();		// Set은 순서가 없다!
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}
		
		
		System.out.println("=== Lotto 번호 6개 생성 ===");
		HashSet<Integer> data2 = new HashSet();		// Set 인터페이스를 구현한 HashSet
		
		while(data2.size() < 6) {
			int su = (int)(Math.random()*45) + 1;
			data2.add(su);
		}
		System.out.println(data2);
		
		//integer[] data3 = (integer[])data2.toArray();
		//System.out.println(Arrays.toString(data2.toArray()));
	
//		Object[] data3 = data2.toArray();
//		for(Object obj : data3) {
//			(Integer) obj;
//		}
		
//		it = data2.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
	
		

		// equals는 주소를 비교하기 때문에 아래 두개는 다른걸로 인식한다.
		// 따라서 재정의가 필요
		HashSet<Person> data4 = new HashSet<Person>();
		Person p1 = new Person("호우날두", 30);
		Person p2 = new Person("호우날두", 30);
		
		System.out.println(p1.hashCode());	// new할때 주소
		System.out.println(p2.hashCode());	// new할때 주소
		
		data4.add(p1);
		data4.add(p2);

		
		// Set은 순서가 없어서 아래와 가이 확장 for를 쓴다.
		for(Person pp : data4) {
			System.out.println(pp.toString());
		}
		
	}

}
