package day12.exception;

public class Test06 {

	public static void main(String[] args) {	// 여기에 throws 하면, 예외 발생시  MAIN END 출련 안 됨
		E e = new E();
		
		try {
			e.print();
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}

		//e.print();	// RuntimeException을 던졌을때는 Unchecked
		
		System.out.println("MAIN END");
	}

}

class E {
	
	public void print() throws CountZeroException {
		int count = (int)(Math.random() * 5);
		
		for(int i = 0; i < count; i++) {
			System.out.println(i);
		}
		if(count == 0) {
			throw new CountZeroException("Count Zero Error!");
		}
	}
}

// 사용자 정의 Exception
class CountZeroException extends Exception {
	CountZeroException() { super(); }
	CountZeroException(String msg) {
		super(msg);
	}
}