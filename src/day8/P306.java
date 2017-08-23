package day8;

public class P306 {

	public static void main(String[] args) {
		Product p1 = new Product();
		//p1.print();
		Product p2 = new Product();
		//p2.print();
		Product p3 = new Product();
		p1.print();
		p2.print();
		p3.print();
	}

}

class Product {	
	static int count;
	//int count;
	int serialNo;
	
	{
		++count;
		serialNo = count;
	}
	
	Product() {
		
	}
	public void print() {
		System.out.printf("Product[count: %d, serialNo: %d]%n",count, serialNo);
	}
	
}