package basic.ch10;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;
	
	// getter, setter 메소드를 만들어 주세요
	public String getName() {
		return this.name;
	}
	public void setName(String inputName) {
		this.name = inputName;
		System.out.println(this.name);
	}
	public int gethp() {
		return this.hp;
	}
	public void setHp(int inputhp) {
		this.hp = inputhp;
	}
	public int getPower() {
		return this.power;
	}
	public void setPower(int inputPower) {
		this.power = inputPower;
	}
	public double getDefense() {
		return this.defense;
	}
	public void serDefense(double inputdefense) {
		this.defense = inputdefense;
	}
	public boolean getIsDie() {
		return this.isDie;
	}
	public void setIsDIe(boolean inputIsDie) {
		this.isDie = inputIsDie;
	}
}
