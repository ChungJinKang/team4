package day4;

public class Ex3 {

	public static void main(String[] args) {
		String[] strData  = { "Java Programming" , "JDBC", "Oracle10g", "JSP/Servlet" };
		
		for(int i = 0; i < strData.length; i++) {
			//System.out.println(strData[i].toUpperCase());
			for(int j = strData[i].length() - 1; j >= 0; j--) {
				System.out.print(strData[i].charAt(j));	
			} System.out.println();
		}
		
	}

}
