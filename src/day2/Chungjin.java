package day2;

public class Chungjin {

	public static void main(String[] args) {
		int num = - 90;
		System.out.println(num > 0 ? "���" : (num == 0 ? "0" : "����"));
		
		char ch = 'P';
		char lowerCase = (ch >= 65 && ch <= 90) ? (char)(ch + 32) : ch;
		
		System.out.print("ch:" + ch);
		System.out.println(" to lowerCase :" + lowerCase);
		
		double db = (num < 0) ? 1.0 : 1;
		//char c = (ch + 1);	// �׳� ���ڸ� ���ų� ���ڳ��� ���ϸ� �����ڵ�� �����ؼ� �� ������
								// char ������ int�� �������� ���ϸ� �����ڵ尡 �ƴ� int�� ����
								// ���� casting���־�� ��
		
	}
}
