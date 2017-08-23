package day16.review;

import java.util.HashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> data = new HashSet<String>();
		
		//Set : �ߺ� ����. ���� ����.
		//HashSet-- �ڵ� sort �ƴ�
		data.add("������");
		data.add("ȭ����");
		data.add("������");
		data.add("ȭ����");
		
		System.out.println(data);
		
		//sort�� ���ؼ� collections �ȿ� �ִ� ����� �̿��ؾ� ��
		
		//TreeSet-- �ڵ� sort
		TreeSet<String> data2 = new TreeSet<String>();
		
		data2.add("ȭ����");
		data2.add("������");
		data2.add("ȭ����");
		data2.add("������");
		
		System.out.println(data2);

		System.out.println("======== HashSet<Car> =======");
		HashSet<Car> data3 = new HashSet<Car>();
		
		data3.add(new Car("��", 1000));
		data3.add(new Car("��", 3000));
		data3.add(new Car("ȭ", 2000));
		data3.add(new Car("ȭ", 2000));
		
		System.out.println(data3);
		

		System.out.println("======== TreeSet<Car> =======");
		TreeSet<Car> data4 = new TreeSet<Car>();
		
		data4.add(new Car("��", 1000));
		data4.add(new Car("��", 3000));
		data4.add(new Car("ȭ", 2000));
		data4.add(new Car("ȭ", 2000));
		
		System.out.println(data4);
	}
}
