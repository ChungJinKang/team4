package day7;

public class ChungJin {

	public static void main(String[] args) {
		/*
		Account account = new Account("1324", 1000);
		account.print();
		
		account.deposit(2000);
		account.print();
		
		account.withdraw(2500);
		account.print();
		
		Account account2 = new Account("4321", 2000);
		account2.transfer(account, 1000);
		
		account.print();
		account2.print();
		*/
		Book book = new Book("오만과 편견", 20000);
		book.print();
		
		book.setPrice(15000);
		book.print();
	}

}