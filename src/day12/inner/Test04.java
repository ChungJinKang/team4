package day12.inner;

public class Test04 {

	public static void main(String[] args) {
		Command delete = new Command() {
			@Override
			public void exec() {
				System.out.println("삭제 작업 수행");
			}
		};
		
		// 람다식 - 추상메소드 하나만 가지고 있는 인터페이스는 아래와 같이 람다식으로 구현할 수 있다.
		Command update = ()->{
			System.out.println("업데이트 작업 수행");
		};
		Command insert = ()->System.out.println("레코드 생성 작업 수행");
		Command select = ()->System.out.println("선택 작업 수행");

		insert.pr();
		insert.exec();
		update.exec();
		select.exec();
		delete.exec();
		
	}

}
