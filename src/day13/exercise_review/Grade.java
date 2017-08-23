package day13.exercise_review;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Grade {
	
	public static void main(String[] args) {
		try {
			calculateGrade("data.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
		
	public static void calculateGrade(String fileString) throws FileNotFoundException {
		String fileName = "data.txt";
		Scanner scanner = new Scanner(new File(fileName));
		
		while(scanner.hasNextLine()) {
			double sum = 0;
			int cnt = 0;
			
			String readData = scanner.nextLine();	// ���Ͽ��� �� �پ� �޾ƿ���
			String[] data = readData.split(" ");	// ���� ������ ������ �������� �ɰ���
			String name = data[0];
			
			for(int i = 1; i < data.length; i++) {
				if(data[i].length() == 0) {
					continue;
				}
				sum += Integer.parseInt(data[i]);
				cnt++;
			}
			System.out.printf("%s�� ����� %.1f�Դϴ�.%n", name, (double)sum/cnt);
		}
		
	}

}