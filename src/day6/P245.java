package day6;

import util.Time;

public class P245 {

	public static void main(String[] args) {
		System.out.println(Time.lang);
		System.out.println(new Time().getHour());
		
		// 시간 관리 시 분 초 정보
		Time t = new Time();
		t.setHour(6);
		t.setMin(10);
		t.print();			//System.out.printf("%d시 %d분 %d초 %n", t.hour, t.min, t.sec);
		
		Time t2 = new Time();
		t2.setHour(14);
		t2.setHour(30);
		t2.print();
		
	}

}