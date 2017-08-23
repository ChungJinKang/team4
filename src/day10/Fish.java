package day10;

public class Fish extends Animal {
	int size;
	
	public Fish() {
		super("물고기");
	}
	
	@Override
	public void print() {
		System.out.printf("Fish[kind: %s, size: %d]%n", kind, size);
	}
	@Override
	public void breath() {
		System.out.println("아가미로 숨쉬기~~~");
	}
}
