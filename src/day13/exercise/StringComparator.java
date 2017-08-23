package day13.exercise;

public class StringComparator {
	public static void main(String[] args) {
		StringComparator sc = new StringComparator();
		int result1 = sc.compare("Yongari-2001", "DragonWar", true);
		int result2 = sc.compare("Yongari-2001", "DragonWar", false);	 
		
		System.out.println(result1);//12
		System.out.println(result2);//9 

	}
	
	public int compare(String str1, String str2, boolean isLength) {
		if(isLength == true) {
			return str1.length() > str2.length() ? str1.length() : str2.length();
		} else {
			int cnt1 = 0, cnt2 = 0;
			for(int i = 0; i < str1.length(); i++) {
				if(str1.charAt(i) == 'a')
					cnt1++;
			}
			for(int i = 0; i < str2.length(); i++) {
				if(str2.charAt(i) == 'a')
					cnt2++;
			}
			return cnt1 > cnt2 ? str1.length() : str2.length();
		}
			
	}

}
