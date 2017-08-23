package day11.exercise;

public abstract class Shape {
	int numSides;	// º¯ÀÇ ¼ö

	public Shape() {
		super();
	}
	public Shape(int numSides) {
		super();
		this.numSides = numSides;
	}
	
	public int getNumSides() {
		return numSides;
	}
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	
	abstract double getArea();	// ³ĞÀÌ
}
