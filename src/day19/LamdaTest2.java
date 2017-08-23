package day19;

@FunctionalInterface
interface LastFriday {
	void play();
	//void add();
}

class MyFriday implements LastFriday {

	@Override
	public void play() {
		System.out.println("LastFriday ������ MyFriday class");
	}
	
}

class MyFriday2 implements LastFriday {
	
	@Override
	public void play() {
		System.out.println("LastFriday ������ MyFriday class");
	}
	public void play2() {
		System.out.println("LastFriday ������ MyFriday class�� play2");
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
				System.out.println("return ���� �͸� Ŭ������ ����");
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
				System.out.println("�͸� class....play����.. ������ �Ҵ�");
				print();
			}
			void print() {
				System.out.println("print�ռ� �Դϴ�.");
			}
		};
		
		f.play();	// ����
		//f.print();	// �Ұ���
		
		call(new LastFriday() {
			@Override
			public void play() {
				System.out.println("�͸��� �Ķ���ͷ� ����");
			}
			
		});
		call(f);
		
		LastFriday f2 = call2();
		f2.play();		

		LastFriday f3 = ()->{System.out.println("���ٽ� ǥ��!@#$%^&*()_+");};
		f3.play();
	}
}
