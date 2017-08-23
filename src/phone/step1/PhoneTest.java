package phone.step1;

import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		System.out.println("**** 전화번호부 관리 프로그램 ****\n");
		
		PhoneService2 service = new PhoneManager();
		//PhoneService service = new PhoneService();
		
		while(true) {
			menu();
			choice = scanner.nextInt();
			scanner.nextLine();	// 엔터키 받기 위함
			
			switch(choice) {
			case 1:
				System.out.println("1. 데이터 입력 기능입니다.");
				service.insertData();
				break;
			case 2:
				System.out.println("2. 데이터 삭제 기능입니다.");
				System.out.println("삭제된 데이터: " + service.deleteData());
				break;
			case 3:
				System.out.println("3. 데이터 검색 기능입니다.");
				service.searchData();
				break;
			case 4:
				System.out.println("4. 데이터 보기 기능입니다.");
				service.print();
				break;
			case 5:
				System.out.println("5. 프로그램이 종료 되었습니다.");
				scanner.close();
				//return;
				System.exit(0);	// application 종료
			default:
				System.out.println("잘못된 입력입니다.");
			}
			System.out.println();
		}
	}

	public static void menu() {
		System.out.println(" --- 원하는 기능을 선택하세요 ---");
		System.out.println("  1. 입력                       ");
		System.out.println("  2. 삭제                       ");
		System.out.println("  3. 검색                       ");
		System.out.println("  4. 목록 보기                ");
		System.out.println("  5. 종료                       ");
		System.out.println(" -----------------------");
		System.out.print("선택: ");
	}
}
