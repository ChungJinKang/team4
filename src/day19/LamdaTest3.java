package day19;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface ComputeInterface {
	int maxValue(int a, int b);
}

@FunctionalInterface
interface ComputeInterface2 {
	void printVar(String s, int i);
}

@FunctionalInterface
interface ComputeInterface3 {
	int roll();
}

@FunctionalInterface
interface ComputeInterface4 {
	int sumArr(int[] arr);
}



public class LamdaTest3 {

	public static void main(String[] args) {
		// 익명 객체가 a안으로 들어간거임
		ComputeInterface com = (int su1, int su2)->{return (su1 > su2) ? su1 : su2; };

		Function<Integer, String> f1 = i->i+10*10+" ";
		String str = f1.apply(5);
		System.out.println("apply 연습 : " + str);
		
		ComputeInterface com2 = (su1, su2)-> su1 > su2 ? su1 : su2;	//{}를 빼면 리턴 안써도 됨
		
		int result = com.maxValue(15, 20);
		System.out.println(result);
		System.out.println("============================");
		
		// 익명 클래스 만든걸로 보면 됨
		ComputeInterface2 com3 = (a,b)->{ System.out.println(a+b); };
		com3.printVar("멀티캠퍼스", 718);
		
		ComputeInterface3 com4 = ()->{ return (int)(Math.random()*45); };
		result = com4.roll();
		System.out.println(result);
		System.out.println("============================");
		
		// 입력은 없고 반환만 있을 때, Supplier!
		Supplier<Integer> supplier = ()->(int)(Math.random()*45);
		result = supplier.get();
		System.out.println("Supplier : " + result);
		
		ComputeInterface4 com5 = (int[] arr)->{
			int sum = 0;
			for(int i : arr) {
				sum += i;
			}
			return sum;
		};
		
		result = com5.sumArr(new int[]{1,2,3,4,5,6,7,8,9,10});
		System.out.println(result);
		
		// 익명으로 생성하는 방법
		ComputeInterface4 com6 = new ComputeInterface4() {
			
			@Override
			public int sumArr(int[] arr) {
				int sum = 0;
				for(int i : arr) {
					sum += i;
				}
				return sum;
			}
		};
		
		result = com6.sumArr(new int[]{1,2,3,4,5,6,7,8,9,10});
		System.out.println(result);
		
		Predicate<Integer> predicate = i->i%2==0;
		boolean b = predicate.test(33);
		System.out.println("Predicate : " + b);
	}

}
