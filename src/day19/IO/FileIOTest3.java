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
			bo = new BufferedOutputStream(fo, 5);	// 5개씩 찰 때만 출력되니까 4개는 출력안됨
			
			for(int i = '1'; i <= '9'; i++) {
				bo.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 자원 반납
			try {
				bo.flush();// 버퍼에 남아있는데 출력 안된거 밀어줘라?
				fo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // finally
		
	}

}
