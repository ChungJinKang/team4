package day11;

public class Test02 {

	public static void main(String[] args) {
		Drawable d = new Rectangle(3,5);
		System.out.println(d); 		//	toString() 오버라이딩 했으니 원하는 값 잘 나옴

		((Resizeable)d).resize(0.5);	// casting 필요
		d.draw();
		System.out.println(d);
		
		// 통합 인터페이스 사용
		System.out.println();
		DrawableAndResizeable dr = (DrawableAndResizeable) d;
		dr.draw();
		dr.resize(2);
		System.out.println(dr);
		
		System.out.println();
		Rectangle rrr = (Rectangle)d;
		rrr.draw();
		rrr.resize(3);
		System.out.println(rrr);
	}

}
