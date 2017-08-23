package day6;

public class Prob1 {

	public static void main(String[] args) {
		Prob1 prob1 = new Prob1();
		
		System.out.println( prob1.leftPad("SDS", 6, '#') );
		System.out.println( prob1.leftPad("SDS", 5, '$') ); 
		System.out.println( prob1.leftPad("SDS", 2, '&') ); 
	}
	
	public String leftPad(String str, int size, char padChar) {
		/*  여기에 프로그램을 완성하십시오. */

		String tmp = "";
		
		for(int i = 0; i < (size - str.length()); i++) {
			tmp += padChar;
		}
		tmp += str;
		
		return tmp;
	}
}
