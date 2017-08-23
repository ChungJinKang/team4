package day23;

import java.util.Scanner;
import java.util.Stack;

public class Test01_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testcase = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < testcase; i++) {
			int su = Integer.parseInt(sc.nextLine());
			Stack<Integer> list = new Stack<>();
			// ArrayList써서 reverse로 출력하는 방법도~
			
			int mok = su;
			int na = 0;
			
			while(mok > 0) {
				na = mok % 9;
				mok /= 9;
				list.push(na);
			}		
			
			while(!list.isEmpty()){
				System.out.print(list.pop());
			} System.out.println();
			
		}
		
	}

}
