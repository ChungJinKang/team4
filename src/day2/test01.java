package day2;

import java.util.Date;
//import java.sql.Date;	// ���ÿ� �ΰ��� �ȵ�!!!
//import java.util.Date;

public class test01 {

	public static void main(String[] args) {
		String name = new String("hello java!!!");	// new�� ��ü ����
		
		System.out.println(name);
		System.out.println(name.toUpperCase());
		name = null;	// gc�� �������� �������ֵ��� �˷���!!!
						// new �ؼ� ���� ����(��ü)�� ������ �÷��� ����� ��
		
		//java.util.Date today = new java.util.Date();	// ��ü ����
		Date today = new Date();	// ��ü ����
		System.out.println(today);	// today.toString()���� auto-converting��!!!

		Date c = today;	// ���� Ŭ���� Ÿ���̹Ƿ� ���԰���
		today = null;	// c�� ������ ������ ��ü�� ����Ű�� �����Ƿ�
						// new�ؼ� ���� Data��ü�� ������ �÷��� ����� �ȵ�!!!
		
		java.sql.Date s;	// java.sql.Date�� java.util.Date�� ���ÿ� import�� �� ����!!!
		
		System.out.println('1'+'2');
		System.out.println('1');
		
		char cc = 45 + 20;	// �� ���� �Ŀ��� promotion�� �Ͼ
		System.out.println(cc);
		
		char temp;
		System.out.println(cc > 65 ? cc : (char)(cc + 1)); // �� ���� �Ŀ��� promotion �Ͼ�� ����, int�� ó��
	}

}
