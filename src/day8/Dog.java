package day8;

public class Dog extends Animal {
	String kind="������ ����";
	String name;
	
	public void print() {
		System.out.printf("Dog[%s, %s, %s]%n", super.kind, kind, name);
	}
}
