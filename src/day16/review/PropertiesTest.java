package day16.review;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

// P660
public class PropertiesTest {

	public static void main(String[] args) {
		Properties pro = new Properties();
		
		try {
			pro.load(new FileInputStream("src/day16/review/input.txt"));	// ���!
			String myName = pro.getProperty("name2", "AA");
			myName = new String(myName.getBytes("8859_1"), "euc-kr");
			System.out.println(myName);
			
			// ���Ͼ��� key�� value�� ���
			for(Object obj : pro.keySet()) {
				//System.out.println(obj);
				String key = (String)obj;
				String value = pro.getProperty(key, "����");
				System.out.println(key + " --> " + value);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("������ ������ ã�� �� �����ϴ�.");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("������ ������ ã�� �� �����ϴ�.");
			System.exit(0);
		}
	}

}
