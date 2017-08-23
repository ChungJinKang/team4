package day3;

public class ChungJin {

	public static void main(String[] args) {
		
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다.
		
		/*
		for(int i = 0; i < sourceString.length(); i++) {
			char tmp = sourceString.charAt(i);
			if(tmp == ' ')
				encodedString += " ";
			else if(tmp >= 'a' && tmp <= 'z') {
				encodedString += (char)((tmp%97 + 3) % 26 + 97);
			} else {
				System.out.println("잘못된 문자열입니다.");
				return;
			}
		}
		*/
		
		for(int i = 0; i < sourceString.length(); i++) {
			char currentC = sourceString.charAt(i);
			char c;
			switch(currentC) {
			case ' ':
				c = ' ';
				break;
			case 'x': case 'y': case 'z':
				c = (char) (currentC-23);
				break;
			default:
				c= (char)(currentC + 3);
			}
			encodedString += c;
		}
		
		
		// 프로그램 구현부 끝.
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);		
	}

}
