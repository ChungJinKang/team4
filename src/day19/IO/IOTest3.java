package day19.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOTest3 {

	public static void main(String[] args) throws FileNotFoundException {
		System.err.println("�����Դϴ�.");
		System.out.println("���� Ȯ���մϴ�.");
		
		// ǥ�� �Է��� �ٲ���(�ȹٲٸ� �⺻�� Ű����)
		System.setIn(new FileInputStream("LamdaTest1.java"));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է��ϼ���: ");
		String s = sc. nextLine();
		System.out.println(s);
	}

}
