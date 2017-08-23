package day12.exception;

import java.io.File;
import java.io.IOException;

public class P431 {
	
	public static void main(String[] args) {
		File f1 = createFile(null);
		System.out.println(f1);
	}
	
	static File createFile(String fileName) {
		if(fileName == null || fileName.equals("")) {
			try {
				throw new Exception("파일 이름이 유효하지 않습니다.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				fileName = "제목없음.txt";				
			}
		}
		
		File f = new File(fileName);
		createNewFile(f);
		return f;
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
