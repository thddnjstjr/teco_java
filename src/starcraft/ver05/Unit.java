package starcraft.ver05;

/*
 * public
 * protected -- 상속관계 설정할 수있다.
 * default
 * private
 */
public class Unit {

	protected String name;
	protected int power;
	protected int hp;
	
	public Unit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	public void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
	}
	// 자신이 공격을 당합니다.
		public void beAttacked(int power) {
			// 방어적 코드
			
			if(hp <= 0) {
				System.out.println(" [" + this.name + " ]이미 사망하였습니다.");
				hp = 0;
				return;
			} 
			this.hp -= power;
			}
		
		public void attack(Unit z) {
			System.out.println(this.name + " 이 " + z.getName() + "을 공격합니다. ");
			z.beAttacked(this.power);
		}
}
