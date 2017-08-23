package day12.inner;

import day12.inner.Button.Event;

public class Test05 {

	public static void main(String[] args) {
		Button.Event a = new Event() {
			@Override
			public void onClick() {
				System.out.println("버튼 클릭시 이벤트 핸들링");
			}
		};
		a.onClick();
		
	}

}
