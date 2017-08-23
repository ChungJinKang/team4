package day3;

import java.util.Scanner;

public class P143 {

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
		/*
		if(score >= 90)
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		else
			grade = 'F'; 
		*/
		
		grade = score >= 90 ? 'A' : (score >= 80 ? 'B' : (score >= 70 ? 'C' : (score >= 60 ? 'D' : 'F')));
		
		System.out.printf("\'%s\'�л��� ������ %c (%d��)�Դϴ�.%n", std, grade, score);
		scanner.close();
	}

}
