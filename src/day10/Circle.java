package day10;

public class Circle extends Shape{	
	@Override
	public double getArea(int radius) {
		return radius*radius *Math.PI;
	}
	public static void main(String[] args) {
		Shape shape  = new Circle();	// �߻� Ŭ������ ��ü ������ �Ұ��ϹǷ� new Shape()�� �ȴ�
		System.out.println(shape.getArea(4));
	}
}
