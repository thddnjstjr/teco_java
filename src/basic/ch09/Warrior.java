package basic.ch09;

import java.util.Random;

public class Warrior {

	Random random = new Random();
	double wind = random.nextInt(2)+10;
	double strong = random.nextInt(7)+35;
	String WarriorName;
	double WarriorDamage;
	double WarriorHealth;
	double WarriorArmour;
	double remainHp;
	double totalDamage; 
	double maNa = 10;
	double restmana;
	public Warrior(String name, double dmg,double hp,double ap) {
		WarriorName = name;
		WarriorDamage = dmg;
		WarriorHealth = hp;
		WarriorArmour = ap;
	}
	double winddamage =  wind;
	double strongdamage =  strong;
	public void windslash(Magition magition) {
		if(maNa<1) {
			System.out.println("마나가 부족합니다 시전할수없습니다");
			return;
		}
		magition.beattack(this.winddamage); 
		maNa -= 1;
	}
	public void strongattack(Magition magition) {
		if(maNa<3) {
			System.out.println("마나가 부족합니다 시전할수없습니다");
			return;
		}
		magition.beattack(this.strongdamage);
		maNa -= 3;
	}
	public void beattack(double MagitionDamage) {
		totalDamage = MagitionDamage - WarriorArmour;
		WarriorHealth  -= totalDamage;
	}  
	public void chargeMana() {
		maNa = maNa +10;
	}
	// 현재 내 hp값 리턴하기
	
	public double getHp() {
		return WarriorHealth;
	}
	public void showInfo(){
		System.out.println("이름 " + WarriorName);
		System.out.println("공격력 " + WarriorDamage);
		System.out.println("현재체력 " + WarriorHealth);
		System.out.println("방어력 " + WarriorArmour);
		System.out.println("현재기력 " +maNa);
	}
}
