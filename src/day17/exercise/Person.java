package day17.exercise;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() { return name; }
	public int getAge() { return age; }
	public String toString() { return name + "(" + age + "¼¼)"; }

	@Override
	public int compareTo(Person o) {
		return this.age - o.getAge();
	}


}
