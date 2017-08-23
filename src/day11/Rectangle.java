package day11;

interface DrawableAndResizeable extends Drawable, Resizeable {
	
}

//public class Rectangle implements Drawable, Resizeable {
public class Rectangle implements DrawableAndResizeable {
	int w, h;
	
	public Rectangle() {
		super();
	}
	public Rectangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}

	@Override
	public void resize(double i) {
		h *= i;
		w *= i;
	}

	@Override
	public void draw() {
		System.out.printf("[%d, %d] 사각형 그리기%n", w, h);
	}
	@Override
	public String toString() {
		return "Rectangle [w=" + w + ", h=" + h + "]";
	}
	
}
