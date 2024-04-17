package basic.ch09;

import java.util.Random;

public class Magition {

	Random random = new Random();
	double fire = random.nextInt(12)+60;
	double vision = random.nextInt(4)+15;
	String MagitionName;
	double MagitionDamage;
	double MagitionHealth;
	double MagitionArmour;
	double maNa = 10;
	double restMana;
	
	public Magition(String name, int dmg, int hp, int ap) {
		MagitionName = name;
		MagitionDamage = dmg;
		MagitionHealth = hp;
		MagitionArmour = ap;
	}
	double visiondamage =  vision;
	double firedamage =  fire;
	public void visionarrow(Warrior warrior) {
		if(maNa<2) {
			System.out.println("마나가 부족합니다 시전할수없습니다");
			return;
		}
		warrior.beattack(this.visiondamage);
		maNa = maNa - 2;
	}
	public void fireball(Warrior warrior) {
		if(maNa<6) {
			System.out.println("마나가 부족합니다 시전할수없습니다");
			return;
		}
		warrior.beattack(this.firedamage);
		maNa = maNa - 6;
	}

	public void beattack(double WarriorDamage) {
		totalDamage = WarriorDamage - MagitionArmour;
		MagitionHealth -= totalDamage;
	}
	
	public void chargeMana() {
		maNa = maNa +15;
	}
	public void showInfo() {
		System.out.println("이름 " + MagitionName);
		System.out.println("공격력 " + MagitionDamage);
		System.out.println("현재체력 " + MagitionHealth);
		System.out.println("방어력 " + MagitionArmour);
		System.out.println("현재마나 " + maNa);
	}

	double remainHp;
	double totalDamage;
}
