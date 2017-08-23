package util;

import day5.P257;

public class MyMath {
	/*
	public static double add(double d1, double d2) {
		return d1 + d2;
	}
	public static double add(double d1, double d2, double d3) {
		return d1 + d2 + d3;
	}
	
	public static double add(double[] d) {
		double result = 0;
		
		for(int i = 0; i < d.length; i++) {
			result += d[i];
		}
		return result;
	}*/
	public static double add(double ... a) {
		double result = 0;
		for(int i = 0; i < a.length; i++)
			result += a[i];
		return result;
	}
	public static double exec(char ch, double ... a) {
		double result = 0;
		switch(ch) {
		case '+':
			for(int i = 0; i < a.length; i++)
				result += a[i];
			break;
		case '-':
			result = a[0];
			for(int i = 1; i < a.length; i++)
				result -= a[i];
			break;
		case '*':
			result = a[0];
			for(int i = 1; i < a.length; i++)
				result *= a[i];
			break;
		}
		
		return result;
	}
	public static int subtract(int d1, int d2) {
		return d1 - d2;
	}
	public static double subtract(double d1, double d2) {
		return d1 - d2;
	}
	public static double divide(double d1, double d2) {
		if(d2 == 0) {
			System.out.println("b의 값으로 0을 허용하지 않습니다!");
			return 0;
		}
		return d1 / d2;
	}
	public static double multiply(double d1, double d2) {
		return d1 * d2;
	}
	
	public static double max(double a, double b) {
		//double big = a > b ? a : b;
		//return big;
		
		return a > b ? a : b;
	}
	
	public static void main(String[] args) {
		P257.main(null);	// 같은 패키지내 이므로 static한 자원들은 메모리에 같이 올라간다.
							// 따라서 (클래스이름).main() 으로 실행 가능
	}
}
