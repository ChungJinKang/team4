package day3;

public class Calc {

	public static void main(String[] args) {
		int sum = 0; 
		
		//ToDo
		for(int i = 1; i <= 20; i++) {
			if(i%2 != 0 && i%3 != 0)
				sum += i;
			
		}
		System.out.println("sum="+sum); 
		
		/*
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.printf("%d*%d=%2d | ", j, i, i*j);
			} System.out.println();
		}
		*/
	}
}
