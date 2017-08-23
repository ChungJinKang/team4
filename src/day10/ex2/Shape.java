package day10.ex2;

public abstract class Shape {
	private String name;
	protected double area;
	
	public Shape() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}


	public Shape(String name) {
		super();
		this.name = name;
	}
	public void print() {
		System.out.println(name+ "의 면적은 " + area);
	}
	
	public abstract void calculationArea();
	
	@Override
	public String toString() {
		return name + "의 면적은 " + area;
	}
	
}
