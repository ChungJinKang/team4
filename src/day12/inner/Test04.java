package day12.inner;

public class Test04 {

	public static void main(String[] args) {
		Command delete = new Command() {
			@Override
			public void exec() {
				System.out.println("���� �۾� ����");
			}
		};
		
		// ���ٽ� - �߻�޼ҵ� �ϳ��� ������ �ִ� �������̽��� �Ʒ��� ���� ���ٽ����� ������ �� �ִ�.
		Command update = ()->{
			System.out.println("������Ʈ �۾� ����");
		};
		Command insert = ()->System.out.println("���ڵ� ���� �۾� ����");
		Command select = ()->System.out.println("���� �۾� ����");

		insert.pr();
		insert.exec();
		update.exec();
		select.exec();
		delete.exec();
		
	}

}
