package day8;

import java.util.Scanner;

public class AccountService {
	private Account[] accounts = new Account[100];	// encapsulation
	int count = 0;	// account 수 카운트 (0에서 ~ 99까지)
	
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
	
	// 1. 계좌 개설
	public void openAccount() {
		if(count > 99) {
			System.out.println("더이상 계좌를 개설할 수 없습니다.\n");
			return;
		}
			
		System.out.print("개설할 통장번호 입력: ");
		String acc = scanner.nextLine();
		System.out.print("초기 입급액 입력: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		accounts[count++] = new Account(acc, money);
		
		System.out.println("계좌개설이 완료 되었습니다.\n");
	}
	
	// 2. 입금
	public void deposit() {
		System.out.print("입금할 계좌번호 입력: ");
		String acc = scanner.nextLine();

		boolean flag = false;
		for(int i = 0; i < count; i++) {
			if(accounts[i].getAccount().equals(acc)) {
				System.out.print("입금할 금액 입력: ");
				int money = Integer.parseInt(scanner.nextLine());
				
				accounts[i].deposit(money);
				flag = true;	
				break;
			}
		}
		if(flag == false)
			System.out.println("없는 계좌입니다.\n");
	}
	
	// 3. 출금
	public void withdraw() {
		System.out.print("출금할 계좌번호 입력: ");
		String acc = scanner.nextLine();
		
		boolean flag = false;
		for(int i = 0; i < count; i++) {
			if(accounts[i].getAccount().equals(acc)) {
				System.out.print("출금할 금액 입력: ");
				int money = Integer.parseInt(scanner.nextLine());
				
				accounts[i].withdraw(money);
				flag = true;
				break;
			}
		}
		if(flag == false)
			System.out.println("없는 계좌입니다.\n");
	}
	
	
	// 4. 계좌이체
	public void transfer() {
		
		System.out.print("출금할 계좌 번호: ");
		String from = scanner.nextLine();
		Account withdrawAccount = searchAccount(from);
		if(withdrawAccount == null) {
			System.out.println("출금 계좌 정보를 다시 확인하세요.\n");
			return;
		}
		
		System.out.print("이체할 금액: ");
		int money = Integer.parseInt(scanner.nextLine());
		
		System.out.print("입금할 계좌 번호: ");
		String to = scanner.nextLine();
		Account depositAccount = searchAccount(to);
		if(depositAccount == null) {
			System.out.println("입금 계좌 정보를 다시 확인하세요.\n");
			return;
		}
		
		Account.transfer(withdrawAccount, depositAccount, money);
	}
	
	// 5. 조회(목록 출력)
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
