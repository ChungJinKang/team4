package day19.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) {
		//FileInputStream fi = null;	// 1바이트씩 처리
		FileReader fi = null;			// 2바이트씩 처리
		FileWriter fw = null;	// 쓰는 작업
		try {
			//fi = new FileInputStream("src/day19/LamdaTest1.java");
			fi = new FileReader("src/day19/LamdaTest1.java");	// 읽어라
			fw = new FileWriter("LamdaTest1.java");				// 찍어라
			int data;
			
			// 읽어서 씀
			while( (data = fi.read()) != -1) {
				System.out.print((char)data);
				fw.write(data);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없다..... 경로가 없다~~");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 잘했든 못했든 자원 반납을 꼭 해줘야 함
			try {
				// 닫아줘야 다른 애들이 열 수 있음
				fi.close();
				fw.close();// 꼭 해주자
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
