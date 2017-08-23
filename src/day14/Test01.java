package day14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.lang.Math.PI;	// static import

public class Test01 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		Date d2 = new Date(2017, 7, 20);
		System.out.println(d2);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 M월 d일");
		System.out.println(sf.format(d));
		
		String s;
		Calendar c = Calendar.getInstance();	// abstract class이므로 new로 객체생성 안됨
		c.set(2017, 7, 20);
		System.out.println(c);
		//System.out.println(sf.format(c));	// Date 객체만 파라미터로~
		System.out.printf("%tY년 %tm월 %te일%n", c, c, c);	// 직접 포멧기호써서 출력
		System.out.printf("%1$tY년 %1$tm월 %1$te일%n", c);	// 1$써서 c는 한번만 쓸 수 있게 됨
		System.out.printf("%s는 %s 입니다.%n", "홍길동", 100);
		System.out.printf("%1$s은(/는) %1$s 입니다.%n", "홍길동");
		
		String msg = String.format("%1$s은(/는) %1$s 입니다.", "홍길동");	// 다시 스트링으로 만들 수 있음
		String msg2 = String.format("%1$tY년 %1$tm월 %1$te일", c);	// 다시 스트링으로 만들 수 있음
		System.out.println(msg);
		System.out.println(msg2);
		
		System.out.println(Math.PI);
		//static import 해놨기 때문에 PI만 써도 됨
		System.out.println(PI);
		
		String msg3 = String.format("%5.2f%n", PI);
		System.out.println(msg3);
		
	}

}
