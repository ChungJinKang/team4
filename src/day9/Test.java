package day9;

public class Test {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child01 ch = new Child01();
		
		Parent p2 = new Child01();
		//Child01 ch2 = new Parent(); 	// is a °ü°è°¡ ¾Æ´Ô!!
	}

}
