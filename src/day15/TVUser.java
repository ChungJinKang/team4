package day15;

public class TVUser {

	public static void main(String[] args) {
		//Television tv = new LgTV();
//		Television tv = new SamsungTV();
		
		Television tv = TVFactory.makeTV("lg");
		tv.turnOn();
		tv.turnOff();
	}

}
