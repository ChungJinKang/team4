package day12.exercise;

public class DiceGame {

	public static void main(String[] args) {
	 	DiceGame game = new DiceGame();
	 	
	 	try {
		 	int result1 = game.countSameEye(10);
		 	System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result1);

		 	int result2 = game.countSameEye(-10);
	 		System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result2);	 		
	 	} catch(IllegalArgumentException e) {
	 		System.out.println(e.getMessage());
	 	} catch(Exception e) {
	 		e.printStackTrace();
	 	}
	 	
	 	System.out.println("MAIN END");
 	}
	
	int countSameEye(int n) throws IllegalArgumentException {
		if(n < 0) throw new IllegalArgumentException("argument������ ������ �� �� �����ϴ�.");
		
		// �� 8�� �ֻ��� 2�� ����
		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8);
		
		int count = 0;
		// �ֻ��� 2���� ���ÿ� n�� ������ �� ���� ���� ������ Ƚ��
		for(int i = 0; i < n; i++) {
			if(d1.play() == d2.play())
				count++;
		}
		return count;	
	}
}

class Dice {
	int size;

	Dice(int size){
		this.size = size;
	}
	
    int play() {
    	int number = (int)(Math.random() * size) + 1;
        return number;
    }
    
}
