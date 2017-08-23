package day2;

import java.util.Scanner;

public class P40 {

	public static void main(String[] args) {
		String name = null;
		int age = 0;
		Scanner scanner = new Scanner(System.in);	// 객체 생성
													// System.in -> 키보드에서 읽어온다는 뜼

		System.out.print("이름을 입력하세요: ");
		name = scanner.nextLine();
		System.out.print("나이을 입력하세요(ex: 26): ");
		//age = Integer.parseInt(scanner.nextLine());	// 문자열 한줄 입력하고 int형으로 변환
		age = scanner.nextInt();
		
		System.out.printf("%n입력하신 이름은 = %s %n", name);
		System.out.printf("입렵하신 나이는 = %d %n", age);
		name = null;
		//scanner = null;
		scanner.close();	// 자원 사용하거나 io작업일 경우 close로 반납 가능
							// close는 거의 다 자원 반납으로 보면 됩니다
	}
	
}
