package day10;

public class Test01 {

	public static void main(String[] args) {
		//Animal temp = new Animal();	// �̿ϼ��� �ڵ带 ������ �ֱ� ������ ��ü�� ������ �� ����.
		Animal temp = null;
		
		Dog d = new Dog();
		Fish f = new Fish();
		
		temp = f;
		//temp.breath();
		
		// animal �ڽĸ� ���� �� ����
		Animal[] animals = new Animal[3];
		animals[0] = d;
		animals[1] = f;
		animals[2] = new Dog("Dog", "������", "ȣ��");
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].breath();	// �������̵� ���� ���� �̸����� ������ ��� ����!!
		}
		
	}

}
