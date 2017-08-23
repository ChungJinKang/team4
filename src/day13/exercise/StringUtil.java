package day13.exercise;

public class StringUtil {
    public static String concatenate(String[] str) {
        //문자열을 결합하여 리턴하는 메소드 구현
    	
    	// StringBuffer 이용하는 방법
    	StringBuffer sb = new StringBuffer("");
    	
    	for(int i = 0; i < str.length; i++) {
    		sb.append(str[i]);
    	}
    	return sb.toString();
    }

	
	public static void main(String[] args) {
        String[] strArr = {"SuperMan", "BatMan", "SpiderMan"}; 
        String resultStr = concatenate( strArr );
        System.out.println( "결과 문자열 : " + resultStr ); 
	}

}
