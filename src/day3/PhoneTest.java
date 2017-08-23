package day3;

import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("선택하세요...");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 데이터 삭제");
			System.out.println("3. 데이터 검색");
			System.out.println("4. 데이터 보기");
			System.out.println("5. 프로그램 종료");
			System.out.print("선택: ");
			
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("1. 데이터 입력 기능입니다.");
				break;
			case 2:
				System.out.println("2. 데이터 삭제 기능입니다.");
				break;
			case 3:
				System.out.println("3. 데이터 검색 기능입니다.");
				break;
			case 4:
				System.out.println("4. 데이터 보기 기능입니다.");
				break;
			case 5:
				System.out.println("5. 프로그램 종료입니다.");
				return;
			}
		}
	}

}
