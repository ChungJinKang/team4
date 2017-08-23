package day16.review;

// ��, ������ ���ؼ� Comparable�� �����ؾ��Ѵ�.
public class Car implements Comparable<Car> {
	private String model;
	private int price;
	
	public Car() {
		super();
	}
	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}
	
	///  �ߺ�üũ�� ���� hashCode(), equals() �� �����ǰ� �ʿ���
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
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
		Car other = (Car) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	@Override
	public int compareTo(Car o) {
//		return model.compareTo(o.getModel());	// ascend
//		return price - o.getPrice();
		return  o.getPrice() - price;
		
	}	
}
