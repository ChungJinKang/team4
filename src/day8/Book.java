package day8;

public class Book {
	private String title;
	private int price;
	
	public Book() {
		
	}
	public Book(String title, int price) {
		this.title = title;
		setPrice(price);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price > 0)
			this.price = price;
	}
	
	public void print() {
		System.out.println("[ å ���� ]");
		System.out.printf("å �̸�: %s%n", title);
		System.out.printf("����: %d%n", price);
	}
}
