package day19.IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest3 {

	public static void main(String[] args) {
		FileOutputStream fo = null;
		BufferedOutputStream bo = null;
		
		try {
			fo = new FileOutputStream("aa.txt", true);	// append true
			bo = new BufferedOutputStream(fo, 5);	// 5���� �� ���� ��µǴϱ� 4���� ��¾ȵ�
			
			for(int i = '1'; i <= '9'; i++) {
				bo.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// �ڿ� �ݳ�
			try {
				bo.flush();// ���ۿ� �����ִµ� ��� �ȵȰ� �о����?
				fo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // finally
		
	}

}
