package day13;

public class P473 {

	public static void main(String[] args) {
		String data = "ȫ�浿 100 90 89 99 77";
		data = data.replace(' ', '/');
		// ������ �����ڷ� �ؼ� �ɰ��� �迭�� ����
		String[] datas = data.split("/");
		//System.out.println(datas[2]);
		int sum = 0;
		for(int i = 1; i < datas.length; i++) {
			sum += Integer.parseInt(datas[i]);
		}
		int count = (datas.length-1);
		System.out.printf("%s [����=%d, �����=%d, ���=%.2f]%n", datas[0], sum, count, (double)sum / count);
	}

}
