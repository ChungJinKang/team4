package day18;

public enum Direction {
	EAST(1, "��"), WEST(5, "��"), SOUTH(-1, "��"), NORTH(10, "��");
	int score;
	String myName;
	
	Direction(int score, String myName) {
		this.score = score;
		this.myName = myName;
	}

	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	
}
