package day3;

import java.util.Scanner;

public class P146 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String std;
		int score;
		char grade;
		
		System.out.print("�л�: ");
		std = scanner.nextLine();
		System.out.print("����: ");
		score = scanner.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("�߸��� ���� �Է��Դϴ�.");
			scanner.close();
			return;
		}
		
		switch(score / 10) {
			case 10: case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';	
		}
		
		System.out.printf("\'%s\'�л��� ������ %c (%d��)�Դϴ�.%n", std, grade, score);
		scanner.close();
	}

}
