package day2;

public class P109 {

	public static void main(String[] args) {
		System.out.println(99 == 99.0);
		System.out.println(99 > 100);
		
		int jumsu = -90;
		
		if(jumsu < 0 || jumsu > 100) {
			System.out.println("점수가 유효하지 않습니다.");
		} else {
			System.out.println("Pass? " + (jumsu > 70));	
		}
	}

}
