package day10;

public class Test04 {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 26);
		Person p2 = new Person("홍길동", 26);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1.equals(p2) ? " + p1.equals(p2));
		System.out.println("p2.equals(p1) ? " + p2.equals(p1));
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("s1.equals(s2) ? " + s1.equals(s2));	// String에서 오버라이드 된 애
		
		System.out.println(p1.equals(s1));
		System.out.println("....  " + p1.equals(null));
		System.out.println(s1.equals(p1));
	}

}
