package day2;

public class P117 {

	public static void main(String[] args) {
		int i = 9, j = 9;
		System.out.println(i == j);
		
		// �ٸ� ��ü���� �Ǻ��غ���
		String s1 = new String("hello");
		String s2 = new String("hello");
		String s3 = "hello";
		String s4 = "hello";
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
		
		// ��ü ��
		System.out.printf("%s %s%n", s1.equals(s2), s2.equals(s1));
		// s1 ���ڿ� �ε����� ���� ����, s1 ���ڿ� ����
		System.out.printf("%c %d%n", s1.charAt(1), s1.length());
		
		System.out.printf("%c%n", s1.charAt(s1.length() - 1));
	}

}
