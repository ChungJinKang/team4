package day11;

public class TestShape {

	public static void main(String[] args) {
		Shape c = new Circle(4);
		
		//c.draw();	// ȣ�� �� ��
		System.out.println(c.getArea());
		
		Circle circle = new Circle(4);
		
		circle.draw();
		System.out.printf("���� ������: %.2f", circle.getArea());
	}

}
