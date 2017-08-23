package day1;

public class Chungjin {

	public static void main(String[] args) {
		int tom = -1;
		char marry = '9';
		int tmp = marry;
		boolean john = false;
		String sarah = "Sarah Jang";

		System.out.println( "our friends.. \n" 
			    + tom + ", " + marry + ", " + john + " and " + sarah);
		System.out.printf("%c, %s %n", 'A', "ȫ�浿");
		System.out.printf("%c, %s %n", marry, sarah);
		System.out.printf("john %b %n", john);
		System.out.printf("john %s %n", john);
		
		int num = 100;
		
		System.out.printf("num = %d %n", num);
		System.out.printf("num = %6d %n", num);
		System.out.printf("num = %06d %n", num);
		double pi = 3.14;
		System.out.printf("pi = %f %n", pi);
		System.out.printf("pi = %010.3f %n", pi);
		System.out.printf("john = %b, num = %d, pi = %f %n", john, num, pi);
	}
	
}
