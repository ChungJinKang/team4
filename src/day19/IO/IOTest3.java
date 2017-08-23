package day19.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOTest3 {

	public static void main(String[] args) throws FileNotFoundException {
		System.err.println("에러입니다.");
		System.out.println("값을 확인합니다.");
		
		// 표준 입력을 바꿔줌(안바꾸면 기본이 키보드)
		System.setIn(new FileInputStream("LamdaTest1.java"));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요: ");
		String s = sc. nextLine();
		System.out.println(s);
	}

}
