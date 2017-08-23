package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mirror2 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input3_¹Ý»ç°æ.txt"));
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		for(int i = 0; i < testcase; i++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					arr[j][k] = sc.nextInt();
				}
			}
			boolean right = true, left = false, up = false, down = false;
			int mirrorCnt = 0;
			int row=0,col=0;
			
			while(true) {
				if(right) {
					while(col < n) {
						if(arr[row][col] == 1) {
							mirrorCnt++;
							row--;
							up = true;
							right = false;
							break;
						} else if(arr[row][col] == 2) {
							mirrorCnt++;
							row++;
							down = true;
							right = false;
							break;
						}
						col++;
					}
				}
				
				if(left) {
					while(col >= 0) {
						if(arr[row][col] == 1) {
							mirrorCnt++;
							row++;
							down = true;
							left = false;
							break;
						} else if(arr[row][col] == 2) {
							mirrorCnt++;
							row--;
							up = true;
							left = false;
							break;
						}
						col--;
					}
				}
				
				if(up) {
					while(row >= 0) {
						if(arr[row][col] == 1) {
							mirrorCnt++;
							col++;
							right = true;
							up = false;
							break;
						} else if(arr[row][col] == 2) {
							mirrorCnt++;
							col--;
							left = true;
							up = false;
							break;
						}
						row--;
					}
				}
				if(down) {
					while(row < n) {
						if(arr[row][col] == 1) {
							mirrorCnt++;
							col--;
							left = true;
							down = false;
							break;
						} else if(arr[row][col] == 2) {
							mirrorCnt++;
							col++;
							right = true;
							down = false;
							break;
						}
						row++;
					}
				}
				
				if(row < 0 || col < 0 || row >= n || col >= n) break;
			}
			System.out.println(mirrorCnt);
		}
		
		
	}

}
