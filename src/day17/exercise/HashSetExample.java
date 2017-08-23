package day17.exercise;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Member> data = new HashSet<>();
		
		//Member여러명을 HashSet에 추가한다.
		//이름과 나이가 같은 멤버인 경우 추가되지 않도록 처리한다.
		data.add(new Member("이름3", 22));
		data.add(new Member("이름1", 20));
		data.add(new Member("이름5", 21));
		data.add(new Member("이름2", 24));
		data.add(new Member("이름4", 23));
		data.add(new Member("이름2", 24));
		data.add(new Member("이름2", 24));
		
		//HashSet에 추가된 멤버정보를 출력한다. 
		for(Member m : data) {
			System.out.println(m.getName() + "(" + m.getAge() + "세)");
		}
	}

}

class Member {
	private String name;
	private int age;
	
	
	public Member() {
		super();
	}
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
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
		Member other = (Member) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}