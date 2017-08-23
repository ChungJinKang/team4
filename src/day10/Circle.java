package day10;

public class Circle extends Shape{	
	@Override
	public double getArea(int radius) {
		return radius*radius *Math.PI;
	}
	public static void main(String[] args) {
		Shape shape  = new Circle();	// 추상 클래스는 객체 생성이 불가하므로 new Shape()는 안댐
		System.out.println(shape.getArea(4));
	}
}
