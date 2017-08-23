package day17.exercise_review;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();

		treeSet.add(new Person("ȫ�浿", 22));
		treeSet.add(new Person("��浿", 20));
		treeSet.add(new Person("��浿", 29));
		
		Iterator<Person> it = treeSet.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.name + ": " + p.age);
		}
	}

}
