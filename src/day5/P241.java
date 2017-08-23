package day5;

public class P241 {

	public static void main(String[] args) {
		//new TV().print();	//temporary 객체, 이 라인 호출 후 바로 가비지의 대상이 됨.
		
		// 객체 배열
		TV[] tvs = {new TV(), new TV(), new TV()};
		
		tvs[1].color = "red";
		
		for(int i = 0; i < tvs.length; i++) {
			tvs[i].print();
		}
		
	}

}
