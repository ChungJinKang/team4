package day2;

import java.util.Scanner;

public class P40 {

	public static void main(String[] args) {
		String name = null;
		int age = 0;
		Scanner scanner = new Scanner(System.in);	// ��ü ����
													// System.in -> Ű���忡�� �о�´ٴ� ��

		System.out.print("�̸��� �Է��ϼ���: ");
		name = scanner.nextLine();
		System.out.print("������ �Է��ϼ���(ex: 26): ");
		//age = Integer.parseInt(scanner.nextLine());	// ���ڿ� ���� �Է��ϰ� int������ ��ȯ
		age = scanner.nextInt();
		
		System.out.printf("%n�Է��Ͻ� �̸��� = %s %n", name);
		System.out.printf("�Է��Ͻ� ���̴� = %d %n", age);
		name = null;
		//scanner = null;
		scanner.close();	// �ڿ� ����ϰų� io�۾��� ��� close�� �ݳ� ����
							// close�� ���� �� �ڿ� �ݳ����� ���� �˴ϴ�
	}
	
}
