package day7;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(f(5));
	}
	// recursive method(�׻� ���� ����� �ؾ��ϴϱ� static!)
	static int f(int n) {
		if( n == 1 )
			return  1;
		else
			return  n * f(n - 1);
	}
	
}
