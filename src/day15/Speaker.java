package day15;

public class Speaker implements Volume {
	private int volLevel;
	
	@Override
	public void volumeUp(int level) {
		volLevel = volLevel + level > 100? 100 : volLevel + level;
		System.out.println(this.getClass().getSimpleName() + " ���� �ø��ϴ�. " + volLevel);
	}

	@Override
	public void volumeDown(int level) {
		volLevel = volLevel - level < 0 ? 0 : volLevel - level;
		System.out.println(this.getClass().getSimpleName() + " ���� �����ϴ�. " + volLevel);
	}

}
