package day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P510 {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("텍스트 파일 이름을 입력해주세요: ");
//		String fileName =  input.nextLine();
		String fileName = "C:\\workspace\\sample\\test01.txt";	// 절대경로!
		Scanner readTxt = null;
		try {
			readTxt = new Scanner(new File(fileName));	// 파일에서 읽어온다.
		} catch (FileNotFoundException e) {
			System.out.println(fileName + " 파일을 확인해주세요...");
		}
		
		while(readTxt.hasNextLine()) {
			String readData = readTxt.nextLine();
			System.out.println("READ: " + readData);
		}
		readTxt.close();	// 자원 반납
		System.out.println("==== MAIN END ====");
	}

}
