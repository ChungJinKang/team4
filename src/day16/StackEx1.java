package day16;

import java.util.Stack;

public class StackEx1 {
	public static Stack<String> back = new Stack<String>();
	public static Stack<String> forward = new Stack<String>();

	public static void main(String[] args) {
		goURL("1.���̹�1");
		goURL("2.���̹�2");
		goURL("3.���̹�3");
		goURL("4.���̹�4");
		print();
		
		goBack();
		print();

		goBack();
		print();
		
		goForward();
		print();

		goURL("��������Ʈ");
		print();
	}
	
	public static void goURL(String url) {
		back.push(url);
		
		// forward�� ������� ������ Ŭ���� (������ �� ���� ���� ��Ȳ�̴ϱ�)
		if(!forward.isEmpty())
			forward.clear();		
	}
	public static void goBack() {
		if(!back.isEmpty()) {
			forward.push(back.pop());	// pop�ϰ� �� �κ��� ������ ���� �� �� �ֵ��� forward�� �־��			
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
