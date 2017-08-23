package day12.inner;

public class Test03 {

	// abstract class를 익명 클래스로 생성
	public static void main(String[] args) {
		Shape circle = new Shape() {
			int r;
			
			// 생성자 함수 정의 안 됨.
//			Shape() {
//				
//			}
			
			void draw() {
				System.out.println("원을 그린다.");
			}
		};
		
		Shape rectangle = new Shape() {
			
			@Override
			void draw() {
				System.out.println("사각형을 그린다.");
			}
		};
		
		circle.draw();
		rectangle.draw();
	}

}
