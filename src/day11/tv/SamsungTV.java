package day11.tv;

public class SamsungTV implements TV{
	//���
	public void powerOn() {
		System.out.println("Samsung TV power-on");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung TV power-off");
	}
}
