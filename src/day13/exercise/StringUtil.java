package day13.exercise;

public class StringUtil {
    public static String concatenate(String[] str) {
        //���ڿ��� �����Ͽ� �����ϴ� �޼ҵ� ����
    	
    	// StringBuffer �̿��ϴ� ���
    	StringBuffer sb = new StringBuffer("");
    	
    	for(int i = 0; i < str.length; i++) {
    		sb.append(str[i]);
    	}
    	return sb.toString();
    }

	
	public static void main(String[] args) {
        String[] strArr = {"SuperMan", "BatMan", "SpiderMan"}; 
        String resultStr = concatenate( strArr );
        System.out.println( "��� ���ڿ� : " + resultStr ); 
	}

}
