package day4;

import java.util.Arrays;

public class P205 {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		
		//String[] names = new String[10];
		String[] names = {"ȫ�浿", "��浿", "��浿", "�ű浿"};
		//System.out.println(names);
		System.out.println(Arrays.toString(names));
		System.out.println(names.length);
		System.out.println(names[0].length());	// �ּҰ� ���µ� ��Ʈ �����ڸ� �� ��� �߻��ϴ� ����!

		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i].charAt(0) + "��");
		}
		
		// ������, ���� �˱�
		String msg = "hello java test ~~~";	// ���������δ� char Ÿ������ ������
		char[] m = {'h', 'e', 'l', 'l', 'o'};	// m[index]. �̷��� ��� �ȴ� (primitive�� ����!)
		
		char[] n = msg.toCharArray();
		System.out.println(n);
		System.out.println(Arrays.toString(n));
	}

}
