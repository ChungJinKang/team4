package phone.step1;

import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		System.out.println("**** ��ȭ��ȣ�� ���� ���α׷� ****\n");
		
		PhoneService2 service = new PhoneManager();
		//PhoneService service = new PhoneService();
		
		while(true) {
			menu();
			choice = scanner.nextInt();
			scanner.nextLine();	// ����Ű �ޱ� ����
			
			switch(choice) {
			case 1:
				System.out.println("1. ������ �Է� ����Դϴ�.");
				service.insertData();
				break;
			case 2:
				System.out.println("2. ������ ���� ����Դϴ�.");
				System.out.println("������ ������: " + service.deleteData());
				break;
			case 3:
				System.out.println("3. ������ �˻� ����Դϴ�.");
				service.searchData();
				break;
			case 4:
				System.out.println("4. ������ ���� ����Դϴ�.");
				service.print();
				break;
			case 5:
				System.out.println("5. ���α׷��� ���� �Ǿ����ϴ�.");
				scanner.close();
				//return;
				System.exit(0);	// application ����
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			System.out.println();
		}
	}

	public static void menu() {
		System.out.println(" --- ���ϴ� ����� �����ϼ��� ---");
		System.out.println("  1. �Է�                       ");
		System.out.println("  2. ����                       ");
		System.out.println("  3. �˻�                       ");
		System.out.println("  4. ��� ����                ");
		System.out.println("  5. ����                       ");
		System.out.println(" -----------------------");
		System.out.print("����: ");
	}
}
