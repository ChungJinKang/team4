package day17;

public class Apple extends Fruit {
	
	
	public Apple() {
		super();
	}
	public Apple(String name, int weight) {
		super(name, weight);
	}
	@Override
	public String toString() {
		return name + "ÀÇ ¹«°Ô" + weight + "**";
	}

}
