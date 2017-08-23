package day16;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		Queue<String> pq = new PriorityQueue<>();
		pq.offer("월요일");
		pq.offer("화요일");
		pq.offer("토요일");
		pq.offer("일요일");
		
		// FIFO가아닌 소트된 효과가 나타남
		while(!pq.isEmpty()) {
			String s = pq.poll();
			System.out.println(s);
		}
	}

}
