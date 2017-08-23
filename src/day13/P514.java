package day13;

import java.util.StringTokenizer;

public class P514 {

	public static void main(String[] args) {
		String source = "ȫ�浿, 100,,, 200,300,400";
		StringTokenizer st = new StringTokenizer(source, ",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken().trim());
		}
		
		System.out.println("---------------");
		String[] datas = source.split(",");
		for(int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
	}

}
