package day5;

public class MyMath {

	public static double add(double d1, double d2) {
		return d1 + d2;
	}
	public static int subtract(int d1, int d2) {
		return d1 - d2;
	}
	public static double subtract(double d1, double d2) {
		return d1 - d2;
	}
	public static double divide(double d1, double d2) {
		return d1 / d2;
	}
	public static double multiply(double d1, double d2) {
		return d1 * d2;
	}
	
	public static void main(String[] args) {
		P257.main(null);	// 같은 패키지내 이므로 static한 자원들은 메모리에 같이 올라간다.
							// 따라서 (클래스이름).main() 으로 실행 가능
	}
}
