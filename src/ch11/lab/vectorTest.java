package ch11.lab;

import java.util.Iterator;
import java.util.Vector;

public class vectorTest {

	public static void main(String[] args) {
		Vector<String> v = new Vector();
		v.add(new String("������"));
		v.add(new String("ȭ����"));
		v.add(new String("������"));
		v.add("�����");
		v.add("�ݿ���");
		v.add("�����");
		v.add("�Ͽ���");
		
		// �� ����� �ŷ�
		// List�϶��� �ο������, Set�� �Ҷ��� �ʿ���(������ �����ϱ�)
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
			
//			if(s.equals("�����"))
//				it.remove();
//			else
//				System.out.println(s);
			
		}
		
//		String s2 = it.next();
//		System.out.println(s2);
	}

}
