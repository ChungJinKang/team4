package day7;

public class P268 {

	public static void main(String[] args) {
		Data source = new Data();
		source.x = 99;
		
		Data target = P268.copy(source);
		source.print();
		target.print();
		
	}
	static Data copy(Data d) {
		Data data = new Data();
		data.x = d.x;
		
		return data;
	}
}

class Data {
	int x;
	
	// x값 출력 메소드
	public void print() {
		System.out.printf("Data[x=%d]%n", x);
	}
}