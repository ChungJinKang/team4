package day13;

public class P464 {

	public static void main(String[] args) {
		String msg1 = new String("Hello JAVA!");
		msg1.replace("A", "_");
		System.out.println(msg1);	// msg1은 변경 불가능한 객체
		
		StringBuffer sbmsg = new StringBuffer("Hello JAVA!");
		sbmsg.replace(0, 3, "Jell");	
		System.out.println(sbmsg);	// sbmsg는 변경 가능
		
		int i = 100;
		String s = "hello " + i + " sample";	// 성능저하의 원인이 되는 코드
												// 한 문장에서 객체생성이 많음!
												// 스트링 합치는거 많이 해야할 경우에는 StringBuffer를 쓰래
		System.out.println(s);
		
		
		// String Merge는 이렇게 써야함
		StringBuffer sb = new StringBuffer();
		sb.append("Hello ");
		sb.append(i);		
		sb.append(" sample");
		String ss = sb.toString();
		System.out.println(ss);
		
		StringBuilder sbi = new StringBuilder();
		sbi.append("He11o ").append(i).append(" sample");
		ss = sbi.toString();
		System.out.println(ss);
		
		
		String cs = "";
		cs = cs.concat("Hello ");
		cs = cs.concat(String.valueOf(i+1));	// String 타입만 넣어줘야~
		//cs = cs.concat(Integer.toString(i));// String 타입만 넣어줘야~
										// StringBuffer의 append처럼 자동으로 스트링 처리해서 넣지는 못함
		cs = cs.concat(" sample");
		System.out.println("cs: " + cs);
	}

}
