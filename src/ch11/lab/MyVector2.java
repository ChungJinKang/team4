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
	// remove�� next()�� �о�� ��ü�� �����ϴ� ��
	// remove()�� ȣ���ϱ� ������ �ݵ�� next()�� ȣ���� ���¿��� ��
	public void remove() {
		// ���̻� ������ ���� ������ IllegalStateException�� �߻���Ų��.
		if(lastRet == -1) {
			throw new IllegalStateException();
		} else {
			remove(lastRet);
			cursor--;			// �����Ŀ� cursor��ġ ����
			lastRet = -1;		// �о�� ��Ұ� �����Ǿ����Ƿ� lastRet�� ���� �ʱ�ȭ
		}
	}
	
}
