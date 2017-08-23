package day19.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) {
		//FileInputStream fi = null;	// 1����Ʈ�� ó��
		FileReader fi = null;			// 2����Ʈ�� ó��
		FileWriter fw = null;	// ���� �۾�
		try {
			//fi = new FileInputStream("src/day19/LamdaTest1.java");
			fi = new FileReader("src/day19/LamdaTest1.java");	// �о��
			fw = new FileWriter("LamdaTest1.java");				// ����
			int data;
			
			// �о ��
			while( (data = fi.read()) != -1) {
				System.out.print((char)data);
				fw.write(data);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("������ ����..... ��ΰ� ����~~");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// ���ߵ� ���ߵ� �ڿ� �ݳ��� �� ����� ��
			try {
				// �ݾ���� �ٸ� �ֵ��� �� �� ����
				fi.close();
				fw.close();// �� ������
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
