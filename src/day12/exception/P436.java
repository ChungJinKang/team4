package day12.exception;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P436 {

	public static void main(String[] args) {
		//FileInputStream fis = null;
		
		try(FileInputStream fis = new FileInputStream("test.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);) {
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {

		}
		finally {
			// ÀÚ¿ø ¹Ý³³
		}
	}

}
