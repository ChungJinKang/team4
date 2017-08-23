package phone.step1;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneService {
	private Phone[] phones = new Phone[100];
	int cnt = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	{
		for(int i = 0; i <(int)(Math.random() * 20) + 1; i++) {
			phones[i] = new Phone("PPP" + i, ""+ 1000 + i);
			cnt++;
		}
	}
	
	// ������ �Է� ���
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
	
	// ������ ���� ���
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
	
	// ������ �˻� ���
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
	
	// ������ ���� ���
	public void print() {
		Phone ph = null;
		
		System.out.println("< ���� ���� �Է� >");
		System.out.println("1. ��ȭ��ȣ ��������");
		System.out.println("2. ��ȭ��ȣ ��������");
		System.out.println("3. �̸� ��������");
		System.out.println("4. �̸� ��������");
		System.out.print("�Է�: ");
		String tempString = scanner.nextLine();
		
		switch(tempString) {
		case "1":
			// ��ȣ��� �������� ����
			for(int i = 0; i < cnt; i++) {
				for(int j = i+1; j < cnt; j++) {
					if(phones[i].getNumber().compareTo( phones[j].getNumber()) > 0) {
						ph = phones[i];
						phones[i] = phones[j];
						phones[j] = ph;
					}
				}
			}
			break;
		case "2":
			// ��ȣ��� �������� ����
			for(int i = 0; i < cnt; i++) {
				for(int j = i+1; j < cnt; j++) {
					if(phones[i].getNumber().compareTo(phones[j].getNumber()) < 0) {
						ph = phones[i];
						phones[i] = phones[j];
						phones[j] = ph;
					}
				}
			}
			break;
		case "3":
			// ���ڿ� �������� ����
			for(int i = 0; i < cnt; i++) {
				for(int j = 0; j < cnt; j++) {
					if(phones[i].getName().compareTo(phones[j].getName()) < 0) {
						ph = phones[i];
						phones[i] = phones[j];
						phones[j] = ph;
					}
				}
			}
			break;
		case "4":
			// ���ڿ� �������� ����
			for(int i = 0; i < cnt; i++) {
				for(int j = 0; j < cnt; j++) {
					if(phones[i].getName().compareTo(phones[j].getName()) > 0) {
						ph = phones[i];
						phones[i] = phones[j];
						phones[j] = ph;
					}
				}
			}
			break;
		default:
			System.out.println("�߸��� ��ȣ�Դϴ�.");
			return;
		}
		
		
		// ���
		for(int i = 0; i < cnt; i++) {
			System.out.println((phones[i]));
		}
	}
	
}
