package day15;

public class TVFactory {
	public static Television makeTV(String brand) {
		if(brand.equals("sam")) {
			return new SamsungTV();
		} else if(brand.equals("lg")) {
			return new LgTV();
		} else {
			return null;
		}
	
	}
}
