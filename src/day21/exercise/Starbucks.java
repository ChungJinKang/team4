package day21.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Starbucks {

	public static void main(String[] args) throws FileNotFoundException {
		int testcase = 0;
		int n, m, k;
		
		System.setIn(new FileInputStream("스타벅스 입력.txt"));
		Scanner sc = new Scanner(System.in);
		
		testcase = sc.nextInt();
		
		for(int idx = 0; idx < testcase; idx++) {
			n = sc.nextInt();
			m = sc.nextInt();
			k = sc.nextInt();

//			ArrayList<Integer> plist = new ArrayList();
//			int c_i = 0;
//			// i번째 사람이 좋아하는 커피 종류
//			for(int i = 0; i < n; i++) {
//				c_i = sc.nextInt();
//				plist.add(c_i);
//			}
//			
//			ArrayList<Integer> clist = new ArrayList();
//			int p_i = 0;
//			// 종류에 따른 가격
//			for(int j = 0; j < m; j++) {
//				p_i = sc.nextInt();
//				clist.add(p_i);
//			}
//			
			int total = 0;
//			// 로직
//			for(int i = 0; i < plist.size(); i++) {
//				total += clist.get(plist.get(i)-1);
//			}
			
			// 배열로 간단하게 하는 방법
			int[] order = new int[m];
			for(int i = 0; i < n; i++) {
				order[sc.nextInt() - 1]++;
			}
			for(int i = 0; i < m; i++) {
				total += order[i]*(sc.nextInt());
			}
			
			
			char ans;
			if(total > k)
				ans = 'N';
			else
				ans = 'Y';
			
			System.out.println("Case#" + idx + " " + ans);
		}
		
	}

}
