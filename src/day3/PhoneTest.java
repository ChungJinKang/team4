package day3;

import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("�����ϼ���...");
			System.out.println("1. ������ �Է�");
			System.out.println("2. ������ ����");
			System.out.println("3. ������ �˻�");
			System.out.println("4. ������ ����");
			System.out.println("5. ���α׷� ����");
			System.out.print("����: ");
			
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("1. ������ �Է� ����Դϴ�.");
				break;
			case 2:
				System.out.println("2. ������ ���� ����Դϴ�.");
				break;
			case 3:
				System.out.println("3. ������ �˻� ����Դϴ�.");
				break;
			case 4:
				System.out.println("4. ������ ���� ����Դϴ�.");
				break;
			case 5:
				System.out.println("5. ���α׷� �����Դϴ�.");
				return;
			}
		}
	}

}
