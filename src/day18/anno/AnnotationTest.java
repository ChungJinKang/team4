package day18.anno;

import java.util.ArrayList;
import java.util.Date;

class MyClass {
	public void print() {
		System.out.println("MyClass의 print");
	}
	
}

class MyClass2 extends MyClass {
	// 덮어 쓸때는 반환형, 매개변수가 동일해야하고
	// 접근지정자가 reduce되면 안된다
	@Override
	public void print() {
		System.out.println("MyClass2의 print");
	}	
}

public class AnnotationTest {

	@SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		MyClass2 a = new MyClass2();
		a.print();
		
		Date d = new Date();
		System.out.println(d);
		
		// deprecated 메서드는 권장하지 않음
		// 경고창을 보기 싫으면, 어노테이션 사용해서 경고를 없앨 수 있음
		int year = d.getYear();
		System.out.println(year + 1900);
		
		// 제네릭스 쓰라는 경고가 안나오게 하려면
		// 역시 어노테이션 사용
		ArrayList list = new ArrayList();
		list.size();
		// 아무거나 집어넣는데 경고가 안나오게 하려면
		// 어노테이션 사용
		list.add(new Object());
	}

}
