package day11;

public class Test02 {

	public static void main(String[] args) {
		Drawable d = new Rectangle(3,5);
		System.out.println(d); 		//	toString() �������̵� ������ ���ϴ� �� �� ����

		((Resizeable)d).resize(0.5);	// casting �ʿ�
		d.draw();
		System.out.println(d);
		
		// ���� �������̽� ���
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
