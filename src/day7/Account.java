package day7;

public class Account {
	private String accountNum;
	private int balance;
	
	public Account() {
		
	}
	
	public Account(String accountNum, int balance) {
		this.accountNum = accountNum;
		setBalance(balance);
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int money) {
		if(money >= 0)
			balance = money;
	}
	

	// ÀÔ±İ
	public boolean deposit(int money) {
		if(money >= 0) {
			balance += money;
			return true;	// ÀÔ±İ ¼º°ø
		}
		return false;		// ÀÔ±Ş ½ÇÆĞ
	}
	
	// Ãâ±İ
	public int withdraw(int money) {
		if(money >= 0 && balance > money) {
			balance -= money;
			return money;	// Ãâ±İ ±İ¾× ¸®ÅÏ
		}
		return 0;			// Ãâ±İ ±İ¾×Àº 0
	}
	
	// a°èÁÂ·Î °èÁÂÀÌÃ¼
	public void transfer(Account a, int money) {
//		if(a != null && a.getAccountNum() != null) {	// °´Ã¼°¡ nullÀÌ ¾Æ´Ï°í °èÁÂ°¡ Á¸ÀçÇÒ¶§
//			if(balance >= money && a.deposit(money)) {	// ­x±İÇÒ µ·ÀÌ ÃæºĞÇÏ°í, ÀÌÃ¼ÇÒ °èÁÂ¿¡¼­ ÀÔ±İÀÌ ¼º°øÇÒ¶§
//					balance -= money;
//			}
//		}
		if(a == null || a.getAccountNum() == null)
			return;
		if(a.deposit(money))
			withdraw(money);
		
	}
	
	// ÅëÀåÁ¤º¸Ãâ·Â
	public void print() {
		System.out.println("[ °èÁÂ Á¤º¸ ]");
		System.out.printf("°èÁÂ ¹øÈ£: %s%n", accountNum);
		System.out.printf("ÀÜ°í: %d%n", balance);
	}
}
