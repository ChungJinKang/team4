package day16;

public class Car implements Comparable {
	String model;
	String color;
	int price;
	
	public Car(String model, String color, int price) {
		super();
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return (model + color + price).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Car))
			return false;
		Car c = (Car)obj;
		
		return model.equals(c.model) && color.equals(c.color) && price == c.price;
	}

	@Override
	public int compareTo(Object obj) {
		Car c = (Car)obj;
		return model.compareTo(c.model);
	}
	
}