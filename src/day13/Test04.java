package day13;

public class Test04 {

	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(1, 1), 1);
		
		System.out.println(c1);
		
		c1.close();
		c1 = null;
		System.gc();	// garbage collector, 코드로 함부러 써주면 안된대
						// gc가 실행 되면 나중에 finalize() 실행 되나봄
		
		System.out.println("=== MAIN END ===");
	}

}
