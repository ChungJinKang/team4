package day2;

import java.util.Scanner;

public class Test02 {
	// ��� �ʵ�
	String name = "ȫ�浿";
	int age = 23;
	boolean isStd = false;
	
	public static void main(String[] args) {
		// ���⿡ ����� ������ local variable
		char c = 'A';
		String address = new String("����� --");
		Scanner input = new Scanner(System.in);
		
		//address = input.nextLine();
		
		byte b = 127;
		b = (byte)(b + 1);	// �����Ҷ��� ���� int�� ��ȯ�ȴ�!!!
		
		System.out.println(b);
	}
}
