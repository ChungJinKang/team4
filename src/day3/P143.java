package day3;

import java.util.Scanner;

public class P143 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String std;
		int score;
		char grade;
		
		System.out.print("학생: ");
		std = scanner.nextLine();
		System.out.print("성적: ");
		score = scanner.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("잘못된 점수 입력입니다.");
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
		
		System.out.printf("\'%s\'학생의 학점은 %c (%d점)입니다.%n", std, grade, score);
		scanner.close();
	}

}
