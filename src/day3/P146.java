package day3;

import java.util.Scanner;

public class P146 {

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
		
		System.out.printf("\'%s\'학생의 학점은 %c (%d점)입니다.%n", std, grade, score);
		scanner.close();
	}

}
