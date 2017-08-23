package day12.inner;

public class Test06 {

	public static void main(String[] args) {
		Command insert = new Command() {
			@Override
			public void exec() {
				System.out.println("Insert...");
			}
		};
		CommandExec.exec(insert);
		CommandExec.exec(new Delete());
		CommandExec.exec(new Command() {
			@Override
			public void exec() {
				System.out.println("~~~~~~~~~~");
			}
		});
	}

}

class CommandExec {
	public static void exec(Command cmd) {	// �������̽� Ÿ���� �Ķ���ͷ�~
		cmd.exec();
	}
}

class Delete implements Command {

	@Override
	public void exec() {
		System.out.println("Delete...");
	}
	
}