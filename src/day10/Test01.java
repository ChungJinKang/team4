package day10;

public class Test01 {

	public static void main(String[] args) {
		//Animal temp = new Animal();	// 미완성의 코드를 가지고 있기 때문에 객체를 생성할 수 없다.
		Animal temp = null;
		
		Dog d = new Dog();
		Fish f = new Fish();
		
		temp = f;
		//temp.breath();
		
		// animal 자식만 담을 수 있음
		Animal[] animals = new Animal[3];
		animals[0] = d;
		animals[1] = f;
		animals[2] = new Dog("Dog", "진돗개", "호우");
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].breath();	// 오버라이딩 덕에 같은 이름으로 적절한 기능 동작!!
		}
		
	}

}
