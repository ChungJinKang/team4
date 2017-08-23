package day13.exercise;

public class GradeTest {

	public static void main(String[] args) {		
		//Grade g = new Grade("C:\\workspace\\sample\\data.txt");	// 절대 경로
		Grade g = new Grade("data.txt");	// 상대 경로
		g.calculateGrade();
	}

}
