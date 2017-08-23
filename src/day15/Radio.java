package day15;

public class Radio  implements Volume {
	private int volLevel;
	
	@Override
	public void volumeUp(int level) {
		volLevel += level;
		System.out.printf("%s 볼륨 올립니다. %d%n", this.getClass().getSimpleName(), volLevel);
	}

	@Override
	public void volumeDown(int level) {
		volLevel -= level;
		System.out.printf("%s 볼륨 내립니다.%d%n", this.getClass().getSimpleName(), volLevel);
	}

}
