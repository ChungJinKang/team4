package day14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.lang.Math.PI;	// static import

public class Test01 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		Date d2 = new Date(2017, 7, 20);
		System.out.println(d2);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy�� M�� d��");
		System.out.println(sf.format(d));
		
		String s;
		Calendar c = Calendar.getInstance();	// abstract class�̹Ƿ� new�� ��ü���� �ȵ�
		c.set(2017, 7, 20);
		System.out.println(c);
		//System.out.println(sf.format(c));	// Date ��ü�� �Ķ���ͷ�~
		System.out.printf("%tY�� %tm�� %te��%n", c, c, c);	// ���� �����ȣ�Ἥ ���
		System.out.printf("%1$tY�� %1$tm�� %1$te��%n", c);	// 1$�Ἥ c�� �ѹ��� �� �� �ְ� ��
		System.out.printf("%s�� %s �Դϴ�.%n", "ȫ�浿", 100);
		System.out.printf("%1$s��(/��) %1$s �Դϴ�.%n", "ȫ�浿");
		
		String msg = String.format("%1$s��(/��) %1$s �Դϴ�.", "ȫ�浿");	// �ٽ� ��Ʈ������ ���� �� ����
		String msg2 = String.format("%1$tY�� %1$tm�� %1$te��", c);	// �ٽ� ��Ʈ������ ���� �� ����
		System.out.println(msg);
		System.out.println(msg2);
		
		System.out.println(Math.PI);
		//static import �س��� ������ PI�� �ᵵ ��
		System.out.println(PI);
		
		String msg3 = String.format("%5.2f%n", PI);
		System.out.println(msg3);
		
	}

}
