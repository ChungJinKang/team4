package day11.exercise;

public class Rectangle extends Shape implements Resizeable {
	double width;
	double height;
	
	public Rectangle() {
		super();
		setNumSides(4);
	}
	public Rectangle(double width, double height) {
		this();
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void resize(double s) {
		width *= s;
		height *= s;
	}
	
	@Override
	double getArea() {
		return width * height;
	}
	
	
	
}
