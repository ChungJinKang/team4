package day2;

import java.util.Scanner;

public class Test02 {
	// 멤버 필드
	String name = "홍길동";
	int age = 23;
	boolean isStd = false;
	
	public static void main(String[] args) {
		// 여기에 선언된 변수는 local variable
		char c = 'A';
		String address = new String("서울시 --");
		Scanner input = new Scanner(System.in);
		
		//address = input.nextLine();
		
		byte b = 127;
		b = (byte)(b + 1);	// 연산할때는 전부 int로 변환된다!!!
		
		System.out.println(b);
	}
}
