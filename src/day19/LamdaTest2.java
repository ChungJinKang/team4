package day19;

@FunctionalInterface
interface LastFriday {
	void play();
	//void add();
}

class MyFriday implements LastFriday {

	@Override
	public void play() {
		System.out.println("LastFriday 구현한 MyFriday class");
	}
	
}

class MyFriday2 implements LastFriday {
	
	@Override
	public void play() {
		System.out.println("LastFriday 구현한 MyFriday class");
	}
	public void play2() {
		System.out.println("LastFriday 구현한 MyFriday class의 play2");
	}
	
}

public class LamdaTest2 {
	public static void call(LastFriday last) {
		last.play();
	}
	
	public static LastFriday call2() {
		return new LastFriday() {
			@Override
			public void play() {
				System.out.println("return 으로 익명 클래스를 보냄");
			}
		};
	}
	
	public static void main(String[] args) {
		LastFriday a = new MyFriday();
		a.play();
		LastFriday b = new MyFriday2();
		b.play();
		((MyFriday2)b).play2();
		
		
		LastFriday f = new LastFriday() {
			@Override
			public void play() {
				System.out.println("익명 class....play구현.. 변수에 할당");
				print();
			}
			void print() {
				System.out.println("print합수 입니다.");
			}
		};
		
		f.play();	// 가능
		//f.print();	// 불가능
		
		call(new LastFriday() {
			@Override
			public void play() {
				System.out.println("익명을 파라미터로 보냄");
			}
			
		});
		call(f);
		
		LastFriday f2 = call2();
		f2.play();		

		LastFriday f3 = ()->{System.out.println("람다식 표현!@#$%^&*()_+");};
		f3.play();
	}
}
