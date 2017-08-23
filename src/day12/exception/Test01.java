package day12.exception;

public class Test01 {

	public static void main(String[] args) {
		// local variable�� �ʱ�ȭ �����!
		int num1 = 0;
		int num2 = 0;
		
		try {
			num1 = Integer.parseInt(args[0]);			
			num2 = Integer.parseInt(args[1]);
			System.out.println(num1/num2);			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("���� �Ķ���� �� �ΰ��� �ʿ��մϴ�.");
		} catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("num2�� 0�� ������� �ʽ��ϴ�.");
		} catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է����ּ�ȣ��!");
			System.out.println("��)java Test01 66 77");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("�׻� ����Ǵ� ��� �ڿ� �ݳ� �ڵ� ~~~");		
		}

		System.out.println("=== Main End ===");
	}

}
