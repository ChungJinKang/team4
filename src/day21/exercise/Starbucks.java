package day21.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Starbucks {

	public static void main(String[] args) throws FileNotFoundException {
		int testcase = 0;
		int n, m, k;
		
		System.setIn(new FileInputStream("��Ÿ���� �Է�.txt"));
		Scanner sc = new Scanner(System.in);
		
		testcase = sc.nextInt();
		
		for(int idx = 0; idx < testcase; idx++) {
			n = sc.nextInt();
			m = sc.nextInt();
			k = sc.nextInt();

//			ArrayList<Integer> plist = new ArrayList();
//			int c_i = 0;
//			// i��° ����� �����ϴ� Ŀ�� ����
//			for(int i = 0; i < n; i++) {
//				c_i = sc.nextInt();
//				plist.add(c_i);
//			}
//			
//			ArrayList<Integer> clist = new ArrayList();
//			int p_i = 0;
//			// ������ ���� ����
//			for(int j = 0; j < m; j++) {
//				p_i = sc.nextInt();
//				clist.add(p_i);
//			}
//			
			int total = 0;
//			// ����
//			for(int i = 0; i < plist.size(); i++) {
//				total += clist.get(plist.get(i)-1);
//			}
			
			// �迭�� �����ϰ� �ϴ� ���
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
