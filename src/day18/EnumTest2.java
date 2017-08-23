package day18;

public class EnumTest2 {

	public static void main(String[] args) {
		System.out.println((Card.CLOVER == Card.TWO));
		
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.kind == c2.num);	// 잘못된 결과
	}

}
