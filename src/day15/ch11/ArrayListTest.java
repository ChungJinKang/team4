package day15.ch11;

import java.util.ArrayList;

class Student {
	String name;
	int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
}

public class ArrayListTest {

	public static void arrTest() {
		Student[] arr = new Student[24];
		
		arr[0] = new Student("호우", 99);
	}
	
	public static void arrayListTest() {
		ArrayList<Student> list = new ArrayList();
		list.add(new Student("호우", 99));
		list.add(new Student("호우호우", 80));
		list.add(new Student("호우호우홓", 70));
		list.add(new Student("호우홓", 60));
		list.add(new Student("호우호우호우호호", 90));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public static void main(String[] args) {
		//arrTest();
		arrayListTest();
	}

}
