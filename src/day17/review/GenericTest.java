package day17.review;

class Box<T> {	// ����� �� T �����ϰڴ�.
	T item;
	
	T print(T t) {
		return t;
	}
}

public class GenericTest {

	public static void main(String[] args) {
//		Box<String> b1 = new Box<>();
		Box b1 = new Box();	// b1�� Object Ÿ�� �ƹ��ų� �� ��.
							// �׷��� ���߿� �� �ٽ� ��ȯ���ִϱ� ������
		b1.item = new Object();
		b1.item = "����";
		String s = (String)b1.item;
		
		Box<String> b2 = new Box<>();
		Box<Integer> b3 = new Box<>();
		Box<Object> b4 = new Box<>();
		
		// ������ �̹� ���ѵǾ� �����Ƿ� �ٸ� Ÿ���� ���� �� ������
//		b2 = b3;
//		b4 = b3;
		
		// �Ʒ��Ͱ��� ���ϵ�ī�带 ���� ����
		Box<? extends Object> b5 = new Box<>();
		b5 = b3;
	
		System.out.println(b2.print("�ڹ� ���α׷���"));
	}

}
