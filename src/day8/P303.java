package day8;

public class P303 {

	public static void main(String[] args) {
		BlockTest b = new BlockTest();
		BlockTest b2 = new BlockTest();
		BlockTest b3 = new BlockTest();
		
		//System.out.println(b);
	}

}

class BlockTest {
	static {
		System.out.println(" ------- static �ʱ�ȭ ��� -------- ");
	}
	
	// �ν��Ͻ� �ʱ�ȭ ���
	{
		System.out.println("{ } instance �ʱ�ȭ ���");		
	}
	// �����ڸ��� �Ź� ������ �ൿ�� �ϴ� �κ��� �ʱ�ȭ ������ ���� �� �ִ�.
	BlockTest() {
		//System.out.println("{ } instance �ʱ�ȭ ���");	
		System.out.println("BlockTest() ������");
	}
	BlockTest(int i) {
		//System.out.println("{ } instance �ʱ�ȭ ���");	
		System.out.println("BlockTest() ������");
	}
	BlockTest(String s) {
		//System.out.println("{ } instance �ʱ�ȭ ���");	
		System.out.println("BlockTest() ������");
	}
	
}