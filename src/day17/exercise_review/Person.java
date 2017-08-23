package day17.exercise_review;

public class Person implements Comparable<Person> {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		return age - o.age;
	}

	
}
