package day12.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test04 {

	public static void main(String[] args) {
		System.out.println("MAIN START");
		
		try {
			Thread.sleep(5000);		// 5�� ���� sleep
		} catch (InterruptedException e) {	// Checked Exception
			e.printStackTrace();
		}
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			// ������ �����ϱ�
			System.out.println("test.txt ������ �غ����ּ���.");
		} finally {
			System.out.println(fis);
			// fis �ڿ� �ݳ� �ʿ�
			try {
				if(fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("MAIN END");
	}

}
