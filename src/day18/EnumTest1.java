package day18;

public class EnumTest1 {

	public static void main(String[] args) {

		EnumDay[] days = EnumDay.values();

		for(EnumDay e : days) {
			System.out.println(e + " == " + e.getNum() + " == " + e.getDay());
		}
		
		EnumDay ee = EnumDay.MON;
		if(ee == EnumDay.MON) {
			System.out.println("맞아");
		} else {
			System.out.println("틀려");
		}
		
		switch(ee) {
		case MON:	// EnumDay.MON이 아님!!!
			System.out.println("월요일입니다." + ee.getDay());
			break;
			
		default:
		}
		
//		int su = Integer.parseInt(args[0]);
//		switch (su) {
//		case Day.MON:
//			System.out.println("월요일입니다.");
//			break;
//		case Day.TUE:
//			System.out.println("화요일입니다.");
//			break;
//		case Day.WED:
//			System.out.println("수요일입니다.");
//			break;
//		case Day.THU:
//			System.out.println("목요일입니다.");
//			break;
//		case Day.FRI:
//			System.out.println("금요일입니다.");
//			break;
//		default:
//			System.out.println("주말입니다.");
//			break;
//		}
	}

}

enum EnumDay {
	MON(10, "월"), TUE(20, "화"), WEN(30, "수");
	int num;
	String day;
	
	EnumDay(int num, String day) {
		this.num = num;
		this.day = day;
	}
	int getNum() {
		return num;
	}
	String getDay() {
		return day;
	}
}

//class Day {
//	static final int MON = 1;
//	static final int TUE = 2;
//	static final int WED = 3;
//	static final int THU = 4;
//	static final int FRI = 5;
//}