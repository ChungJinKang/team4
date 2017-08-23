package day8;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char choice = ' ';
		AccountService service = new AccountService();
		
		// UI 작업!!
		while(true) {
			AccountMenu.mainMenu();
			choice = scanner.nextLine().charAt(0);
			
			// 선택한 값에 따른 서비스
			switch(choice) {
			case '1':
				System.out.println("1. 계좌 개설 서비스를 시작합니다.");
				service.openAccount();
				break;
			case '2':
				System.out.println("2. 입급 서비스를 시작합니다.");
				service.deposit();
				break;
			case '3':
				System.out.println("3. 출급 서비스를 시작합니다.");
				service.withdraw();
				break;
			case '4':
				System.out.println("4. 계좌 이체 서비스를 시작합니다.");
				service.transfer();
				break;
			case '5':
				System.out.println("5. 조회 서비스를 시작합니다.");
				service.listPrint();
				break;
			case '6':
				System.out.println("6. 서비스를 종료합니다.");
				System.exit(0);
			default:
				System.out.println("정확한 번호를 입력해주세요.");
				break;
			}
		} 
		
		
	}

}
