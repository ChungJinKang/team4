package day10;

public abstract class Animal {
	String kind;
	
	public Animal() {
		this("동물 종류");
	}
	public Animal(String kind) {
		this.kind = kind;
	}
	
	public void print() {
		System.out.println(" **** Animal (" + kind + ") ****");
	}
	
	
	public abstract  void breath();
	
	
}
