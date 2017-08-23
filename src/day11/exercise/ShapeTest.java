package day11.exercise;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 6);
		RectTriangle rectTriangle = new RectTriangle(6, 2);
		
		Shape[] shape = new Shape[2];
		shape[0] = rectangle;
		shape[1] = rectTriangle;
		
		for(int i = 0; i < shape.length; i++) {
			System.out.println("area: " + shape[i].getArea());
			
			if(shape[i] instanceof Resizeable) {
				((Resizeable)shape[i]).resize(0.5);
				System.out.println("new Area: " + (shape[i]).getArea());
			}
		}
		
	}

}
