package day12.inner;

public interface Command {
	void exec();
	default void pr() {
		System.out.println("Interface Command���� default ��� ����");
	}
}

abstract class Shape {
	abstract void draw();
}

