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
	public Circle clone() {	// 반환형을 Object가 아닌 Circle로하면 뒷단에서 Casting안해도 되서 편해짐
		Circle obj = null;
		try {
			obj = (Circle)super.clone();	// implements cloneable이 되어 있어야 이 명령어 수행 가능함
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	@Override
	public void finalize() {	// 소멸자, 메모리 해제
		try {
			super.finalize();
			System.out.println(getClass() + " 의 자원반납 메소드 finalize()");
		} catch (Throwable e) {
			System.out.println(getClass() + " 의 자원반납 실패 ~~~");
			e.printStackTrace();
		}
	}
	public void close() {
		System.out.println("자원 반납 수행");
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