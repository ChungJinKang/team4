package day2;

public class P130 {
	public static void main(String[] args) {
		// ���� ���� ������(2��°, 3��°�׿� ������ Ÿ���� ������ ���� �ʴ�)
		int score = 50;
		char grade = score >= 90 ? 'A' : (score >= 90 ? 'B' : (score > 50 ? 'C' : 'F'));
		System.out.println(grade);
	}
}
