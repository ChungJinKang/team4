package day3;

import java.util.Scanner;

public class P137 {

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		num = scanner.nextInt();
		System.out.print(num + " >> ");
		
		if(num == 0)
			System.out.println("0 �Դϴ�.");
		else if(num > 0)
			System.out.println("����Դϴ�.");
		else
			System.out.println("�����Դϴ�.");
		
		scanner.close();
	}

}
