package day15;

public class CellPhoneMain {

	public static void main(String[] args) {
		CellPhone myPhone = new CellPhone("SCH-600");
		
		myPhone.charge( 20 );  //20�а� ������ �Ѵ�.
		myPhone.printBattery();
		
		myPhone.call( 300 );  //300�а� ��ȭ�� �Ѵ�.
		myPhone.printBattery();
		
		myPhone.charge( 50 );  //50�а� ������ �Ѵ�.
		myPhone.printBattery();
		
		myPhone.call( 40 );  //40�а� ��ȭ�� �Ѵ�.
		myPhone.printBattery();
		
		try {
			myPhone.call( -20 );  //��ȭ�ð��� �߸� �ԷµǾ���.
		} catch(IllegalArgumentException e) {
			System.out.println( e.getMessage() ); 
		} 
		
		CellPhone yourPhone = new CellPhone("SCH-600");
		
		String s1 = "�ڹ�";
		String s2 = "�ڹ�";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		String s3 = new String("�ڹ�");
		String s4 = new String("�ڹ�");
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));

		System.out.println(System.identityHashCode(myPhone));
		System.out.println(System.identityHashCode(yourPhone));
		
		// �ּ� ��
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
		// ���� ��
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s4));
		
		if( myPhone.equals(yourPhone) ) {
			System.out.println("���� ���Դϴ�.");
		} else {
			System.out.println("�ٸ� ���Դϴ�.");
		}

		String otherPhone = new String("SCH-600");
		boolean b = myPhone.equals(otherPhone);
		System.out.println(b);
	}

}
