package day3;

public class P150 {

	public static void main(String[] args) {
		//for(int i = 0; i < 5; i++)
		//	System.out.println("Hello world! " + i);

		int sum = 1;	System.out.print("1");
		for(int j = 2; j <= 10; j++) {
			sum += j;
			System.out.print("+" + j);
		}
		
		System.out.println(" = " + sum);
		
		int cnt = 0;
		while(cnt++ < 10)
			System.out.println("최도협 바보");
		
		cnt = 0;
		while(true) {
			System.out.println("test");
			if(cnt++ == 10)	
				break;
		}
		
		boolean flag = true;
		cnt = 0;
		while(flag) {
			System.out.println("호우!");
			if(cnt++ == 10)	
				flag = false;
		}
		
		System.out.println("--main end--");
	}

}
