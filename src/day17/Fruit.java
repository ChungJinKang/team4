package day17;

public class Fruit implements Eatable {
	String name;
	int weight;
	
	public Fruit() {
		super();
	}
	public Fruit(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Fruit";
	}
	
}
