package day12.exercise;

public class DiceGame {

	public static void main(String[] args) {
	 	DiceGame game = new DiceGame();
	 	
	 	try {
		 	int result1 = game.countSameEye(10);
		 	System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);

		 	int result2 = game.countSameEye(-10);
	 		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);	 		
	 	} catch(IllegalArgumentException e) {
	 		System.out.println(e.getMessage());
	 	} catch(Exception e) {
	 		e.printStackTrace();
	 	}
	 	
	 	System.out.println("MAIN END");
 	}
	
	int countSameEye(int n) throws IllegalArgumentException {
		if(n < 0) throw new IllegalArgumentException("argument값으로 음수가 올 수 없습니다.");
		
		// 면 8개 주사위 2개 생성
		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8);
		
		int count = 0;
		// 주사위 2개를 동시에 n번 던졌을 때 같은 눈이 나오는 횟수
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
