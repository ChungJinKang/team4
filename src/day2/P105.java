package day2;

public class P105 {

	public static void main(String[] args) {
		char c = 66;	// 'B'
		//char c = '3';
		
		int c2 = 66;
		System.out.printf("%c %c%n", c2, 66);
		
		
		// 변수 c의 값이 대문자일 때 true
		//System.out.println(65 <= c && 90 >= c);	// 왼쪽만 확인하고 다음 라인으로!
		//System.out.println(65 <= c & 90 >= c);	// 오른쪽 왼쪽 둘다 확인해야함
		System.out.printf("%c 대문자 여부 %b%n", c, 65 <= c && 90 >= c);
		System.out.printf("%c 숫자 여부 %b%n", c, 48 <= c && 57 >= c);
		
		// 대문자 -> 소문자
		if(65 <= c && 90 >= c) {
			//c += 32;
			// 여기서 연산하면 int형의 결과이므로 char로 casting 해주어야 함
			System.out.printf("대문자 -> 소문자로 변환: %c%n", (char)(c + 32));
		} else if(97 <= c && 122 >= c) {
			System.out.printf("소문자 -> 대문자로 변환: %c%n", (char)(c - 32));
		} else {
			System.out.println("대문자도 소문자도 아닙니다.");
		}
		
	}
}