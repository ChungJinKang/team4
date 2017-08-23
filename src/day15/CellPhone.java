package day15;

public class CellPhone {
	private String model;
	private double battery;
	
	public CellPhone() {
		super();
	}
	public CellPhone(String model) {
		super();
		this.model = model + "aaa";
	}
	
	public void call(int time) throws IllegalArgumentException {
		if(time < 0) throw new IllegalArgumentException("통화시간입력오류");
		
		System.out.println("통화 시간: " + time);

		battery -= time * (0.5);
		if(battery < 0) 
			battery = 0;
		//printBattery();
		
	}
	public void charge(int time) throws IllegalArgumentException {
		if(time < 0) throw new IllegalArgumentException("충전시간입력오류");
			
		System.out.println("충전 시간: " + time);
		battery += time*3;
		if(battery > 100)
			battery = 100;
	}
	public void printBattery() {
		System.out.println("남은 배터리양: " + battery);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof CellPhone)) 
			return false;
		return model.equals( ((CellPhone)obj).model );
	}

}
