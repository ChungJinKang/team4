package day18;

public class EnumTest3 {

	public static void print(Direction d) {
		switch(d) {
		case EAST:
			System.out.println("������ ����");
			break;
		case WEST:
			System.out.println("��½���� ����~ ���U~");
			break;
		case SOUTH:
			System.out.println("�������� Ƣ��");
			break;
		case NORTH:
			System.out.println("������ ���� ���ʾ�~");
			break;
		}
	}
	
	public static void main(String[] args) {
		Direction[] dirs = Direction.values();
		
		for(Direction d : dirs) {
			System.out.println(d.name() + ":" + d.ordinal()+ ":" + d.score + ":" + d.myName);// ordinal()�� ����� ����
		}
		
		print(Direction.EAST);
		
		// EAST�� ��� ���
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("EAST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		Direction d4 = Direction.NORTH;
		
		System.out.println(d1 == d2);
		System.out.println(d1 == d3);
		System.out.println(d1.equals(d3));
		System.out.println(d1.compareTo(d4));
	}

}
