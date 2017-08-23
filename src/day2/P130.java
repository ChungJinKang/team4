package day2;

public class P130 {
	public static void main(String[] args) {
		// 조건 삼항 연산자(2번째, 3번째항에 데이터 타입이 정해져 있지 않다)
		int score = 50;
		char grade = score >= 90 ? 'A' : (score >= 90 ? 'B' : (score > 50 ? 'C' : 'F'));
		System.out.println(grade);
	}
}
