package day4;

public class P212 {

	public static void main(String[] args) {	
		//if(args.length == 0) {	// null이 아니라 length로 구분해야함!!!
		if(args.length == 0) {
			System.out.println("------------- 실행방법 -------------");
			System.out.println("이름과 성적을 입력하세요");
			System.out.println("사용 방법: java day4.p212 홍길동 90");
			System.out.println("------------------------------------");
			return;
		}
		
		System.out.println("학생이름: " + args[0]);
		System.out.println("학생성적: " + Integer.parseInt(args[1]));
		
	}

}
