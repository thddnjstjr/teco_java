package starcraft.ver02;

public class Zealot {

	private String name;
	private int power;
	private int hp;
	private int shiled;
	
	public Zealot(String name) {
		this.name = name;
		power = 16;
		hp = 100;
		shiled = 60;
	}

	// getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public int getHp() {
		return hp;
	}
	
	// 질럿이 저글링을 공격합니다.
	public void attack(Zergling z) {
		System.out.println(this.name + " 이 " + z.getName() + " 을 공격합니다.");
		z.beAttacked(this.power);
	}
	// 질럿이 마린을 공격합니다.
	public void attack(Marin m) {
		System.out.println(this.name + " 이 " + m.getName() + " 을 공격합니다.");
		m.beAttacked(this.power);
	}
	// 자신이 공격을 당합니다.
	public void beAttacked(int power) {
		// 방어적 코드
		if(shiled <= power) {
			hp = hp - (power - shiled);
			return;
		} 
		else if(hp <= 0) {
			System.out.println(" [" + this.name + " ]이미 사망하였습니다.");
			hp = 0;
			return;
		} 
		shiled -= power;
		shiled++;
		}
	public void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("쉴드 : " + this.shiled);
	}
	}

