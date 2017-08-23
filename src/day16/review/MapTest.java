package day16.review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("호우형1", 100);	// 이렇게 한 세트를 entry라 한다.
		map.put("호우형2", 85);
		map.put("호우형3", 90);
		map.put("호우형4", 95);
		
		System.out.println(map);
		
		for(String key : map.keySet()) {
			Integer value = map.get(key);	//int로 해도 상관 없음 unboxing?이 자동으로 된대
			System.out.println(key + " --> " + value);
		}
		
		System.out.println("== entry =================");
		
		for( Entry<String, Integer> entry : map.entrySet() ) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " --> " + val);
		}

		Set<Entry<String, Integer>> entrys = map.entrySet();
		List list = new ArrayList<>(entrys);
		Collections.sort(list, new MyComp());	// sort기준을 MyComp라는 클래스에 구현!
		System.out.println(list);
		
	}

}

class MyComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Map.Entry a = (Map.Entry)o1;
		Map.Entry b = (Map.Entry)o2;
		
		return ((int)a.getValue()) - ((int)b.getValue());
		//return ((Integer)a.getValue()).intValue() - ((Integer)b.getValue()).intValue();
	}
}

// Collections.sort(list, new MyComp()); 요기에 두번째 파라미터에 Entry가 들어가니까
// 안써주거나 아래처럼 해줌. Integer나 다른 타입은 안됨.
//class MyComp implements Comparator<Entry<String, Integer>> {
//
//	@Override
//	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//		//return o1.getValue() - o2.getValue();
////		return o1.getKey().compareTo(o2.getKey())*(-1);
//		return (o1.getValue() - o2.getValue());	// 값으로 정렬
//	}
//}
