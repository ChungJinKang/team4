package day4;

public class ChungJin {

	public static void main(String[] args) {
		String[] strData  = { "Java Programming" , "JDBC", "Oracle10g", "JSP/Servlet" };
		
		for(int j = 0; j < strData.length; j++) {
			for(int i = strData[j].length() - 1; i >= 0; i--) {
				System.out.print(strData[j].charAt(i));
			} System.out.println();
		}		
	}
}
