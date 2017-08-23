package day2;

import java.util.Date;
//import java.sql.Date;	// 동시에 두개는 안됨!!!
//import java.util.Date;

public class test01 {

	public static void main(String[] args) {
		String name = new String("hello java!!!");	// new로 객체 생성
		
		System.out.println(name);
		System.out.println(name.toUpperCase());
		name = null;	// gc가 힙영역을 관리해주도록 알려줌!!!
						// new 해서 생긴 영역(객체)은 가비지 컬렉팅 대상이 됨
		
		//java.util.Date today = new java.util.Date();	// 객체 생성
		Date today = new Date();	// 객체 생성
		System.out.println(today);	// today.toString()으로 auto-converting됨!!!

		Date c = today;	// 같은 클래스 타입이므로 대입가능
		today = null;	// c는 여전히 생성된 객체를 가리키고 있으므로
						// new해서 생긴 Data객체는 가비지 컬렉팅 대상이 안됨!!!
		
		java.sql.Date s;	// java.sql.Date와 java.util.Date와 동시에 import할 수 없음!!!
		
		System.out.println('1'+'2');
		System.out.println('1');
		
		char cc = 45 + 20;	// 이 연산 후에는 promotion이 일어남
		System.out.println(cc);
		
		char temp;
		System.out.println(cc > 65 ? cc : (char)(cc + 1)); // 이 연산 후에는 promotion 일어나지 않음, int로 처리
	}

}
