package day11;

public class TestShape {

	public static void main(String[] args) {
		Shape c = new Circle(4);
		
		//c.draw();	// 호출 안 됨
		System.out.println(c.getArea());
		
		Circle circle = new Circle(4);
		
		circle.draw();
		System.out.printf("원의 반지름: %.2f", circle.getArea());
	}

}
