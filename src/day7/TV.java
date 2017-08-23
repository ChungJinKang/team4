package day7;

/**
 * 
 * @author Jin
 * @since 2017.7.11
 * @version 1.0
 * 
 */

public class TV {
	/**
	 * 텔레비전 ~~!!
	 */
	private String color;
	private int channel;
	private boolean power;
	
	public TV() {
		// black 9 false로 초기화
		//this("black", 9, false);
		this(null, 0, false); 
	}
	public TV(String color) {
		//setColor("red");
		this(color, 0, false);
	}
	public TV(String color, int channel, boolean power) {
		this.setColor(color);
		this.setChannel(channel);
		this.setPower(power);
	}
	// 생성자를 이용해서 인스턴스 복사
	public TV(TV t) {
		
		// t 가 null이 아닐때만 동작함!!!
		// t 가  null이면 null pointer exception 발생
		// (null).color는 안될거니까!
		//this(t.color, t.channel, t.power);
		
		if( t != null ) {
			this.setColor(t.color);
			this.setChannel(t.channel);
			this.setPower(t.power);
		}
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public int getChannel() {
		return channel;
	}
	/**
	 * 
	 * @param channel 1~299 사이의 정수
	 * 
	 */
	public void setChannel(int channel) {
		
		// 추가적인 유효성 검증
		/**
		 * channel 정보 변경
		 */
		if( channel > 0 && channel < 300) {
			this.channel = channel;			
		}

	}

	// boolean의 get 메소드는 is___() 으로!
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public void setPower() {
		this.power = !power;
	}

	// TV객체의 상태 정보 출력
	public void print() {
		System.out.printf("TV[%s, %d, %b]%n", color, channel, power);
	}
}
