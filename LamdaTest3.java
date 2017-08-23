package day19;

interface MyInterface {
	// 추상 메서드
	public abstract void run();
	
}

class MyClass implements MyInterface {

	@Override
	public void run() {
		System.out.println("MyInterface를 구현한 MyClass");
	}
	
}

class MyClass2 implements MyInterface {

	@Override
	public void run() {
		System.out.println("MyInterface를 구현한 MyClass2");
	}
	
}

public class LamdaTest1 {

	public static MyInterface call2() {
		
		return new MyInterface() {
			
			@Override
			public void run() {
				System.out.println("익명 class의 함수.... return");
			}
		};
		
	}

	public static void call(MyInterface aa) {
		aa.run();
	}
	
	public static void main(String[] args) {
		// interface타입으로 변수를 쓰는게 활용도가 높다
		MyInterface a = new MyClass2();
		a.run();
		
		// 익명으로 만들때는 interface도 new가능
		new MyInterface() {

			@Override
			public void run() {
				System.out.println("익명 class --- 재정의");
			}
			
		}.run();
		
		// interface 변수에 담을 수도 있음
		MyInterface f = new MyInterface() {
			
			@Override
			public void run() {
				System.out.println("익명 class --- 재정의");
			}
		};
		call(a);
		call(f);
		call(new MyInterface() {
			
			@Override
			public void run() {
				System.out.println("익명으롷 함수에 전달");
			}
		});
		
		MyInterface f2 = call2();
		f2.run();
	}

}
