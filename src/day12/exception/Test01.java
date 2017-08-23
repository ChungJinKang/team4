package day12.exception;

public class Test01 {

	public static void main(String[] args) {
		// local variable은 초기화 해줘야!
		int num1 = 0;
		int num2 = 0;
		
		try {
			num1 = Integer.parseInt(args[0]);			
			num2 = Integer.parseInt(args[1]);
			System.out.println(num1/num2);			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("실행 파라미터 값 두개가 필요합니다.");
		} catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("num2에 0은 허용하지 않습니다.");
		} catch(NumberFormatException e) {
			System.out.println("숫자를 입력해주세호우!");
			System.out.println("예)java Test01 66 77");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("항상 수행되는 블록 자원 반납 코드 ~~~");		
		}

		System.out.println("=== Main End ===");
	}

}
