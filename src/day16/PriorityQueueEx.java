package day16;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		Queue<String> pq = new PriorityQueue<>();
		pq.offer("������");
		pq.offer("ȭ����");
		pq.offer("�����");
		pq.offer("�Ͽ���");
		
		// FIFO���ƴ� ��Ʈ�� ȿ���� ��Ÿ��
		while(!pq.isEmpty()) {
			String s = pq.poll();
			System.out.println(s);
		}
	}

}
