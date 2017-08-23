package day11.exercise;

public class RectTriangle extends Shape {
	double width;
	double height;
	
	public RectTriangle() {
		super();
		setNumSides(3);
	}
	public RectTriangle(double width, double height) {
		this();
		this.width = width;
		this.height = height;
	}
	
	@Override
	double getArea() {
		return width * height * (0.5);
	}
	
	
	
}
