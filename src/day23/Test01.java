package day23;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		int decimal = 30;
		int result = 0;
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		decimal = Integer.parseInt(sc.nextLine());
		
		while( (decimal / 9) > 0 ) {
			//System.out.println((decimal % 9)+ " || " + (Math.pow(10, cnt)) );
			result += (decimal % 9)*(int)(Math.pow(10, cnt++));
			decimal /= 9;
		}
		result += (decimal % 9)*(int)(Math.pow(10, cnt));
		
		System.out.println(result);
	}

}
