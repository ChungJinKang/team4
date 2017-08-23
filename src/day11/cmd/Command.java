package day11.cmd;

public interface Command {
	void exec();
	default void print() { }
}

class DeleteCommand implements Command {

	@Override
	public void exec() {
		System.out.println("DeleteCommand");
	}
	
}

class InsertCommand implements Command {

	@Override
	public void exec() {
		System.out.println("InsertCommand");
	}
	
}

class UpdateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("UpdateCommand");
	}
	
}

class SelectCommand implements Command {

	@Override
	public void exec() {
		System.out.println("SelectCommand");
	}
	
	public void print() {
		System.out.println("SELECT * FROM usertable");
	}
	
}