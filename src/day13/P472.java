package day13;

public class P472 {

	public static void main(String[] args) {
		String data = "홍길동 100 90 89";
		String name = data.substring(0, 4);
		System.out.println(name);
		System.out.println(data.indexOf(' '));
		
		// substring만으로 원하는 문자 추출(원래는 구분자로 한댑)
		String j = data.substring(data.indexOf(' ')).trim();
		System.out.println(j);
		System.out.println(j.substring(0, j.indexOf(' ')));
		System.out.println(j.substring(j.indexOf(' '), j.lastIndexOf(' ')).trim());
		System.out.println(j.substring(j.lastIndexOf(' ')).trim());
		
		
	}

}
