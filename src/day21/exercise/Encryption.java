package day21.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Encryption {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input_암호화.txt"));
		Scanner sc = new Scanner(System.in);
		
		int testcase = Integer.parseInt(sc.nextLine());
		int k = 0;
		int c = 0;

		Stack<String> st = new Stack<String>();

		for(int k1 = 0; k1 < testcase; k1++) {
			String str = sc.nextLine();

			while(str.length() > 8) {
				String tmp = str.substring(str.length()-8, str.length());
				str = str.substring(0, str.length()-8);
				st.push(tmp);
			}
			
			if(str.length() > 0) {
				k = Integer.parseInt(str, 2);
			}
			
			
			System.out.print("#"+k1 + " ");
			while(!st.isEmpty()) {
				c = Integer.parseInt(st.pop(), 2);
				//System.out.println(c - k);
				
				// 문자 출력 로직
				char ch = (char)(c-k+65);
				System.out.print(ch);
			} System.out.println();
			
		}
		
	}
	
	
}
