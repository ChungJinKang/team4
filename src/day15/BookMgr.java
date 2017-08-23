package day15;

public class BookMgr {
	Book[] booklist;

	public BookMgr() {
		super();
	}
	public BookMgr(Book[] booklist) {
		super();
		this.booklist = booklist;
	}
	
	public void printBookList() {
		System.out.println("=== 책 목록 ===");
		//for(int i = 0; i < booklist.length; i++){
		for(Book b : booklist) {	// 위보다는 이와 같은 확장 풀을 많이 쓴대
			System.out.println(b.getTitle());
		}
	}
	
	public void printTotalPrice() {
		int sum = 0;
		//for(int i = 0; i < booklist.length; i++) {
		for(Book b : booklist) {
			sum += b.getPrice();
		}
		System.out.println("=== 책 가격의 총 합 ===");
		System.out.println("전체 책 가격의 합: " + sum);
	}
	
}
