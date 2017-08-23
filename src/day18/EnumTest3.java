package day18;

public class EnumTest3 {

	public static void print(Direction d) {
		switch(d) {
		case EAST:
			System.out.println("에뎅의 동쪽");
			break;
		case WEST:
			System.out.println("소쩍새는 서쪽~ 서쪾~");
			break;
		case SOUTH:
			System.out.println("남쪽으로 튀어");
			break;
		case NORTH:
			System.out.println("산으로 가는 북쪽얼굴~");
			break;
		}
	}
	
	public static void main(String[] args) {
		Direction[] dirs = Direction.values();
		
		for(Direction d : dirs) {
			System.out.println(d.name() + ":" + d.ordinal()+ ":" + d.score + ":" + d.myName);// ordinal()은 상수의 순서
		}
		
		print(Direction.EAST);
		
		// EAST를 얻는 방법
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
