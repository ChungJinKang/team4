package day12.inner;

public class Test03 {

	// abstract class�� �͸� Ŭ������ ����
	public static void main(String[] args) {
		Shape circle = new Shape() {
			int r;
			
			// ������ �Լ� ���� �� ��.
//			Shape() {
//				
//			}
			
			void draw() {
				System.out.println("���� �׸���.");
			}
		};
		
		Shape rectangle = new Shape() {
			
			@Override
			void draw() {
				System.out.println("�簢���� �׸���.");
			}
		};
		
		circle.draw();
		rectangle.draw();
	}

}
