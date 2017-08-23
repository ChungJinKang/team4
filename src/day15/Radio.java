package day15;

public class Radio  implements Volume {
	private int volLevel;
	
	@Override
	public void volumeUp(int level) {
		volLevel += level;
		System.out.printf("%s ���� �ø��ϴ�. %d%n", this.getClass().getSimpleName(), volLevel);
	}

	@Override
	public void volumeDown(int level) {
		volLevel -= level;
		System.out.printf("%s ���� �����ϴ�.%d%n", this.getClass().getSimpleName(), volLevel);
	}

}
