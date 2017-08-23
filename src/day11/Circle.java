package day11;

// Circle의 조상은 2개!!!
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
		System.out.printf("반지름 %d인 Circle 그리기%n", r);
	}
	@Override
	public double getArea() {
		return Math.PI * r * r;
	}
	
}
