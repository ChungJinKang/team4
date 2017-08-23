package day4;

import java.util.Arrays;

public class P205 {

	public static void main(String[] args) {
		String name = "홍길동";
		
		//String[] names = new String[10];
		String[] names = {"홍길동", "백길동", "고길동", "신길동"};
		//System.out.println(names);
		System.out.println(Arrays.toString(names));
		System.out.println(names.length);
		System.out.println(names[0].length());	// 주소가 없는데 도트 연산자를 쓸 경우 발생하는 예외!

		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i].charAt(0) + "씨");
		}
		
		// 공통점, 차이 알기
		String msg = "hello java test ~~~";	// 내부적으로는 char 타입으로 관리됨
		char[] m = {'h', 'e', 'l', 'l', 'o'};	// m[index]. 이렇게 사용 안댐 (primitive한 변수!)
		
		char[] n = msg.toCharArray();
		System.out.println(n);
		System.out.println(Arrays.toString(n));
	}

}
