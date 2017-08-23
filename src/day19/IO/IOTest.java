package day19.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class IOTest {

	public static void main(String[] args) {
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		while((data = input.read()) != -1) {
			output.write(data);
		}
		outSrc = output.toByteArray();
		
		System.out.println(Arrays.toString(inSrc));
		System.out.println(Arrays.toString(outSrc));
		
		/*
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
//		String s = sc.nextLine();	// next()만 쓰면 한 단어만!
		int s = sc.nextInt();
		System.out.println(s);
		*/
		/*
		InputStream is = System.in;	// 표준입력... 기본이 키보드
		InputStreamReader ir = new InputStreamReader(is);
		int data;
		
		while((data= ir.read()) != -1) {
			System.out.print((char)data);
		}
		
		System.out.println((char)data);
		*/
	}

}
