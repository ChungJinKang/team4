package day13.exercise;

public class FindCharacters {

	public static void main(String[] args) {
		String s = "Boys, be ambitious";
		FindCharacters fc = new FindCharacters();
		System.out.println(fc.countChar(s, 'b'));
	}
	int countChar(String str, char c) {
		int cnt = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c)
				cnt++;
		}
		return cnt;
	}
}
