package day11.cmd;

public class Test01 {

	public static void main(String[] args) throws Exception {
		// day11.cmd.DeleteCommand �� �������� �Ѱ���� ��
		// �̸� Ʋ���� �ȵ�
//		Class c = Class.forName("day11.cmd.DeleteCommand");
		
		//Class c = Class.forName(args[0]);			// <>�� Ÿ�� ���� ���ϸ� Object��  ó��!
		//Command cmd = (Command) c.newInstance();	// ���� ����ȯ �ʿ�!
		
		// ���׸��ε� �׳� ����~~
		Class<Command> c = (Class<Command>) Class.forName(args[0]);	//c�� Command Ÿ��!
		Command cmd = c.newInstance();		// ���� ����ȯ �ʿ� ����!
		
		cmd.exec();
		cmd.print();//��  �ȵ�! (�θ�Ÿ���̶�)	-> default�� �޼ҵ� �����ϸ� ������
		
		
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
