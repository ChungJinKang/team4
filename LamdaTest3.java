package day19;

interface MyInterface {
	// �߻� �޼���
	public abstract void run();
	
}

class MyClass implements MyInterface {

	@Override
	public void run() {
		System.out.println("MyInterface�� ������ MyClass");
	}
	
}

class MyClass2 implements MyInterface {

	@Override
	public void run() {
		System.out.println("MyInterface�� ������ MyClass2");
	}
	
}

public class LamdaTest1 {

	public static MyInterface call2() {
		
		return new MyInterface() {
			
			@Override
			public void run() {
				System.out.println("�͸� class�� �Լ�.... return");
			}
		};
		
	}

	public static void call(MyInterface aa) {
		aa.run();
	}
	
	public static void main(String[] args) {
		// interfaceŸ������ ������ ���°� Ȱ�뵵�� ����
		MyInterface a = new MyClass2();
		a.run();
		
		// �͸����� ���鶧�� interface�� new����
		new MyInterface() {

			@Override
			public void run() {
				System.out.println("�͸� class --- ������");
			}
			
		}.run();
		
		// interface ������ ���� ���� ����
		MyInterface f = new MyInterface() {
			
			@Override
			public void run() {
				System.out.println("�͸� class --- ������");
			}
		};
		call(a);
		call(f);
		call(new MyInterface() {
			
			@Override
			public void run() {
				System.out.println("�͸����� �Լ��� ����");
			}
		});
		
		MyInterface f2 = call2();
		f2.run();
	}

}
