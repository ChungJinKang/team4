package day8;

import java.util.Scanner;

public class BookMgr {
	Book[] booklist = new Book[100];
	String[] titles = {"Java", "JSP", "SQL", "JDBC", "EJB"};
	String[] prices = {"5000", "3000", "3000", "2000", "7000"};
	
	int count = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	public BookMgr() {
		for(int i = 0; i < titles.length; i++) {			
			booklist[i] = new Book(titles[i], Integer.parseInt(prices[i]));
			count++;
		}
	}
	
	public void addBook() {
		System.out.print("책 이름 입력: ");
		String title = scanner.nextLine();
		System.out.print("책 가격 입력: ");
		int price = Integer.parseInt(scanner.nextLine());
		if(price <= 0) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		booklist[count++] = new Book(title, price);
	}
	
	
	public void printBookList() {
		System.out.println("=== 책 목록 ===");
		for(int i=0; i < count; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}
	public int printTotalPrice() {
		System.out.println("=== 책 가격의 총 합 ===");
		int sum = 0;
		for(int i = 0; i < count; i++) {
			sum += booklist[i].getPrice();
		}
		System.out.printf("전체 책 가격의 합: %d%n", sum);
		return sum;
	}
}
