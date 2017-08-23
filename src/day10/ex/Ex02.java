package day10.ex;

public class Ex02 {

	public static void main(String[] args) {
		ChildB c = new ChildB();
		System.out.println("x="+c.getX());
	}

}

class ParentB {
	int x=100;
	ParentB() {
		this(200); 
	}
	ParentB(int x) {
		this.x = x;
	}
	int getX() {
		return x;
	}
}
class ChildB extends ParentB {
	int x = 3000;
	ChildB() {
		this(1000); 
	}
	ChildB(int x) {
		this.x = x;
	}
}
