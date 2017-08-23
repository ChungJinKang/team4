package day14;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		String[] names = {
			"±è¾¾", "°í¾¾", "È«¾¾", "¹Ú¾¾", "°­¾¾"	
		};
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);	// StringÀº ComparableÀ» ±¸ÇöÇØ³ö¼­ ¼ÒÆÃÀÌ µÈ´ó
		System.out.println(Arrays.toString(names));
		
		Employee[] emp = {
			new Employee("È«±æµ¿", 44),
			new Employee("°í±æµ¿", 33),
			new Employee("¹Ú±æµ¿", 24),
			new Employee("°­±æµ¿", 28)
		};
		System.out.println(Arrays.toString(emp));
		Arrays.sort(emp);		
		System.out.println(Arrays.toString(emp));
	}

}

class Employee implements Comparable<Employee> {	// Á¦³Ê¸¯ ±â´É
	String name;
	int age;
	
	public Employee() { }
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Employee o) {	//Object°¡ ¾Æ´Ñ Employee·Î ¿À´Ï±î Ä³½ºÆÃ ¾ÈÇØµµ µÊ
//		return o.age - age;
//		return age - o.age;
		
		return name.compareTo(o.name);
	}	
}

