package day12.inner;

public interface Command {
	void exec();
	default void pr() {
		System.out.println("Interface Command에서 default 기능 수행");
	}
}

abstract class Shape {
	abstract void draw();
}

