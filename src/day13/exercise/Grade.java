package day13.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Grade {
	//String fileName = "C:\\workspace\\sample\\data.txt";	// 절대경로!	
	String fileName = "data.txt";	// 상대경로!	
	
	public Grade() {
		super();
	}
	public Grade(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public void calculateGrade() {
		Scanner readText = null;
		// 파일 읽어오기
		try {
			readText = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			System.out.println(fileName + " 파일을 확인해주세요...");
		} finally {
			if(readText == null){
				System.out.println(fileName + " 파일을 확인해주세요...");
				return;
			}
		}
		
		// 파일 내용 한줄씩 받아와서 처리하기
		while(readText.hasNextLine()) {
			String readData = readText.nextLine();
			
			StringTokenizer st = new StringTokenizer(readData, " ");
			
			int sum = 0, count = 0;
			String name = st.nextToken();	// 이름
			
			while(st.hasMoreTokens()) {		// 점수 합산
				sum += Integer.parseInt((st.nextToken().trim()));
				count++;
			}
			System.out.printf("%s의 평균은 %.1f입니다.%n", name, (double)sum / count);
			
		}
		readText.close();	// 자원 반납
	}
}


// split 이용 방법
/*
sum = 0;
String[] data = readData.split(" ");
for(int i = 1; i < data.length; i++) {
	sum += Integer.parseInt(data[i]);
}
//int count = (data.length-1);
count = (data.length-1);
System.out.printf("%s의 평균은 %.1f입니다.%n", data[0], (double)sum / count);
*/
