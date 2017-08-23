package day11.tv;

public class LgTV implements TV {
	//±â´É
	@Override
	public void powerOn() {
		System.out.println("LG TV power-on");
	}

	@Override
	public void powerOff() {
		System.out.println("LG TV power-off");
	}
}
