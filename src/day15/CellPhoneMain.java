package day15;

public class CellPhoneMain {

	public static void main(String[] args) {
		CellPhone myPhone = new CellPhone("SCH-600");
		
		myPhone.charge( 20 );  //20분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 300 );  //300분간 통화를 한다.
		myPhone.printBattery();
		
		myPhone.charge( 50 );  //50분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 40 );  //40분간 통화를 한다.
		myPhone.printBattery();
		
		try {
			myPhone.call( -20 );  //통화시간이 잘못 입력되었다.
		} catch(IllegalArgumentException e) {
			System.out.println( e.getMessage() ); 
		} 
		
		CellPhone yourPhone = new CellPhone("SCH-600");
		
		String s1 = "자바";
		String s2 = "자바";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		String s3 = new String("자바");
		String s4 = new String("자바");
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));

		System.out.println(System.identityHashCode(myPhone));
		System.out.println(System.identityHashCode(yourPhone));
		
		// 주소 비교
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
		// 내용 비교
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s4));
		
		if( myPhone.equals(yourPhone) ) {
			System.out.println("동일 모델입니다.");
		} else {
			System.out.println("다른 모델입니다.");
		}

		String otherPhone = new String("SCH-600");
		boolean b = myPhone.equals(otherPhone);
		System.out.println(b);
	}

}
