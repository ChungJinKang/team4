package day13;

public class Test04 {

	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(1, 1), 1);
		
		System.out.println(c1);
		
		c1.close();
		c1 = null;
		System.gc();	// garbage collector, �ڵ�� �Ժη� ���ָ� �ȵȴ�
						// gc�� ���� �Ǹ� ���߿� finalize() ���� �ǳ���
		
		System.out.println("=== MAIN END ===");
	}

}
