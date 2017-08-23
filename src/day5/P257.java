package day5;

public class P257 {

	public static void main(String[] args) {
		//MyMath calc = new MyMath();
		double a = 4.7, b = 1.4;
		
		System.out.printf("%.1f + %.1f = %.1f%n", a, b, MyMath.add(a, b));
		System.out.printf("%.1f / %.1f = %.1f%n", a, b, MyMath.divide(a, b));
		System.out.printf("%.1f * %.1f = %.1f%n", a, b, MyMath.multiply(a, b));
		System.out.printf("%.1f - %.1f = %.1f%n", a, b, MyMath.subtract(a, b));
	}

}
