package day11.tv;

// �������̽� ���� 
// �������� �� ����ϱ�~

public class TVUser {

	public static void main(String[] args) {
//		LgTV remote1 = new LgTV();
//		remote1.powerOn();
//		
//		SamsungTV remote2 = new SamsungTV();
//		remote2.powerOn();
		
		TV remote3 = new LgTV();
		remote3.powerOn();
		remote3.powerOff();
		
		TV remote4 = new SamsungTV();
		remote4.powerOn();
		remote4.powerOff();
	}

}
