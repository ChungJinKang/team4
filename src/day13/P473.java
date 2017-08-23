package day13;

public class P473 {

	public static void main(String[] args) {
		String data = "홍길동 100 90 89 99 77";
		data = data.replace(' ', '/');
		// 공백을 구분자로 해서 쪼개서 배열로 저장
		String[] datas = data.split("/");
		//System.out.println(datas[2]);
		int sum = 0;
		for(int i = 1; i < datas.length; i++) {
			sum += Integer.parseInt(datas[i]);
		}
		int count = (datas.length-1);
		System.out.printf("%s [총점=%d, 과목수=%d, 평균=%.2f]%n", datas[0], sum, count, (double)sum / count);
	}

}
