package day12.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test04 {

	public static void main(String[] args) {
		System.out.println("MAIN START");
		
		try {
			Thread.sleep(5000);		// 5초 동안 sleep
		} catch (InterruptedException e) {	// Checked Exception
			e.printStackTrace();
		}
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			// 파일이 없으니까
			System.out.println("test.txt 파일을 준비해주세요.");
		} finally {
			System.out.println(fis);
			// fis 자원 반납 필요
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
