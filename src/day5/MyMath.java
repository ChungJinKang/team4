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
		P257.main(null);	// ���� ��Ű���� �̹Ƿ� static�� �ڿ����� �޸𸮿� ���� �ö󰣴�.
							// ���� (Ŭ�����̸�).main() ���� ���� ����
	}
}
