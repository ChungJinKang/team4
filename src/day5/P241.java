package day5;

public class P241 {

	public static void main(String[] args) {
		//new TV().print();	//temporary ��ü, �� ���� ȣ�� �� �ٷ� �������� ����� ��.
		
		// ��ü �迭
		TV[] tvs = {new TV(), new TV(), new TV()};
		
		tvs[1].color = "red";
		
		for(int i = 0; i < tvs.length; i++) {
			tvs[i].print();
		}
		
	}

}
