package day12.exception;

public class Test02 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(100/(int)(Math.random()*5));		
			// �� �ڵ忡�� ���� �߻��ϸ� ���⼭ ���ʹ� ������� �ʴ´�.
			// ���� ���⿡ �ڿ� �ݳ� �ڵ带 ������ �ȵ�!!!
			System.out.println(3);
			System.out.println(4);
			//System.out.println("�ڿ� �ݳ� �ڵ�");
		} catch(ArithmeticException e) {
			//System.out.println("������ ���� ����");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// �׻� ����Ǿ�� �ϴ� �ڿ� �ݳ��ڵ�� ���⿡~
			System.out.println("�ڿ� �ݳ� �ڵ�");
		}
		
		System.out.println("Main END");
	}

}
