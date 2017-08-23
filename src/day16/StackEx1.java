package day16;

import java.util.Stack;

public class StackEx1 {
	public static Stack<String> back = new Stack<String>();
	public static Stack<String> forward = new Stack<String>();

	public static void main(String[] args) {
		goURL("1.네이버1");
		goURL("2.네이버2");
		goURL("3.네이버3");
		goURL("4.네이버4");
		print();
		
		goBack();
		print();

		goBack();
		print();
		
		goForward();
		print();

		goURL("다음사이트");
		print();
	}
	
	public static void goURL(String url) {
		back.push(url);
		
		// forward가 비어있지 않으면 클리어 (앞으로 갈 수가 없는 상황이니까)
		if(!forward.isEmpty())
			forward.clear();		
	}
	public static void goBack() {
		if(!back.isEmpty()) {
			forward.push(back.pop());	// pop하고 그 부분을 앞으로 가기 할 수 있도록 forward에 넣어둠			
		}
	}
	public static void goForward() {
		if(!forward.isEmpty())
			back.push(forward.pop());
	}
	
	public static void print() {
		System.out.println("back: " + back);
		System.out.println("forward: " + forward);
	}
	
}
