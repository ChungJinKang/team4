package day2;

public class P105 {

	public static void main(String[] args) {
		char c = 66;	// 'B'
		//char c = '3';
		
		int c2 = 66;
		System.out.printf("%c %c%n", c2, 66);
		
		
		// ���� c�� ���� �빮���� �� true
		//System.out.println(65 <= c && 90 >= c);	// ���ʸ� Ȯ���ϰ� ���� ��������!
		//System.out.println(65 <= c & 90 >= c);	// ������ ���� �Ѵ� Ȯ���ؾ���
		System.out.printf("%c �빮�� ���� %b%n", c, 65 <= c && 90 >= c);
		System.out.printf("%c ���� ���� %b%n", c, 48 <= c && 57 >= c);
		
		// �빮�� -> �ҹ���
		if(65 <= c && 90 >= c) {
			//c += 32;
			// ���⼭ �����ϸ� int���� ����̹Ƿ� char�� casting ���־�� ��
			System.out.printf("�빮�� -> �ҹ��ڷ� ��ȯ: %c%n", (char)(c + 32));
		} else if(97 <= c && 122 >= c) {
			System.out.printf("�ҹ��� -> �빮�ڷ� ��ȯ: %c%n", (char)(c - 32));
		} else {
			System.out.println("�빮�ڵ� �ҹ��ڵ� �ƴմϴ�.");
		}
		
	}
}