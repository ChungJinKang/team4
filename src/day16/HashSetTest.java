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
		data.add("������");
		data.add("������");
		data.add("ȭ����");
		data.add("������");
		
		System.out.println(data.contains("������"));
		
		System.out.println(data.size());	// �ߺ��� ������� �����Ƿ� 3��!!!
		
		// �ټ����~
		Iterator it = data.iterator();		// Set�� ������ ����!
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}
		
		
		System.out.println("=== Lotto ��ȣ 6�� ���� ===");
		HashSet<Integer> data2 = new HashSet();		// Set �������̽��� ������ HashSet
		
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
	
		

		// equals�� �ּҸ� ���ϱ� ������ �Ʒ� �ΰ��� �ٸ��ɷ� �ν��Ѵ�.
		// ���� �����ǰ� �ʿ�
		HashSet<Person> data4 = new HashSet<Person>();
		Person p1 = new Person("ȣ�쳯��", 30);
		Person p2 = new Person("ȣ�쳯��", 30);
		
		System.out.println(p1.hashCode());	// new�Ҷ� �ּ�
		System.out.println(p2.hashCode());	// new�Ҷ� �ּ�
		
		data4.add(p1);
		data4.add(p2);

		
		// Set�� ������ ��� �Ʒ��� ���� Ȯ�� for�� ����.
		for(Person pp : data4) {
			System.out.println(pp.toString());
		}
		
	}

}
