package day4;

public class P212 {

	public static void main(String[] args) {	
		//if(args.length == 0) {	// null�� �ƴ϶� length�� �����ؾ���!!!
		if(args.length == 0) {
			System.out.println("------------- ������ -------------");
			System.out.println("�̸��� ������ �Է��ϼ���");
			System.out.println("��� ���: java day4.p212 ȫ�浿 90");
			System.out.println("------------------------------------");
			return;
		}
		
		System.out.println("�л��̸�: " + args[0]);
		System.out.println("�л�����: " + Integer.parseInt(args[1]));
		
	}

}
