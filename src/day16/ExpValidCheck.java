package day16;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExpValidCheck {

	public static void main(String[] args) {
		// java ExpValidCheck ((2+3)*1)+3
		// 명령형 매개변수로 수식을 받는다. 수식이 옳은지 체크.
		if(args.length != 1) {
			System.out.println("Usage: java ExpValidCheck \"EXPRESSION\"");
			System.out.println("Example: java ExpValidCheck \"((2+3)*1)+3\"");
//			System.out.println("수식을 입력하세요.");
			System.exit(0);
		}
		
		System.out.println("수식: " + args[0]);
		//((2+3)*1)+3
		Stack<String> st = new Stack<String>();
		
		char[] arr = args[0].toCharArray();	// char 배열로 바꿈
		
		try {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == '(') {
					st.push(arr[i]+"");	// char -> String
				} else if(arr[i] == ')') {
					st.pop();
				}
			}
			
			if(!st.isEmpty()) {
				System.out.println("괄호가 일치하지 않습니다.");
			} else {
				System.out.println("괄호 일치");
			}			
		} catch(EmptyStackException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
