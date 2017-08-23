package day6;

public class Car {
	private String color;
	private String typeOfGear;
	private int numOfDoor;
	
	public Car() {
		//System.out.println("Car() ����");
		//color = "0000";
		//typeOfGear = "auto";
		//numOfDoor = 4;
		
		this("0000", "auto", 4);
		//System.out.println("Car() ����");
	}
	public Car(Car c) {
		this(c.color, c.typeOfGear, c.numOfDoor);
		
		//color = c.color;
		//typeOfGear = c.typeOfGear;
		//numOfDoor = c.numOfDoor;

	}
	public Car(String color, String typeOfGear, int numOfDoor) { 
		this.color = color;
		this.typeOfGear = typeOfGear;
		this.numOfDoor = numOfDoor;
		//System.out.printf("Car(%s, %s, %d) ����%n", color, typeOfGear, numOfDoor);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setNumOfDoor(int numOfDoor) {
		this.numOfDoor = numOfDoor;
	}
	public int getNumOfDoor() {
		return numOfDoor;
	}
	public String getTypeOfGear() {
		return typeOfGear;
	}
	public void setTypeOfGear(String typeOfGear) {
		this.typeOfGear = typeOfGear;
	}
	/**  Car�� ���� ���� ��� �޼ҵ�  */
	public void print() {
		System.out.printf("Car[%s, %s, %d]%n",color, typeOfGear, numOfDoor);
	}
}
