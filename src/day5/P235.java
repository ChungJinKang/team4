package day5;

class P235 {
	public static void main(String[] args) {
		String msg = "hello~~~";
		msg.length();
		
		TV tv1 = new TV();
		tv1.print();
		tv1.color = "Black";
		tv1.power();
		tv1.setChannel(9);
		tv1.print();
		
		TV tv2 = new TV();
		tv2.setChannel(11);
		tv2.print();
		
		tv2 = tv1;
		tv2.print();
		
		new TV().print();
		
		//TV[] tvs;
	}
}

// Ŭ���� ����
class TV {
	// ��� �ʵ� (�ν��Ͻ� var)
	String color;
	boolean power;
	int channel;
	
	// �޼ҵ�(�ν��Ͻ� method)
	public void power() {
		power = !power;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public void print() {
		System.out.printf("TV[color:%s, powerOn?: %b, channel:%d]%n", color, power, channel);
	}
	
}