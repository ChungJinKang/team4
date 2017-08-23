package day11.exercise_review;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shapes = {
				new Rectangle(5, 6),
				new RectTriangle(6, 2)
		};
		
		for(int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
			System.out.println("Area: " + shapes[i].getArea());
			if(shapes[i] instanceof Resizeable) {
				((Resizeable)shapes[i]).resize(0.5);
				System.out.println("Resized area: " + shapes[i].getArea());
			}
			
		}
	}

}

abstract class Shape {
	private int numSides;

	public Shape() {
		super();
	}
	public Shape(int numSides) {
		super();
		this.numSides = numSides;
	}
	
	public int getnumSides() {
		return numSides;
	}
	
	abstract double getArea();
	
}

interface Resizeable {
	void resize(double d);
}

class RectTriangle extends Shape {
	double w;
	double h;
	
	public RectTriangle() {
		super();
	}
	public RectTriangle(double w, double h) {
		super();
		this.w = w;
		this.h = h;
	}

	@Override
	double getArea() {
		return w * h *(0.5);
	}
	public String toString() {
		return "RectTriangle [w = " + w + ", h = " + h + "]";
	}
	
}

class Rectangle extends Shape implements Resizeable {
	double w;
	double h;
	
	public Rectangle() {
		super();
	}
	public Rectangle(double w, double h) {
		super();
		this.w = w;
		this.h = h;
	}
	
	@Override
	public void resize(double d) {	// public ²À ÇÊ¿ä!
		w *=d;
		h *=d;
	}
	@Override
	double getArea() {
		return w * h;
	}
	@Override
	public String toString() {
		return "Rectangle [w = " + w + ", h = " + h + "]";
	}
	
}
