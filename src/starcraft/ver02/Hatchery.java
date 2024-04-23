package starcraft.ver02;

public class Hatchery {

	private int egg;
	private int number;
	
	public Hatchery (int number) {
		egg = 3;
		this.number = number;
	}
	public Zergling createZergling (String name) {
		egg--;
		return new Zergling(name);
	}
	public int getEgg() {
		return this.egg;
	}
	public int unit() {
		return this.number;
	}
	
	
}
