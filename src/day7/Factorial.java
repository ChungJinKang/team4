package day7;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(f(5));
	}
	// recursive method(항상 같은 기능을 해야하니까 static!)
	static int f(int n) {
		if( n == 1 )
			return  1;
		else
			return  n * f(n - 1);
	}
	
}
