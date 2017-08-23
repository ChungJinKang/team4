package day16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {
	static Queue<String> q = new LinkedList<>();
	
	public static void main(String[] args) {
		// Ű���� �Է�(����� �Ű����� ����~)
		// System.in�� 1����Ʈ�� ���� -> �ѱ��� ������
		// System.in�� ǥ�� �Է�(��jƮ�� Ű����� �Ǿ��ִ�)
		// ���� �̰� �����ִ°� scanner��
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("�Է��ϼ���: ");
			String input = scanner.nextLine().trim();	// ������ ������ ©���
			if("".equals(input)) 	// �ݺ��� ���� �ٷ� ���ư��� ���� ����, null�� . ���ﵵ��!!
				continue;	
			
			if(input.equalsIgnoreCase("q"))	 {// ��ҹ��� �������!!
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
