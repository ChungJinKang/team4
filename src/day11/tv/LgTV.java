package day11.tv;

public class LgTV implements TV {
	//���
	@Override
	public void powerOn() {
		System.out.println("LG TV power-on");
	}

	@Override
	public void powerOff() {
		System.out.println("LG TV power-off");
	}
}
