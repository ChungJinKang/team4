package day7;

//Ŭ������ ����� ������ ������ �׷���!!
public class Prob {
	String str;
	
	// Ŭ���� �޼ҵ� (this �� �� ����!) (this�� ������������!)
	// static �޼ҵ�� �޸𸮿� �ö��ִ� �ڿ��� ��밡��
	public static String leftPad(String str, int size, char padChar) {
		/*  ���⿡ ���α׷��� �ϼ��Ͻʽÿ�. */

		String tmp = "";
		
		for(int i = 0; i < (size - str.length()); i++) {
			tmp += padChar;
		}
		tmp += str;
		
		return tmp;
	}
	// �ν��Ͻ� �޼ҵ�
	public String RightPad(int size, char padChar) {
		/*  ���⿡ ���α׷��� �ϼ��Ͻʽÿ�. */
		
		String tmp = str;
		
		for(int i = 0; i < (size - str.length()); i++) {
			tmp += padChar;
		}
		
		return tmp;
	}
}