package day3;

public class P112 {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1 == s2);
		
		String s3 = "Hello";
		String s4 = "Hello";
		System.out.println(s3 == s4);
		
		System.out.println("=============");
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s3));
	}

}
