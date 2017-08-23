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
		System.out.println(" ------- static 초기화 블락 -------- ");
	}
	
	// 인스턴스 초기화 블락
	{
		System.out.println("{ } instance 초기화 블락");		
	}
	// 생성자마다 매번 동일한 행동을 하는 부분은 초기화 블럭으로 빼낼 수 있다.
	BlockTest() {
		//System.out.println("{ } instance 초기화 블락");	
		System.out.println("BlockTest() 생성자");
	}
	BlockTest(int i) {
		//System.out.println("{ } instance 초기화 블락");	
		System.out.println("BlockTest() 생성자");
	}
	BlockTest(String s) {
		//System.out.println("{ } instance 초기화 블락");	
		System.out.println("BlockTest() 생성자");
	}
	
}