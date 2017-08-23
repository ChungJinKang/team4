package day17;

class Car{
	String model;

	public Car(String model) {
		super();
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}
	
}

class Product<T, B> {
	private T item;
	private int price;
	B location;
	
	public Product() {
		super();
	}
	public Product(T item, int price) {
		super();
		this.item = item;
		this.price = price;
	}
	public Product(T item, int price, B location) {
		super();
		this.item = item;
		this.price = price;
		this.location = location;
	}
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

public class GenericTest {

	public static void main(String[] args) {
		Product<String, String> p = new Product<>("TV", 100);	// 첫번째 item을 문자로만!!!
		System.out.println(p.getItem());
		
		Product<Integer, String> p2 = new Product<>(300, 100);
		System.out.println(p2.getItem());
		
		Product<Car, String> p3 = new Product<>(new Car("아우디"), 5000);
		System.out.println(p3.getItem().model);
		
		Product<Car, String> p4 = new Product<>(new Car("아우디"), 1000, "역삼");
		System.out.println(p4.getItem() + ":" + p4.location);
	}

}
