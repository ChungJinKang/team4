package day2;

public class Chungjin {

	public static void main(String[] args) {
		int num = - 90;
		System.out.println(num > 0 ? "양수" : (num == 0 ? "0" : "음수"));
		
		char ch = 'P';
		char lowerCase = (ch >= 65 && ch <= 90) ? (char)(ch + 32) : ch;
		
		System.out.print("ch:" + ch);
		System.out.println(" to lowerCase :" + lowerCase);
		
		double db = (num < 0) ? 1.0 : 1;
		//char c = (ch + 1);	// 그냥 숫자만 쓰거나 숫자끼리 더하면 유니코드로 생각해서 잘 되지만
								// char 변수와 int형 정수끼리 더하면 유니코드가 아닌 int로 여김
								// 따라서 casting해주어야 함
		
	}
}
