package day12.inner;

public class Test02 {

	// �������̽��� �͸� Ŭ������ ����
	public static void main(String[] args) {
		Command delete  = new DeleteCommand();
		
		Command insert = new Command() {
			@Override
			public void exec() {
				System.out.println("���ڵ� ���� �۾�");
			}
		};

		
		Command update = new Command() {
			
			@Override
			public void exec() {
				System.out.println("������Ʈ �۾�");
			}
			
		};
		insert.pr();
		delete.exec();
		insert.exec();
		update.exec();
		
	}
}

class DeleteCommand implements Command {

	@Override
	public void exec() {
		System.out.println("���� �۾�");
	}
	
}

