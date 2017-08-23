package day2;

public class P102 {
	public static void main(String[] args) {
		int i;
		
		char a = 'a';
		for(i = 0; i < 26; i++, a++)
			System.out.printf("%c => %d %n", a, (int)a);
		
		char A = 'A';
		for(i = 0; i < 26; i++, A++)
			System.out.printf("%c => %d %n", A, (int)A);
		
		System.out.printf("%c", 65);
		
		// 대소문자 변환은 +- 32 하면 됨
	}

}
