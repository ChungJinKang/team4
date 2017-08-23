package day18.thread;

public class AccountThreadTest {

	public static void main(String[] args) {
		Account lee = new Account("12345", "ÀÌ¸ù·æ", 2000);
		Account sung = new Account("112-888", "¼ºÃáÇâ", 1000);
		SharedArea share = new SharedArea(lee,sung);
		
		TransferThread t1 = new TransferThread(share);
		PrintThread t2 = new PrintThread(share);
		
		t1.start();
		t2.start();
	}

}
