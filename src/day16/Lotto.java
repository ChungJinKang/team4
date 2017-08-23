package day16;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		// 1~45������ ���� 6�� �ߺ� ���� ����
		int[] arr = new int[6];
		int cnt = -1;
		
		aa:while(true) {
			int su = (int)(Math.random()*45) + 1;
			// �������� �� ���ں��� üũ
			for(int i = cnt; i > 0; i--) {
				if(arr[i] == su)
					continue aa;
			}
			cnt++;
			if(cnt >= 6)
				break;
			arr[cnt] = su;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
