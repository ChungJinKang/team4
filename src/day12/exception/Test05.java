package day12.exception;

public class Test05 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
//		System.out.println(1/0);
		
		try {
			throw new ArithmeticException("~~~~~~ 예외 상황 발생");	// 예외 던졌으면 누군가 catch 해주어야 함
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(4);
		System.out.println(5);
	}
}

