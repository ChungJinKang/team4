package day10.ex;

public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		
	}	
//	public Circle(double radius) {
//		super();
//		this.radius = radius;
//	}

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculationArea() {
		super.setArea(Math.PI * radius * radius);
	}
}
