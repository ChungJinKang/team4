package day3;

public class P121 {

	public static void main(String[] args) {
		int num = 100;
		int num2 = 1;
		System.out.println(num > 0 & num2 > 100);	// 논리 연산
		System.out.println();
		System.out.println(3 & 1);	// 비트 연산
		System.out.println(3 | 1);
		
		System.out.printf("%7s%n", Integer.toBinaryString(num));
		System.out.printf("%7s%n",Integer.toBinaryString(num2));
		System.out.printf("%7s%n",Integer.toBinaryString(num & num2));
		System.out.printf("%7s%n",Integer.toBinaryString(num | num2));
		System.out.println();
		
		System.out.printf("%7s%n", Integer.toBinaryString(8));
		System.out.printf("%7s%n", Integer.toBinaryString(8<<1));
		System.out.printf("%7s%n", Integer.toBinaryString(8>>1));
		
		System.out.println(8<<1);
		System.out.println(8>>1);
		
		char ch = '\u0041';	// 아스키 코드로는  65
		System.out.println(ch);
	}

}
