package day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P505 {

	public static void main(String[] args) {
//		String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", 
//				"c0", "car", "combat", "count", "date", "disc"};
		
		String[] data = {
	             "110-1234-9999", "02-234-7777",
	             "javains@naver.com",
	             "Hello", "java test",
	             "a", "A", "_", " ", "&", "#",
	             "a8", "ab", "AA", "Aa", "ja", "jab",
	             "1234567", "abcdef", "test"
	    	};
		
		String[] pattern = {".*", "c[a-z]*", "c[a-z]", "c[a-zA-Z]", "c[a-zA-Z0-9]", 
				"c.", "c.*", "c\\.", "c\\w","c\\d",
				"c.*t", "[b|c].*", ".*a.+", "[b|c].{2}"};
		
		String pattern2 = ".";
		pattern2 = "[aAb]";
		pattern2 = "\\w";
		pattern2 = "\\W";
		pattern2 = "\\w\\w";
		pattern2 = "\\w{3,5}";
		pattern2 = ".*@.*";
		pattern2 = "\\d";
		pattern2 = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		pattern2 = "j[abc]*";
		
		
		Pattern p = Pattern.compile(pattern2);	// c로 시작하는 소문자 영단어

		for(int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.print(data[i] + ",");
		}
	}

}
