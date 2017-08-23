package day12.exception;

public class Test06 {

	public static void main(String[] args) {	// ���⿡ throws �ϸ�, ���� �߻���  MAIN END ��� �� ��
		E e = new E();
		
		try {
			e.print();
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}

		//e.print();	// RuntimeException�� ���������� Unchecked
		
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

// ����� ���� Exception
class CountZeroException extends Exception {
	CountZeroException() { super(); }
	CountZeroException(String msg) {
		super(msg);
	}
}