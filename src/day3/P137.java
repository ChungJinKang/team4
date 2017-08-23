package day3;

import java.util.Scanner;

public class P137 {

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		num = scanner.nextInt();
		System.out.print(num + " >> ");
		
		if(num == 0)
			System.out.println("0 입니다.");
		else if(num > 0)
			System.out.println("양수입니다.");
		else
			System.out.println("음수입니다.");
		
		scanner.close();
	}

}
