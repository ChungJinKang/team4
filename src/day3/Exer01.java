package day3;

public class Exer01 {

	public static void main(String[] args) {
		/*
		int year = 2018;
		
		for(year = 2000; year <= 2100; year++)
		{
			if((year % 400 == 0 || year % 100 != 0) && (year % 4 == 0)) {
				System.out.println(year + "윤년입니다.");
			}	
		}  
		*/
		int num = 0, num2 = 0;
		
		for(int i = 1; i <= 10; i++) {
			num += i;
			num2 += num;
		}
		//System.out.println(num2);
		
		num = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.print("(");
			for(int j = 1; j <= i; j++) {
				num += j;
				System.out.print(j);
				if(j != i)
					System.out.print("+");
			}
			System.out.print(")");
			if(i == 10)
				break;
			System.out.println("+");
		}
		System.out.println("\n="+num);
		
		System.out.println(Integer.parseInt("5") + Integer.parseInt("5"));
		
		char c = 'b';
		System.out.println(c + " 숫자? " + Character.isDigit(c));
		
		
		for(int i = 0; i < 6; i++) {
			int d = (int)((Math.random()*10) + 1);
			System.out.print(d+ " ");
		}
		
	}

}
