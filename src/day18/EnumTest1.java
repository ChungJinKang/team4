package day18;

public class EnumTest1 {

	public static void main(String[] args) {

		EnumDay[] days = EnumDay.values();

		for(EnumDay e : days) {
			System.out.println(e + " == " + e.getNum() + " == " + e.getDay());
		}
		
		EnumDay ee = EnumDay.MON;
		if(ee == EnumDay.MON) {
			System.out.println("�¾�");
		} else {
			System.out.println("Ʋ��");
		}
		
		switch(ee) {
		case MON:	// EnumDay.MON�� �ƴ�!!!
			System.out.println("�������Դϴ�." + ee.getDay());
			break;
			
		default:
		}
		
//		int su = Integer.parseInt(args[0]);
//		switch (su) {
//		case Day.MON:
//			System.out.println("�������Դϴ�.");
//			break;
//		case Day.TUE:
//			System.out.println("ȭ�����Դϴ�.");
//			break;
//		case Day.WED:
//			System.out.println("�������Դϴ�.");
//			break;
//		case Day.THU:
//			System.out.println("������Դϴ�.");
//			break;
//		case Day.FRI:
//			System.out.println("�ݿ����Դϴ�.");
//			break;
//		default:
//			System.out.println("�ָ��Դϴ�.");
//			break;
//		}
	}

}

enum EnumDay {
	MON(10, "��"), TUE(20, "ȭ"), WEN(30, "��");
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