package day7.ex1;

import util.Time;

public class Book {

	public static void main(String[] args) {
		// 시간 관리 시 분 초 정보
		Time t = new Time();
		
		t.setHour(9);
		t.setMin(30);
		t.print();
	}

}