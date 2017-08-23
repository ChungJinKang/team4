package day19.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOTest2 {

	public static void main(String[] args) {
		FileReader fi = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fi = new FileReader("src/day19/LamdaTest1.java");
			br = new BufferedReader(fi);
			fw = new FileWriter("LamdaTest3.java");
			bw = new BufferedWriter(fw);
			
			String data;
			
			while((data = br.readLine())!=null) {
				System.out.println(data);
				bw.write(data);
				bw.newLine();	// ���Ͽ��� �� �ٲٱ�
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("������ ����..... ��� Ȯ��~");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// �ڹٿ� �����ź��� close�Ѵ�
			// ���ۺ���
			try {
				br.close();
				bw.close();
				fi.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
		
	}

}
