package day17.review;

class Box<T> {	// 사용할 때 T 결정하겠다.
	T item;
	
	T print(T t) {
		return t;
	}
}

public class GenericTest {

	public static void main(String[] args) {
//		Box<String> b1 = new Box<>();
		Box b1 = new Box();	// b1은 Object 타입 아무거나 다 들어감.
							// 그러나 나중에 다 다시 변환해주니까 안좋음
		b1.item = new Object();
		b1.item = "문자";
		String s = (String)b1.item;
		
		Box<String> b2 = new Box<>();
		Box<Integer> b3 = new Box<>();
		Box<Object> b4 = new Box<>();
		
		// 변수가 이미 제한되어 있으므로 다른 타입은 넣을 수 없나봄
//		b2 = b3;
//		b4 = b3;
		
		// 아래와같이 와일드카드를 쓰면 가능
		Box<? extends Object> b5 = new Box<>();
		b5 = b3;
	
		System.out.println(b2.print("자바 프로그래밍"));
	}

}
