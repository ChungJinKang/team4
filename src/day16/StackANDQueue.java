package day16;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackANDQueue {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("������");		// ���׸����� String������༭ Object�� �ƴ� String�� �Ű������� �޴´�.
		st.push("ȭ����");
		st.push("������");
		st.push("�����");
		st.push("�ݿ���");
		st.push("�����");
		
		String top = st.peek();	// �� ���� �� �б�
		System.out.println("�������� ��ġ�� �� �б�: " + top);
		
		System.out.println("=== stack ����");
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	
		Queue<String> q = new LinkedList<String>();
		q.offer("������");		// ���׸����� String������༭ Object�� �ƴ� String�� �Ű������� �޴´�.
		q.offer("ȭ����");
		q.offer("������");
		q.offer("�����");
		q.offer("�ݿ���");
		q.offer("�����");
		
		top = q.peek();	// �� ���� �� �б�
		System.out.println("�������� ��ġ�� �� �б�: " + top);
		
		System.out.println("=== queue ����");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}

	
}
