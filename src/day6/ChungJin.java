package day6;

public class ChungJin {

	public static void main(String[] args) {
		Prob prob = new Prob();
		
		System.out.println( prob.leftPad("SDS", 6, '#') );
		System.out.println( prob.leftPad("SDS", 5, '$') ); 
		System.out.println( prob.leftPad("SDS", 2, '&') ); 
		
		System.out.println();
		
		System.out.println( prob.RightPad("SDS", 6, '#') );
		System.out.println( prob.RightPad("SDS", 5, '$') ); 
		System.out.println( prob.RightPad("SDS", 2, '&') ); 
	}
	


}

// Ŭ������ ����� ������ ������ �׷���!!
class Prob {
	// �ν��Ͻ� �޼ҵ�
	public String leftPad(String str, int size, char padChar) {
		/*  ���⿡ ���α׷��� �ϼ��Ͻʽÿ�. */

		String tmp = "";
		
		for(int i = 0; i < (size - str.length()); i++) {
			tmp += padChar;
		}
		tmp += str;
		
		return tmp;
	}	
	public String RightPad(String str, int size, char padChar) {
		/*  ���⿡ ���α׷��� �ϼ��Ͻʽÿ�. */
		
		String tmp = str;
		
		for(int i = 0; i < (size - str.length()); i++) {
			tmp += padChar;
		}
		
		return tmp;
	}	
	
	
}