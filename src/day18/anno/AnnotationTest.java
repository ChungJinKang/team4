package day18.anno;

import java.util.ArrayList;
import java.util.Date;

class MyClass {
	public void print() {
		System.out.println("MyClass�� print");
	}
	
}

class MyClass2 extends MyClass {
	// ���� ������ ��ȯ��, �Ű������� �����ؾ��ϰ�
	// ���������ڰ� reduce�Ǹ� �ȵȴ�
	@Override
	public void print() {
		System.out.println("MyClass2�� print");
	}	
}

public class AnnotationTest {

	@SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		MyClass2 a = new MyClass2();
		a.print();
		
		Date d = new Date();
		System.out.println(d);
		
		// deprecated �޼���� �������� ����
		// ���â�� ���� ������, ������̼� ����ؼ� ��� ���� �� ����
		int year = d.getYear();
		System.out.println(year + 1900);
		
		// ���׸��� ����� ��� �ȳ����� �Ϸ���
		// ���� ������̼� ���
		ArrayList list = new ArrayList();
		list.size();
		// �ƹ��ų� ����ִµ� ��� �ȳ����� �Ϸ���
		// ������̼� ���
		list.add(new Object());
	}

}
