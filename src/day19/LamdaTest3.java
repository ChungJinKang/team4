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
		// �͸� ��ü�� a������ ������
		ComputeInterface com = (int su1, int su2)->{return (su1 > su2) ? su1 : su2; };

		Function<Integer, String> f1 = i->i+10*10+" ";
		String str = f1.apply(5);
		System.out.println("apply ���� : " + str);
		
		ComputeInterface com2 = (su1, su2)-> su1 > su2 ? su1 : su2;	//{}�� ���� ���� �Ƚᵵ ��
		
		int result = com.maxValue(15, 20);
		System.out.println(result);
		System.out.println("============================");
		
		// �͸� Ŭ���� ����ɷ� ���� ��
		ComputeInterface2 com3 = (a,b)->{ System.out.println(a+b); };
		com3.printVar("��Ƽķ�۽�", 718);
		
		ComputeInterface3 com4 = ()->{ return (int)(Math.random()*45); };
		result = com4.roll();
		System.out.println(result);
		System.out.println("============================");
		
		// �Է��� ���� ��ȯ�� ���� ��, Supplier!
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
		
		// �͸����� �����ϴ� ���
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
