package util;

public class Time {
	public static String lang = "ko";
	private int hour;
	private int min;
	private int sec;
	
	public void setHour(int hour) {
		if( hour < 0 || hour > 23) {
			return;
		}
		this.hour = hour;
	}
	public void setMin(int min) {
		if( min < 0 || min > 59) {
			return;
		}
		this.min = min;
	}
	public void setSec(int sec) {
		if(sec < 0 || sec > 59) {
			return;
		}
		this.sec = sec;
	}
	
	public int getHour() { return hour; }
	public int getMin() { return min; }
	public int getSec() { return sec; }
	
	public void print() {
		System.out.printf("%d½Ã %dºĞ %dÃÊ %n", hour, min, sec);
	}
}