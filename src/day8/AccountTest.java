package day8;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char choice = ' ';
		AccountService service = new AccountService();
		
		// UI �۾�!!
		while(true) {
			AccountMenu.mainMenu();
			choice = scanner.nextLine().charAt(0);
			
			// ������ ���� ���� ����
			switch(choice) {
			case '1':
				System.out.println("1. ���� ���� ���񽺸� �����մϴ�.");
				service.openAccount();
				break;
			case '2':
				System.out.println("2. �Ա� ���񽺸� �����մϴ�.");
				service.deposit();
				break;
			case '3':
				System.out.println("3. ��� ���񽺸� �����մϴ�.");
				service.withdraw();
				break;
			case '4':
				System.out.println("4. ���� ��ü ���񽺸� �����մϴ�.");
				service.transfer();
				break;
			case '5':
				System.out.println("5. ��ȸ ���񽺸� �����մϴ�.");
				service.listPrint();
				break;
			case '6':
				System.out.println("6. ���񽺸� �����մϴ�.");
				System.exit(0);
			default:
				System.out.println("��Ȯ�� ��ȣ�� �Է����ּ���.");
				break;
			}
		} 
		
		
	}

}
