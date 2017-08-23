package day12.exercise_review;

public class DiceGame {

	public static void main(String[] args) {
	 	DiceGame game = new DiceGame ();
		
 		int result1 = game.countSameEye(10);
 		System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result1);
	 		
 		int result2 = game.countSameEye(-10);
 		System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result2);	 		

 		System.out.println("MAIN END");		
	}
	
	int countSameEye(int n) {
		if(n < 0) {
			try {
				throw new IllegalArgumentException("argument ������ ������ �� �� �����ϴ�.");				
			} catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());				
			}
		}
		
		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8);
		
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if(d1.play() == d2.play()) {
				cnt++;
			}
		}
		
		return cnt;
	}
}

class Dice {
	int size;
	Dice(int size){
		this.size = size;
	}
    int play(){
 	int number = (int)(Math.random() * size) + 1;
        return number;
    }
}
