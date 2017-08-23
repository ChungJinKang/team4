package day16;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExpValidCheck {

	public static void main(String[] args) {
		// java ExpValidCheck ((2+3)*1)+3
		// ����� �Ű������� ������ �޴´�. ������ ������ üũ.
		if(args.length != 1) {
			System.out.println("Usage: java ExpValidCheck \"EXPRESSION\"");
			System.out.println("Example: java ExpValidCheck \"((2+3)*1)+3\"");
//			System.out.println("������ �Է��ϼ���.");
			System.exit(0);
		}
		
		System.out.println("����: " + args[0]);
		//((2+3)*1)+3
		Stack<String> st = new Stack<String>();
		
		char[] arr = args[0].toCharArray();	// char �迭�� �ٲ�
		
		try {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == '(') {
					st.push(arr[i]+"");	// char -> String
				} else if(arr[i] == ')') {
					st.pop();
				}
			}
			
			if(!st.isEmpty()) {
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
			} else {
				System.out.println("��ȣ ��ġ");
			}			
		} catch(EmptyStackException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
