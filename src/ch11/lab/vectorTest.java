package ch11.lab;

import java.util.Iterator;
import java.util.Vector;

public class vectorTest {

	public static void main(String[] args) {
		Vector<String> v = new Vector();
		v.add(new String("월요일"));
		v.add(new String("화요일"));
		v.add(new String("수요일"));
		v.add("목요일");
		v.add("금요일");
		v.add("토요일");
		v.add("일요일");
		
		// 줄 세우는 거래
		// List일때는 핑요없지만, Set을 할때는 필요함(순서가 없으니까)
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
			
//			if(s.equals("목요일"))
//				it.remove();
//			else
//				System.out.println(s);
			
		}
		
//		String s2 = it.next();
//		System.out.println(s2);
	}

}
