package basic.ch16;

public class Study {
	
	private int hp;
	private String name;
	private double damage;
	
	
	public void showInfo() {
		System.out.println("상태창");
	}
	public int showInfo(int hp) {
		this.hp = hp;
		return this.hp;
	}
	public String showInfo(String name) {
		this.name = name;
		return this.name;
	}
	public double showInfo(double damage) {
		this.damage = damage;
		return this.damage;
	}
	
}
