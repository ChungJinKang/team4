package day3;

public class P121 {

	public static void main(String[] args) {
		int num = 100;
		int num2 = 1;
		System.out.println(num > 0 & num2 > 100);	// �� ����
		System.out.println();
		System.out.println(3 & 1);	// ��Ʈ ����
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
		
		char ch = '\u0041';	// �ƽ�Ű �ڵ�δ�  65
		System.out.println(ch);
	}

}
