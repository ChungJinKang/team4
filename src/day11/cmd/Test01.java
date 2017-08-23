package day11.cmd;

public class Test01 {

	public static void main(String[] args) throws Exception {
		// day11.cmd.DeleteCommand 의 형식으로 넘겨줘야 함
		// 이름 틀리면 안됨
//		Class c = Class.forName("day11.cmd.DeleteCommand");
		
		//Class c = Class.forName(args[0]);			// <>로 타입 지정 안하면 Object로  처리!
		//Command cmd = (Command) c.newInstance();	// 따라서 형변환 필요!
		
		// 제네릭인데 그냥 참고만~~
		Class<Command> c = (Class<Command>) Class.forName(args[0]);	//c는 Command 타입!
		Command cmd = c.newInstance();		// 따라서 형변환 필요 없음!
		
		cmd.exec();
		cmd.print();//는  안됨! (부모타입이라서)	-> default로 메소드 선언하면 가능함
		
		
//		cmd = new DeleteCommand();
//		cmd.exec();
//		
//		cmd = new UpdateCommand();
//		cmd.exec();
//		
//		cmd = new InsertCommand();
//		cmd.exec();
	}

}
