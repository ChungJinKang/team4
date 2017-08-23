package day10;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "[�̸�: " + name + ", ����: " + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj instanceof Person) {
			if( name.equals(((Person)obj).name) && (((Person)obj).age == this.age) )
				return true;
		}

		return false;
	}
}
