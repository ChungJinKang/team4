package day17;

import java.util.List;

public class JuiceMaker {
//	static Juice makeJuice(MyBox<? extends Fruit> box) {
//		
//		List list = box.list;
//		String tmp = "";
//		for(int i = 0; i < list.size(); i++) {
//			tmp += box.list.get(i)+ " ";
//		}
//		return new Juice(tmp);
//	}
	
	static <T extends Fruit> Juice makeJuice(MyBox<T> box) {
		
		List list = box.list;
		String tmp = "";
		for(int i = 0; i < list.size(); i++) {
			tmp += box.list.get(i)+ " ";
		}
		return new Juice(tmp);
	}
	
}
