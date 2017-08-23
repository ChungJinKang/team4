package day8;

public class Dog extends Animal {
	String kind="강아지 종류";
	String name;
	
	public void print() {
		System.out.printf("Dog[%s, %s, %s]%n", super.kind, kind, name);
	}
}
