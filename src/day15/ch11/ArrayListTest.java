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
		
		arr[0] = new Student("ȣ��", 99);
	}
	
	public static void arrayListTest() {
		ArrayList<Student> list = new ArrayList();
		list.add(new Student("ȣ��", 99));
		list.add(new Student("ȣ��ȣ��", 80));
		list.add(new Student("ȣ��ȣ���P", 70));
		list.add(new Student("ȣ���P", 60));
		list.add(new Student("ȣ��ȣ��ȣ��ȣȣ", 90));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public static void main(String[] args) {
		//arrTest();
		arrayListTest();
	}

}
