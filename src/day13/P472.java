package day13;

public class P472 {

	public static void main(String[] args) {
		String data = "ȫ�浿 100 90 89";
		String name = data.substring(0, 4);
		System.out.println(name);
		System.out.println(data.indexOf(' '));
		
		// substring������ ���ϴ� ���� ����(������ �����ڷ� �Ѵ�)
		String j = data.substring(data.indexOf(' ')).trim();
		System.out.println(j);
		System.out.println(j.substring(0, j.indexOf(' ')));
		System.out.println(j.substring(j.indexOf(' '), j.lastIndexOf(' ')).trim());
		System.out.println(j.substring(j.lastIndexOf(' ')).trim());
		
		
	}

}
