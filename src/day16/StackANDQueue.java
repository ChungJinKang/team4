package day16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackANDQueue {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("월요일");		// 제네릭스로 String명시해줘서 Object가 아닌 String을 매개변수로 받는다.
		st.push("화요일");
		st.push("수요일");
		st.push("목요일");
		st.push("금요일");
		st.push("토요일");
		
		String top = st.peek();	// 맨 위의 값 읽기
		System.out.println("마지막에 위치한 값 읽기: " + top);
		
		System.out.println("=== stack 추출");
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	
		Queue<String> q = new LinkedList<String>();
		q.offer("월요일");		// 제네릭스로 String명시해줘서 Object가 아닌 String을 매개변수로 받는다.
		q.offer("화요일");
		q.offer("수요일");
		q.offer("목요일");
		q.offer("금요일");
		q.offer("토요일");
		
		top = q.peek();	// 맨 위의 값 읽기
		System.out.println("마지막에 위치한 값 읽기: " + top);
		
		System.out.println("=== queue 추출");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}

	
}
