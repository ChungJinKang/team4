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
		System.out.println("=== å ��� ===");
		//for(int i = 0; i < booklist.length; i++){
		for(Book b : booklist) {	// �����ٴ� �̿� ���� Ȯ�� Ǯ�� ���� ����
			System.out.println(b.getTitle());
		}
	}
	
	public void printTotalPrice() {
		int sum = 0;
		//for(int i = 0; i < booklist.length; i++) {
		for(Book b : booklist) {
			sum += b.getPrice();
		}
		System.out.println("=== å ������ �� �� ===");
		System.out.println("��ü å ������ ��: " + sum);
	}
	
}
