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
	 * �ڷ����� ~~!!
	 */
	private String color;
	private int channel;
	private boolean power;
	
	public TV() {
		// black 9 false�� �ʱ�ȭ
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
	// �����ڸ� �̿��ؼ� �ν��Ͻ� ����
	public TV(TV t) {
		
		// t �� null�� �ƴҶ��� ������!!!
		// t ��  null�̸� null pointer exception �߻�
		// (null).color�� �ȵɰŴϱ�!
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
	 * @param channel 1~299 ������ ����
	 * 
	 */
	public void setChannel(int channel) {
		
		// �߰����� ��ȿ�� ����
		/**
		 * channel ���� ����
		 */
		if( channel > 0 && channel < 300) {
			this.channel = channel;			
		}

	}

	// boolean�� get �޼ҵ�� is___() ����!
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public void setPower() {
		this.power = !power;
	}

	// TV��ü�� ���� ���� ���
	public void print() {
		System.out.printf("TV[%s, %d, %b]%n", color, channel, power);
	}
}
