package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02_1 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input_¾È³ç.txt"));
		Scanner sc = new Scanner(System.in);
		
		Map<Character, Integer> map = new HashMap<>();
		
		int testcase = sc.nextInt();
		
		for(int i = 0; i < testcase; i++) {
			map.put('h', 0);
			map.put('e', 0);
			map.put('l', 0);
			map.put('o', 0);
			
			String word = sc.next();
			for(int j = 0; j < word.length(); j++) {
				Character ch = word.charAt(j);
				if(map.containsKey(ch)) {
					map.put(ch, map.get(ch) + 1);
				}
			}
			
			map.put('l', (map.get('l')/2));
			
			int ans = Collections.min(map.values());
			System.out.println("#" + i + " " + ans);
		}
		
		
	}

}
