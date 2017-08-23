package day10;

public class Dog extends Animal {
	String kind;
	String name;
	
	public Dog() {
		this("강아지 종류", null);
	}
	public Dog(String kind, String name) {
		this("Dog", kind, name);
	}
	public Dog(String superKind, String kind, String name) {
		super(superKind);
		this.kind = kind;
		this.name = name;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.printf("Dog[%s, %s, %s]%n", super.kind, kind, name);
	}
	@Override
	public void breath() {
		System.out.println("페로 숨쉬기~~");
	}
	@Override
	public String toString() {
		return kind + name;
//		return null;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kind == null) ? 0 : kind.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (kind == null) {
			if (other.kind != null)
				return false;
		} else if (!kind.equals(other.kind))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
