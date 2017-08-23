package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, Car> map = new HashMap<>();
		//String�� Ű�� �� �ٰ���~, 
		
		map.put("������", new Car("����", "green", 500));
		map.put("��������", new Car("������", "brown", 400));
		map.put("������", new Car("������", "green", 500));
		
		Car c = map.get("������");
		System.out.println(c);
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			Car car = map.get(key);
			System.out.println(key + " >> " + car);
		}
		
		// Student�� Key�̰� Car�� Value
		HashMap<Student, Car> scar = new HashMap<Student, Car>();
		scar.put(new Student("������", 30), new Car("So Car", "blue", 20000));
		scar.put(new Student("������", 30), new Car("�ƿ�~��", "blue", 10000));
		scar.put(new Student("����", 31), new Car("����", "white", 3000));
		
		Set<Student> skeys = scar.keySet();
		//System.out.println(skeys);
		
		Iterator<Student> it2 = skeys.iterator();
		while(it2.hasNext()) {
			Student skey = it2.next();
			Car car = scar.get(skey);
			System.out.println(skey + " >> " + car);
		}
		
	}

}
