package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class mirror {
	static int cnt = 0;
	public static void move(int[][] arr, int x, int y, int dir) {	
		System.out.print(arr[x][y]+ " ");
		switch(dir) {
		case 0:	//왼
			while(y - 1 >= 0) {
				y--;
				if(arr[x][y] == 1) {
					cnt++;
					move(arr, x, y, 3);
				} else if(arr[x][y] == 2) {
					cnt++;
					move(arr, x, y, 1);
				}
			}
			break;
		case 1: //위
			while(x - 1 >= 0) {
				x--;
				if(arr[x][y] == 1) {
					cnt++;
					move(arr, x, y, 2);
				} else if(arr[x][y] == 2) {
					cnt++;
					move(arr, x, y, 0);
				}
			}
			break;
		case 2: //오
			while(y + 1 < arr[0].length) {
				y++;
				if(arr[x][y] == 1) {
					cnt++;
					move(arr, x, y, 1);
				} else if(arr[x][y] == 2) {
					cnt++;
					move(arr, x, y, 3);
				}
				
			}
			break;
		case 3: //아
			while(x + 1 < arr[0].length) {
				x++;
				if(arr[x][y] == 1) {
					cnt++;
					move(arr, x, y, 0);
				} else if(arr[x][y] == 2) {
					cnt++;
					move(arr, x, y, 2);
				}
			}
			break;
		}
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input3_반사경.txt"));
		Scanner scanner = new Scanner(System.in);
		
		int testcase = scanner.nextInt();
		
		for(int i = 0; i < testcase; i++) {
			int n = scanner.nextInt();
			int[][] arr = new int[n][n];
			
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					arr[j][k] = scanner.nextInt();
				}
			}
			cnt = 0;
			move(arr, 0, 0, 2);
			System.out.println("cnt: " + cnt);

		}
	}

}
