package day2;

public class P87 {
	public static void main(String[] args) {
		int x = 5;
		int result;
		
		result = 4 * x + 3;
		System.out.println(result + " " + (4 * x + 3));
		System.out.printf("%d %d %n", result, 4 * x + 3);
		
		int i = 5, j =5;
		System.out.println(i++);
		System.out.println(++j);
		System.out.printf("%d %d%n", i, j);
		
		System.out.println(5 + 5.5);
		System.out.println(1/2);	// int 형태의 결과이므로 답은 0
		System.out.println(1/2.0);	// double로 형변환
		
		System.out.println(9%2);
		System.out.println(9/2);
	}
}
