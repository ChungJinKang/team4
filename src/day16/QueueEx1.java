package day16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {
	static Queue<String> q = new LinkedList<>();
	
	public static void main(String[] args) {
		// 키보드 입력(명령형 매개변수 말공~)
		// System.in은 1바이트씩 읽음 -> 한글을 못읽음
		// System.in은 표준 입력(디퐅트가 키보드로 되어있당)
		// 따라서 이걸 도와주는게 scanner래
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력하세요: ");
			String input = scanner.nextLine().trim();	// 공백이 있으면 짤라라
			if("".equals(input)) 	// 반복문 시작 줄로 돌아가서 다음 진행, null에 . 안찍도록!!
				continue;	
			
			if(input.equalsIgnoreCase("q"))	 {// 대소문자 상관없이!!
				scanner.close();
				break;
			}
			
			if(input.equals("history")) {
				while(!q.isEmpty()) {
					String s = q.poll();
					System.out.println(s);
				}
				continue;
			}
			save(input);
		}
	}
	
	public static void save(String input) {
		q.offer(input);
	}

}
