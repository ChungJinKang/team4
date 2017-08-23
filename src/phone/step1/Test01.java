package phone.step1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		String str1 = "ppp01";
		String str2 = "ppp02";
		
		int num;
		Scanner scanner = new Scanner(System.in);
		num = Integer.parseInt(scanner.nextLine());
		
		//num = str1;
		
		System.out.println(str1.compareTo(str2));
	}

}
