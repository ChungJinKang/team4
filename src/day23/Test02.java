package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input_�ȳ�.txt"));
		Scanner sc = new Scanner(System.in);
		
		int testcase = Integer.parseInt(sc.nextLine());
		char[] arr = {'h','e','l','l','o'};
		for(int i = 0; i < testcase; i++) {
			String str = sc.nextLine();
			// char �迭�� ��ȯ
			char[] strArr = new char[str.length()];
			for(int j = 0; j < str.length(); j++) {
				strArr[j] = str.charAt(j);
			}
			
			int idx = 0;	// hello��� ���ڰ� �� �������� Ȯ���ϱ� ���� �ε���
			int cnt = 0;	// ���� ���� ��

			for(int j = 0; j < str.length(); j++) {
				if(arr[idx] == strArr[j]) {
					strArr[j] = 'z';	// �ǹ̾��� ���ڷ� ��ȯ
					idx++;
					j = -1;		// �ٽ� ���� ó�� ���� �����ؼ� ���� ����
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
