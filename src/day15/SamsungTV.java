package day15;

public class SamsungTV implements Television {
	public void powerOn() {
		System.out.println(getClass().getSimpleName() + "������ �Ҵ�.");
	}
	public void powerOff() {
		System.out.println(getClass().getSimpleName() + "������ ����.");
	}
	
	@Override
	public void turnOn() {
		powerOn();
	}
	@Override
	public void turnOff() {
		powerOff();
	}
}
