package day15;

public class LgTV implements Television {
	public void turnOn() {
		System.out.println(getClass().getSimpleName() + "������ �Ҵ�.");
	}
	public void turnOff() {
		System.out.println(getClass().getSimpleName() + "������ ����.");
	}
}
