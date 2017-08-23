package day19.IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class IOTest2 {
	// ������ ����(�Ű������� ���������� ���;� ��)
	public static int sum(String str, int...a) {
		int total = 0;
		for(int i : a) {
			total += i;
		}System.out.print(str+ ": ");
		return total;
	}
	
	public static void main(String[] args) throws IOException {
		
		PrintStream ps = System.out;
		int aa = 100;
		double bb = 3.141592;
		String cc = "�ҹ�";
		ps.printf("%d %3.2f %s%n", aa, bb, cc);
		
		ps.println(sum("One", 1,2,3));
		ps.println(sum("Two", 1,2,3,4));
		System.out.println(sum("Three", 1,2,3,5,6,7));
		
		FileOutputStream fo = null;
		DataOutputStream dos = null;
		
		fo = new FileOutputStream("sample.dat");	// ������, ���̳ʸ���
		dos = new DataOutputStream(fo);
		
		dos.writeInt(100);
		dos.writeDouble(3.141592);
		dos.writeBoolean(false);
		dos.close();	// dos ���� �ݰ�
		fo.close();		// fo �ݴ´�.
		
		FileInputStream fi = new FileInputStream("sample.dat");
		DataInputStream dis = new DataInputStream(fi);
		int a = dis.readInt();
		double b = dis.readDouble();
		Boolean c = dis.readBoolean();
		
		System.out.println(a + ", " + (b*100) + ", " + c);
		
		// �ڿ� �ݳ� (dis ����)
		dis.close();
		fi.close();
	}

}
