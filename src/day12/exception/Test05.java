package day12.exception;

public class Test05 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
//		System.out.println(1/0);
		
		try {
			throw new ArithmeticException("~~~~~~ ���� ��Ȳ �߻�");	// ���� �������� ������ catch ���־�� ��
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(4);
		System.out.println(5);
	}
}

