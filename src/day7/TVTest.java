package day7;

// TV 객체 초기화 값 (black 9 false)

public class TVTest {

	public static void main(String[] args) {
		/*
		TV tv = new TV("black", 300, true);
		//tv.setChannel(300);
		//tv.setPower(true);
		tv.print();
		
		TV tv2 = new TV("gray", 9, false);
		//tv2.channel = 999;	// channel이 적절한 겂을 갖도록 해주려면 조건 걸어서 해주면 됨
		//tv2.setChannel(9);
		//tv2.setPower(true);
		//tv2.power = true;
		tv2.print();
		
		TV tv3 = new TV("red");
		tv3.print();
		
		TV tv4 = new TV(tv2);
		tv4.print();
		
		TV t = null;
		TV t5 = new TV(t);	// null pointer exception 발생!
		t5.print();
		
		*/
		
		TV[] tvs = {
				new TV(),
				new TV("black", 9, false),
				new TV("red", 11, true),
				new TV("black", 9, true),
				new TV("gray", 9, false),
				new TV("gray", 11, true)
		};

		for(int i = 0; i < tvs.length; i++) {
			// 모든 TV 출력
			tvs[i].print();
		}
		System.out.println("----------------------");
		for(int i = 0; i < tvs.length; i++) {
			// power가 true인 거만 출력
			if(tvs[i].isPower())
				tvs[i].print();
		}
		
	}

}
