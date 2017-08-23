package day10.ex2;

public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		super();
	}
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public void calculationArea() {
		//super.setArea(Math.PI * radius * radius);
		this.area = Math.PI * radius * radius;
	}
}
