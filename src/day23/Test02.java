package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input_안녕.txt"));
		Scanner sc = new Scanner(System.in);
		
		int testcase = Integer.parseInt(sc.nextLine());
		char[] arr = {'h','e','l','l','o'};
		for(int i = 0; i < testcase; i++) {
			String str = sc.nextLine();
			// char 배열로 변환
			char[] strArr = new char[str.length()];
			for(int j = 0; j < str.length(); j++) {
				strArr[j] = str.charAt(j);
			}
			
			int idx = 0;	// hello라는 문자가 다 뽑히는지 확인하기 위한 인덱스
			int cnt = 0;	// 뽑힌 문자 수

			for(int j = 0; j < str.length(); j++) {
				if(arr[idx] == strArr[j]) {
					strArr[j] = 'z';	// 의미없는 문자로 변환
					idx++;
					j = -1;		// 다시 포문 처음 부터 시작해서 문자 점검
				}
				if(idx == 5) {
					idx = 0;
					cnt++;
				}
			}
			System.out.println("Case#" + i + " " + cnt);
		}
		
	}

}
