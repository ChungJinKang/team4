package day12.exception;

public class Test02 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(100/(int)(Math.random()*5));		
			// 윗 코드에서 예외 발생하면 여기서 부터는 실행되지 않는다.
			// 따라서 여기에 자원 반납 코드를 넣으면 안됨!!!
			System.out.println(3);
			System.out.println(4);
			//System.out.println("자원 반납 코드");
		} catch(ArithmeticException e) {
			//System.out.println("나누기 수식 오류");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// 항상 수행되어야 하는 자원 반납코드는 여기에~
			System.out.println("자원 반납 코드");
		}
		
		System.out.println("Main END");
	}

}
