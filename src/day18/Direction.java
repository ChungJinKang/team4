package day18;

public enum Direction {
	EAST(1, "µ¿"), WEST(5, "¼­"), SOUTH(-1, "³²"), NORTH(10, "ºÏ");
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
