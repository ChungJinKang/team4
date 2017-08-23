package day13;

public class Test01 {

	public static void main(String[] args) {
		Point p1 = new Point(2, 2);
		System.out.println(p1);
		Point p2 = new Point(2, 2);
		Point p3 = null;
		System.out.println(p2);
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals("hi"));
		
		System.out.println("---------------");
		Circle c1 = new Circle(new Point(2, 2),4);
		Circle c2 = new Circle(new Point(2, 2),4);
		
		System.out.println(c1.equals(c2));
	}

}
