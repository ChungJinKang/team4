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
		// 순수하게 file정보만 알고 싶을때 File 쓴다.
		File f= new File("input4.txt");
		// file 존재 유무
		System.out.println(f.exists());
		// file의 사이즈, 바이트 단위로 나옴
		System.out.println(f.length());
		// 마지막으로 수정한 날짜, long 단위로 나옴
		System.out.println(f.lastModified());
		Date d = new Date(f.lastModified());
		System.out.println(d);
		// 쓸 수 있는지?
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
			
			// 배열에 데이터 입력
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {	
					//next()는 한 단어씩 읽는대
					arr[i][j] = sc.next().charAt(0);
					// 현재 위치 큐에 넣기
					if(arr[i][j] == 'G') {
						q.offer(new Position(i,j));
					}
				}
			}
			////////// 로직 구현 ///////////
			AnswerN = 0;
			while(!q.isEmpty()) {
				Position p = q.poll();
				// 왼쪽,  x는 고정, y 감소
				for(int i = p.y - 1; i >= 0; i--) {
					if(arr[p.x][i] == 'T') {
						arr[p.x][i] = 'W';
						AnswerN++;
						break;
					} else if(arr[p.x][i] != '0')
						break;
				}
				
				// 위
				for(int i = p.x - 1; i >= 0; i--) {
					if(arr[i][p.y] == 'T') {
						arr[i][p.y] = 'W';
						AnswerN++;
						break;
					} else if(arr[i][p.y] != '0')
						break;
				}
				
				// 오른쪽
				for(int i = p.y + 1; i < col; i++) {
					if(arr[p.x][i] == 'T') {
						arr[p.x][i] = 'W';
						AnswerN++;
						break;
					} else if(arr[p.x][i] != '0')
						break;
				}
				
				// 아래
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
