package phone.step1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class PhoneManager implements PhoneService2 {
	Phone[] phones = new Phone[100];
	int cnt = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	public PhoneManager() {
		//Scanner scanner2;
		try {
			Scanner scanner2 = new Scanner(new File("test.txt"));
			while(scanner2.hasNextLine()) {
				String readdata = scanner2.nextLine();
				String[] data = readdata.split("/");
				phones[cnt++] = new Phone(data[0], data[1]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	@Override
	public void insertData() {
		if(cnt > 99) {
			System.out.println("�� �̻� �����͸� �Է��� �� �����ϴ�.");
			return;
		}
		
		System.out.print("�̸� �Է�: ");
		String nameTemp = scanner.nextLine();
		String numTemp = null;

		System.out.print("��ȭ��ȣ �Է�: ");
		numTemp = scanner.nextLine();			
		
		phones[cnt++] = new Phone(nameTemp, numTemp);
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
	}

	@Override
	public Phone deleteData() {
		System.out.print("������ ��ȣ�� �Է����ּ���: ");
		String num = scanner.nextLine();
		Phone phoneTmp = new Phone(num);
		
		Phone temp = null;
		boolean flag = false;
		
		for(int i = 0; i < cnt; i++) {
			if(phones[i].equals(phoneTmp)) {
				temp = phones[i];
				// ��ĭ�� ������ �����
				for(int j = i; j < cnt-1; j++) {
					phones[j] = phones[j+1];
				} phones[cnt] = null;
				cnt--; flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("���� ��ȣ ���� �õ��Դϴ�.");
		}
		
		return temp;
	}

	@Override
	public void searchData() {
		System.out.print("��ȸ�� ��ȣ�� �Է����ּ���: ");
		String num = scanner.nextLine();
		
		Phone phoneTmp = new Phone(num);
		
		boolean flag = false;
		for(int i = 0; i < cnt; i++) {
			if(phones[i].equals(phoneTmp)) {
				System.out.println((phones[i]));
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("���� ��ȣ ��ȸ�Դϴ�.");
		}
	}
	
	@Override
	public void print() {
		Phone[] temp = new Phone[cnt];
		System.arraycopy(phones, 0, temp, 0, cnt);
		
		System.out.println("< ���� ���� �Է� >");
		System.out.println("1. ��ȭ��ȣ ��������");
		System.out.println("2. ��ȭ��ȣ ��������");
		System.out.println("3. �̸� ��������");
		System.out.println("4. �̸� ��������");
		System.out.print("�Է�: ");
		
		int tempInt = Integer.parseInt(scanner.nextLine());
		temp[0].setMode(tempInt);
		
		if(temp[0].getMode() < 1 || temp[0].getMode() > 4) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));					
		
	}

}
