package day3;

public class ChungJin {

	public static void main(String[] args) {
		
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		
		// ���α׷��� ������ ����.	
		// ���� : ���� 'a'�� �������� 97�̸�, 'z'�� 122�Դϴ�.
		
		/*
		for(int i = 0; i < sourceString.length(); i++) {
			char tmp = sourceString.charAt(i);
			if(tmp == ' ')
				encodedString += " ";
			else if(tmp >= 'a' && tmp <= 'z') {
				encodedString += (char)((tmp%97 + 3) % 26 + 97);
			} else {
				System.out.println("�߸��� ���ڿ��Դϴ�.");
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
		
		
		// ���α׷� ������ ��.
		
		System.out.println("��ȣȭ�� ���ڿ� : " + sourceString);
		System.out.println("��ȣȭ�� ���ڿ� : " + encodedString);		
	}

}
