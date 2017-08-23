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
		
		map.put("ȣ����1", 100);	// �̷��� �� ��Ʈ�� entry�� �Ѵ�.
		map.put("ȣ����2", 85);
		map.put("ȣ����3", 90);
		map.put("ȣ����4", 95);
		
		System.out.println(map);
		
		for(String key : map.keySet()) {
			Integer value = map.get(key);	//int�� �ص� ��� ���� unboxing?�� �ڵ����� �ȴ�
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
		Collections.sort(list, new MyComp());	// sort������ MyComp��� Ŭ������ ����!
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

// Collections.sort(list, new MyComp()); ��⿡ �ι�° �Ķ���Ϳ� Entry�� ���ϱ�
// �Ƚ��ְų� �Ʒ�ó�� ����. Integer�� �ٸ� Ÿ���� �ȵ�.
//class MyComp implements Comparator<Entry<String, Integer>> {
//
//	@Override
//	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//		//return o1.getValue() - o2.getValue();
////		return o1.getKey().compareTo(o2.getKey())*(-1);
//		return (o1.getValue() - o2.getValue());	// ������ ����
//	}
//}
