package day13;

public class P464 {

	public static void main(String[] args) {
		String msg1 = new String("Hello JAVA!");
		msg1.replace("A", "_");
		System.out.println(msg1);	// msg1�� ���� �Ұ����� ��ü
		
		StringBuffer sbmsg = new StringBuffer("Hello JAVA!");
		sbmsg.replace(0, 3, "Jell");	
		System.out.println(sbmsg);	// sbmsg�� ���� ����
		
		int i = 100;
		String s = "hello " + i + " sample";	// ���������� ������ �Ǵ� �ڵ�
												// �� ���忡�� ��ü������ ����!
												// ��Ʈ�� ��ġ�°� ���� �ؾ��� ��쿡�� StringBuffer�� ����
		System.out.println(s);
		
		
		// String Merge�� �̷��� �����
		StringBuffer sb = new StringBuffer();
		sb.append("Hello ");
		sb.append(i);		
		sb.append(" sample");
		String ss = sb.toString();
		System.out.println(ss);
		
		StringBuilder sbi = new StringBuilder();
		sbi.append("He11o ").append(i).append(" sample");
		ss = sbi.toString();
		System.out.println(ss);
		
		
		String cs = "";
		cs = cs.concat("Hello ");
		cs = cs.concat(String.valueOf(i+1));	// String Ÿ�Ը� �־����~
		//cs = cs.concat(Integer.toString(i));// String Ÿ�Ը� �־����~
										// StringBuffer�� appendó�� �ڵ����� ��Ʈ�� ó���ؼ� ������ ����
		cs = cs.concat(" sample");
		System.out.println("cs: " + cs);
	}

}
