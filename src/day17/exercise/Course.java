package day17.exercise;

import java.util.Arrays;

public class Course<T> {
	private String name;
	private T[] students;
	
	@SuppressWarnings("unchecked")
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
	}

	public String getName() { return name; }
	public T[] getStudents() { return students; }
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;	// 한명 한명을 집어 넣어줌
				break;
			}
		}
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", students=" + Arrays.toString(students) + "]";
	}
	
	
}
