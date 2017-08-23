package day7;

// TV ��ü �ʱ�ȭ �� (black 9 false)

public class TVTest {

	public static void main(String[] args) {
		/*
		TV tv = new TV("black", 300, true);
		//tv.setChannel(300);
		//tv.setPower(true);
		tv.print();
		
		TV tv2 = new TV("gray", 9, false);
		//tv2.channel = 999;	// channel�� ������ ���� ������ ���ַ��� ���� �ɾ ���ָ� ��
		//tv2.setChannel(9);
		//tv2.setPower(true);
		//tv2.power = true;
		tv2.print();
		
		TV tv3 = new TV("red");
		tv3.print();
		
		TV tv4 = new TV(tv2);
		tv4.print();
		
		TV t = null;
		TV t5 = new TV(t);	// null pointer exception �߻�!
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
			// ��� TV ���
			tvs[i].print();
		}
		System.out.println("----------------------");
		for(int i = 0; i < tvs.length; i++) {
			// power�� true�� �Ÿ� ���
			if(tvs[i].isPower())
				tvs[i].print();
		}
		
	}

}
