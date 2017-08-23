package day12.inner;

public class Test02 {

	// 인터페이스를 익명 클래스로 생성
	public static void main(String[] args) {
		Command delete  = new DeleteCommand();
		
		Command insert = new Command() {
			@Override
			public void exec() {
				System.out.println("레코드 생성 작업");
			}
		};

		
		Command update = new Command() {
			
			@Override
			public void exec() {
				System.out.println("업데이트 작업");
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
		System.out.println("삭제 작업");
	}
	
}

