package day8;

import java.util.Scanner;

public class AccountService {
	private Account[] accounts = new Account[100];	// encapsulation
	int count = 0;	// account �� ī��Ʈ (0���� ~ 99����)
	
	Scanner scanner = new Scanner(System.in);
	
	{
		for(int i = 0; i <(int)(Math.random() * 20) + 1; i++) {
			accounts[i] = new Account("2017" + i, 1000);
			count++;
		}
	}
	
	public AccountService() { }
	public AccountService(Account[] accounts) {
		this.accounts = accounts;
	}
	
	public Account[] getAccounts() {
		return accounts;
	}
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	
	// 1. ���� ����
	public void openAccount() {
		if(count > 99) {
			System.out.println("���̻� ���¸� ������ �� �����ϴ�.\n");
			return;
		}
			
		System.out.print("������ �����ȣ �Է�: ");
		String acc = scanner.nextLine();
		System.out.print("�ʱ� �Ա޾� �Է�: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		accounts[count++] = new Account(acc, money);
		
		System.out.println("���°����� �Ϸ� �Ǿ����ϴ�.\n");
	}
	
	// 2. �Ա�
	public void deposit() {
		System.out.print("�Ա��� ���¹�ȣ �Է�: ");
		String acc = scanner.nextLine();

		boolean flag = false;
		for(int i = 0; i < count; i++) {
			if(accounts[i].getAccount().equals(acc)) {
				System.out.print("�Ա��� �ݾ� �Է�: ");
				int money = Integer.parseInt(scanner.nextLine());
				
				accounts[i].deposit(money);
				flag = true;	
				break;
			}
		}
		if(flag == false)
			System.out.println("���� �����Դϴ�.\n");
	}
	
	// 3. ���
	public void withdraw() {
		System.out.print("����� ���¹�ȣ �Է�: ");
		String acc = scanner.nextLine();
		
		boolean flag = false;
		for(int i = 0; i < count; i++) {
			if(accounts[i].getAccount().equals(acc)) {
				System.out.print("����� �ݾ� �Է�: ");
				int money = Integer.parseInt(scanner.nextLine());
				
				accounts[i].withdraw(money);
				flag = true;
				break;
			}
		}
		if(flag == false)
			System.out.println("���� �����Դϴ�.\n");
	}
	
	
	// 4. ������ü
	public void transfer() {
		
		System.out.print("����� ���� ��ȣ: ");
		String from = scanner.nextLine();
		Account withdrawAccount = searchAccount(from);
		if(withdrawAccount == null) {
			System.out.println("��� ���� ������ �ٽ� Ȯ���ϼ���.\n");
			return;
		}
		
		System.out.print("��ü�� �ݾ�: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		System.out.print("�Ա��� ���� ��ȣ: ");
		String to = scanner.nextLine();
		Account depositAccount = searchAccount(to);
		if(depositAccount == null) {
			System.out.println("�Ա� ���� ������ �ٽ� Ȯ���ϼ���.\n");
			return;
		}
		
		Account.transfer(withdrawAccount, depositAccount, money);
	}
	
	// 5. ��ȸ(��� ���)
	public void listPrint() {
		System.out.println("------ Account List ------");
		for(int i = 0; i < count; i++) {
			accounts[i].print();
		}
		System.out.println("--------------------------\n");
	}
	
	private Account searchAccount(String acc) {
		Account a = null;
		for(int i = 0; i < count; i++) {
			if(accounts[i].getAccount().equals(acc)) {
				a = accounts[i];
			}
		}
		return a;
	}
}
