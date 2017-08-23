package day8;

public class Test01 {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.breath();
		
		Object obj = new Animal();		// is a 관계
		// obj.	// breath()가 안보인다!!!
		((Animal)obj).breath();		// down casting이 필요
		
		Animal aa = (Animal)obj;	// down casting
		aa.breath();
	}

}
