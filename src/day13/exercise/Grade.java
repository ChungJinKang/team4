package day13.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Grade {
	//String fileName = "C:\\workspace\\sample\\data.txt";	// ������!	
	String fileName = "data.txt";	// �����!	
	
	public Grade() {
		super();
	}
	public Grade(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public void calculateGrade() {
		Scanner readText = null;
		// ���� �о����
		try {
			readText = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			System.out.println(fileName + " ������ Ȯ�����ּ���...");
		} finally {
			if(readText == null){
				System.out.println(fileName + " ������ Ȯ�����ּ���...");
				return;
			}
		}
		
		// ���� ���� ���پ� �޾ƿͼ� ó���ϱ�
		while(readText.hasNextLine()) {
			String readData = readText.nextLine();
			
			StringTokenizer st = new StringTokenizer(readData, " ");
			
			int sum = 0, count = 0;
			String name = st.nextToken();	// �̸�
			
			while(st.hasMoreTokens()) {		// ���� �ջ�
				sum += Integer.parseInt((st.nextToken().trim()));
				count++;
			}
			System.out.printf("%s�� ����� %.1f�Դϴ�.%n", name, (double)sum / count);
			
		}
		readText.close();	// �ڿ� �ݳ�
	}
}


// split �̿� ���
/*
sum = 0;
String[] data = readData.split(" ");
for(int i = 1; i < data.length; i++) {
	sum += Integer.parseInt(data[i]);
}
//int count = (data.length-1);
count = (data.length-1);
System.out.printf("%s�� ����� %.1f�Դϴ�.%n", data[0], (double)sum / count);
*/
