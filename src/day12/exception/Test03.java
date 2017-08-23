package day12.exception;

public class Test03 {

	public static void main(String[] args) {
		A a = new A();
		
		a.print(123);
		try {
			a.print2(321);
		} catch (ArithmeticException e) {
			System.out.println("난수 발생 0으로 인한 처리 오류");
		}
			
			
		//		try {
//			a.print2(321);
//		} catch (Exception e) {
//			if(e instanceof ArithmeticException)
//				System.out.println("난수 발생 0으로 인한 처리 오류");
//			else
//				e.printStackTrace();
//		}
		
		System.out.println("===== MAIN END =====");
	}

}

class A {
	void print(int num) {
		try {
			System.out.println(num / (int)(Math.random()*5));
		} catch(ArithmeticException e) {
			System.out.println("난수 발생 0으로 인한 처리 오류");
		}
	}
	void print2(int num) throws ArithmeticException {
		System.out.println(num / (int)(Math.random()*5));
	}
}