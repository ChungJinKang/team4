package day13;

public class Circle implements Cloneable {
	Point p;
	int r;
	
	public Circle() {
		this(new Point(), 0);
	}
	
	public Circle(Point p, int r) {
		super();
		this.p = p;
		this.r = r;
	}
	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle c = (Circle)obj;
			if( (p.equals(c.p)) && (r == c.r) )
				return true;			
		}
		return false;
	}
	@Override
	public Circle clone() {	// ��ȯ���� Object�� �ƴ� Circle���ϸ� �޴ܿ��� Casting���ص� �Ǽ� ������
		Circle obj = null;
		try {
			obj = (Circle)super.clone();	// implements cloneable�� �Ǿ� �־�� �� ��ɾ� ���� ������
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	@Override
	public void finalize() {	// �Ҹ���, �޸� ����
		try {
			super.finalize();
			System.out.println(getClass() + " �� �ڿ��ݳ� �޼ҵ� finalize()");
		} catch (Throwable e) {
			System.out.println(getClass() + " �� �ڿ��ݳ� ���� ~~~");
			e.printStackTrace();
		}
	}
	public void close() {
		System.out.println("�ڿ� �ݳ� ����");
	}
}

class Point {
	int x;
	int y;
	
	public Point() {
		this(1,1);
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point)
			if((this.x == ((Point)obj).x) && (this.y == ((Point)obj).y))
				return true;
		return false;
	}
}