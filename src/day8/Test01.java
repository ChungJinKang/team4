package day8;

public class Test01 {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.breath();
		
		Object obj = new Animal();		// is a ����
		// obj.	// breath()�� �Ⱥ��δ�!!!
		((Animal)obj).breath();		// down casting�� �ʿ�
		
		Animal aa = (Animal)obj;	// down casting
		aa.breath();
	}

}
