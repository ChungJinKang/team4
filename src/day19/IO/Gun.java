package day19.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Position {
	int x;
	int y;
	
	public Position(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "position [x=" + x + ", y=" + y + "]";
	}
}

public class Gun {
    static int AnswerN;
	public static void main(String[] args) throws FileNotFoundException {
		// �����ϰ� file������ �˰� ������ File ����.
		File f= new File("input4.txt");
		// file ���� ����
		System.out.println(f.exists());
		// file�� ������, ����Ʈ ������ ����
		System.out.println(f.length());
		// ���������� ������ ��¥, long ������ ����
		System.out.println(f.lastModified());
		Date d = new Date(f.lastModified());
		System.out.println(d);
		// �� �� �ִ���?
		System.out.println(f.canWrite());
		
		
		System.setIn(new FileInputStream("input4.txt"));
		
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		//ArrayList<Position> list = new ArrayList<>();
		Queue<Position> q = new LinkedList<>();
		
		for(int k=0; k<testCase; k++) {
			int row = sc.nextInt();
			int col = sc.nextInt();
			char[][] arr = new char[row][col];
			
			// �迭�� ������ �Է�
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {	
					//next()�� �� �ܾ �д´�
					arr[i][j] = sc.next().charAt(0);
					// ���� ��ġ ť�� �ֱ�
					if(arr[i][j] == 'G') {
						q.offer(new Position(i,j));
					}
				}
			}
			////////// ���� ���� ///////////
			AnswerN = 0;
			while(!q.isEmpty()) {
				Position p = q.poll();
				// ����,  x�� ����, y ����
				for(int i = p.y - 1; i >= 0; i--) {
					if(arr[p.x][i] == 'T') {
						arr[p.x][i] = 'W';
						AnswerN++;
						break;
					} else if(arr[p.x][i] != '0')
						break;
				}
				
				// ��
				for(int i = p.x - 1; i >= 0; i--) {
					if(arr[i][p.y] == 'T') {
						arr[i][p.y] = 'W';
						AnswerN++;
						break;
					} else if(arr[i][p.y] != '0')
						break;
				}
				
				// ������
				for(int i = p.y + 1; i < col; i++) {
					if(arr[p.x][i] == 'T') {
						arr[p.x][i] = 'W';
						AnswerN++;
						break;
					} else if(arr[p.x][i] != '0')
						break;
				}
				
				// �Ʒ�
				for(int i = p.x + 1; i < row; i++) {
					if(arr[i][p.y] == 'T') {
						arr[i][p.y] = 'W';
						AnswerN++;
						break;
					} else if(arr[i][p.y] != '0')
						break;
				}
			}
			
			System.out.println("#" + k + ":" + AnswerN);
		}
	}	
}
