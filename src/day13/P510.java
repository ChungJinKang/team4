package day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P510 {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("�ؽ�Ʈ ���� �̸��� �Է����ּ���: ");
//		String fileName =  input.nextLine();
		String fileName = "C:\\workspace\\sample\\test01.txt";	// ������!
		Scanner readTxt = null;
		try {
			readTxt = new Scanner(new File(fileName));	// ���Ͽ��� �о�´�.
		} catch (FileNotFoundException e) {
			System.out.println(fileName + " ������ Ȯ�����ּ���...");
		}
		
		while(readTxt.hasNextLine()) {
			String readData = readTxt.nextLine();
			System.out.println("READ: " + readData);
		}
		readTxt.close();	// �ڿ� �ݳ�
		System.out.println("==== MAIN END ====");
	}

}
