package day7;

//클래스는 비슷한 성격의 내용을 그룹핑!!
public class Prob {
	String str;
	
	// 클래스 메소드 (this 쓸 수 없음!) (this는 힙영역에서만!)
	// static 메소드는 메모리에 올라가있는 자원만 사용가능
	public static String leftPad(String str, int size, char padChar) {
		/*  여기에 프로그램을 완성하십시오. */

		String tmp = "";
		
		for(int i = 0; i < (size - str.length()); i++) {
			tmp += padChar;
		}
		tmp += str;
		
		return tmp;
	}
	// 인스턴스 메소드
	public String RightPad(int size, char padChar) {
		/*  여기에 프로그램을 완성하십시오. */
		
		String tmp = str;
		
		for(int i = 0; i < (size - str.length()); i++) {
			tmp += padChar;
		}
		
		return tmp;
	}
}