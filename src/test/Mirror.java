package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mirror {
	static int cnt = 0;
	// ���� ������ ��, map�� ���� ��, �ش� ����� ���� ���� ����
	static int[][] arr2 = new int[][] {{0, 3, 1}, {1, 2, 0}, {2, 1, 3}, {3, 0, 2}};
	// ��������� ��, 0�� ��:x, 1�� ��:y
	// �ش� ����� ���� x������  or y ������
	static int[][] arr3 = new int[][] { {0,-1}, {-1,0}, {0,1}, {1,0} };
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input3_�ݻ��.txt"));
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
			System.out.println("#" + i + ": " + cnt);

		}
	}
	
	public static void move(int[][] map, int x, int y, int dir) {
		if(x < 0 || x >= map[0].length)
			return;
		if(y < 0 || y >= map[0].length)
			return;
		
		switch(map[x][y]) {
		case 0:
			// ���� ���� ��� �̵�				
			move(map, x+arr3[dir][0], y+arr3[dir][1], dir);
			break;
		case 1:
			dir = arr2[dir][1];
			// ���� ��� �̵�
			move(map, x+arr3[dir][0], y+arr3[dir][1], dir);
			cnt++;
			break;
		case 2:
			dir = arr2[dir][2];
			// ���� ��� �̵�
			move(map, x+arr3[dir][0], y+arr3[dir][1], dir);
			cnt++;
			break;
		}
		
	}
}