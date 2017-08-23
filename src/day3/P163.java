package day3;

public class P163 {
	public static void main(String[] args) {
Loop1:	for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				//if(j == 5)
				//	continue Loop1;
					//break Loop1;
				System.out.printf("%d*%d=%-2d | ", j, i, j*i);
			} System.out.println();
		}
	}
}
