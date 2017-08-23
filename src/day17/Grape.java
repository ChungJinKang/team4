package day17;

public class Grape extends Fruit {
	
	public Grape() {
		super();
	}

	public Grape(String name, int weight) {
		super(name, weight);
	}

	@Override
	public String toString() {
		return name + "ÀÇ ¹«°Ô" + weight + "**";
	}
	
}
