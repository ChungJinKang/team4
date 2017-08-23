package day4;

public class Ex1 {

	public static void main(String[] args) {
		String msg = "yes";
		System.out.println(msg.equals("yes"));
		
		int sum = 0;
		for(int i = 1,s = 1; ; i++, s=-s) {
			sum += (i*s);
			if(sum >= 100) {
				System.out.println(i);
				break;
			}
				
		}
		System.out.println(sum);
	}

}
