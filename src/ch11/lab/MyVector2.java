package ch11.lab;

import java.util.Iterator;

public class MyVector2 extends MyVector implements Iterator {
	int cursor = 0;
	int lastRet = -1;
	
	public MyVector2() {
		this(10);
	}
	
	public MyVector2(int capacity) {
		super(capacity);
	}

	@Override
	public String toString() {
		String tmp = "";
		Iterator it = iterator();
		
		for(int i = 0; it.hasNext(); i++) {
			if(i != 0)	tmp += ", ";
			tmp += it.next();
		}
		return "[" + tmp + "]";
	}
	
	public Iterator iterator() {
		cursor = 0;
		lastRet = -1;
		return this;
	}
	@Override
	public Object next() {
		Object next = get(cursor);
		lastRet = cursor++;
		return next;
	}
	@Override
	public boolean hasNext() {
		return cursor != size();
	}
	// remove는 next()로 읽어온 객체를 삭제하는 것
	// remove()를 호출하기 전에는 반드시 next()를 호출한 상태여야 함
	public void remove() {
		// 더이상 삭제할 것이 없으면 IllegalStateException을 발생시킨다.
		if(lastRet == -1) {
			throw new IllegalStateException();
		} else {
			remove(lastRet);
			cursor--;			// 삭제후에 cursor위치 감소
			lastRet = -1;		// 읽어온 요소가 삭제되었으므로 lastRet의 값을 초기화
		}
	}
	
}
