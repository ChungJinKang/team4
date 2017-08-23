package day11;

// Circle�� ������ 2��!!!
public class Circle extends Shape implements Drawable {
	int r;
	
	public Circle() {
		super();
	}
	public Circle(int r) {
		super();
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.printf("������ %d�� Circle �׸���%n", r);
	}
	@Override
	public double getArea() {
		return Math.PI * r * r;
	}
	
}
