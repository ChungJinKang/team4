package day6;

public class P295 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		//c1.color = "red";
		//c1.typeOfGear =  "auto";
		//c1.numOfDoor = 4;
		c1.print();
		
		Car c2 = new Car();
		//c2.color = "black";
		//c2.typeOfGear =  "manual";
		//c2.numOfDoor = 2;
		c2.print();
		
		Car c3 = new Car("Blue", "auto", 2);
		c3.print();
	}

}
