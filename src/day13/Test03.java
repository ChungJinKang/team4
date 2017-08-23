package day13;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		Circle[] circles = {
			new Circle(new Point(2,2),2),	
			new Circle(new Point(4,4),4)
		};
		
		System.out.println(Arrays.toString(circles));

		Circle[] copy = circles.clone();
		copy[0].p.x = 0;
		copy[0].r = 0;
		System.out.println(Arrays.toString(circles));
 		System.out.println(Arrays.toString(copy));
		System.out.println(circles[0] == copy[0]);
		
		Circle c = new Circle(new Point(7,7), 3);
		System.out.println("����: " + c);

		Circle cp = c.clone();		//Circle�� ���������� Ŭ����������
		System.out.println("���纻: " + cp);
	}

}
