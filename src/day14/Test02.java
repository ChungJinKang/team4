package day14;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		String[] names = {
			"�达", "��", "ȫ��", "�ھ�", "����"	
		};
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);	// String�� Comparable�� �����س��� ������ �ȴ�
		System.out.println(Arrays.toString(names));
		
		Employee[] emp = {
			new Employee("ȫ�浿", 44),
			new Employee("��浿", 33),
			new Employee("�ڱ浿", 24),
			new Employee("���浿", 28)
		};
		System.out.println(Arrays.toString(emp));
		Arrays.sort(emp);		
		System.out.println(Arrays.toString(emp));
	}

}

class Employee implements Comparable<Employee> {	// ���ʸ� ���
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
	public int compareTo(Employee o) {	//Object�� �ƴ� Employee�� ���ϱ� ĳ���� ���ص� ��
//		return o.age - age;
//		return age - o.age;
		
		return name.compareTo(o.name);
	}	
}

