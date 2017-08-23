package day7;

public class ProbTest {

	public static void main(String[] args) {
		
		System.out.println(Prob.leftPad("java", 10, '|'));
		Prob p = new Prob();
		p.str = "sds";
		String ss = p.RightPad(9, '#');
		System.out.println(ss);
		
	}

}
