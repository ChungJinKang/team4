package day1;

public class P55 {

	public static void main(String[] args) {

		// primitive data type
		char ch = 'A';
		System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		int num = 100;
		//byte i = 130;	// overflow
		double db = 10.9;
		//float fl = 10.9f;
		boolean check1 = true;
		System.out.println("ch=" + ch + ", num=" + num + ", db=" + db + ", check1="+check1);

		
		// �ڵ� ����ȯ(promotion)
		double f = 10;
		System.out.println("f=" + f);
		
		// ���� ����ȯ(casting)
		int f2 = (int)10.5;
		System.out.println("f2=" + f2);

		float f3 = (float)10.9;
		System.out.println("f3="+f3);
		
		float f4 = 11.5f;
		System.out.println("f4="+f4);
		
		
		// reference data type
		String str1 = new String("ȫ�浿");	//String Ŭ������ �޸𸮿� �Ҵ�!!! �޸𸮿� �ε�!!!
		String str2 = "ȫ�浿";
		String str3 = "ȫ�浿";
		System.out.println("str1=" + str1);
		System.out.println("str2=" + str2);
		System.out.println(str1 == str3);
	}

}
