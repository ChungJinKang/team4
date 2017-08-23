package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest2 {
	public static void main(String[] args) {
		HashMap<String, Fruit> cart = new HashMap<>();
		
		Fruit f = new Fruit("사과", 1000, 10);
		
		buy(cart, f);	// 추가? 갯수 수정?
		
		f = new Fruit("수박", 20000, 3);
		buy(cart, f);
		
		f = new Fruit("사과", 1000, 10);
		buy(cart, f);
		
		//System.out.println(cart);
	}
	
	public static void buy(HashMap<String, Fruit> cart, Fruit f) {		
		if(cart.containsKey(f.name)) {
			cart.get(f.name).count += f.count;
		} else {
			cart.put(f.name, f);
		}

//		boolean flag = false;
//		Set<String> cartKeys = cart.keySet();
//		Iterator<String> it = cartKeys.iterator();
//		while(it.hasNext()) {
//			String key = it.next();
//			if( key.equals(f.name)) {
//				cart.get(key).count += f.count;
//				flag = true;
//				break;
//			}
//		}
//		if(!flag) {
//			cart.put(f.name, f);
//		}
		
		print(cart);
	}
	
	public static void print(HashMap<String, Fruit> cart) {
		System.out.println("=============== cart 정보 ===============");
	
//		Set<String> keys = cart.keySet();
//		Iterator<String> it = keys.iterator();
//		while(it.hasNext()) {
//			String fName = it.next();
//			System.out.println(fName + "=> " + cart.get(fName));
//		}
		// 위처럼 해서 String 변수에 집어넣을 수 도 있지만
		// 하나하나는 String으로 나오기 때문에 
		// iteration을 쓸 필요없이 아래처럼 확장 for를 쓸 수도 있다.
		
		for(String fName : cart.keySet()) {
			System.out.println(fName + "=> " + cart.get(fName));
		}
	}

}

class Fruit {
	String name;
	int price;
	int count;
	
	public Fruit(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + ", count=" + count + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Fruit other = (Fruit) obj;
		if (count != other.count)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	
}
