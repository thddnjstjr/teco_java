package basic.ch17;

public class Test {

	public static void main(String[] args) {
		Warrior warrior = new Warrior("가렌", 600);
		System.out.println(warrior.name);
		System.out.println(warrior.hp);
		warrior.comboAttack();
		Archer archer = new Archer("애쉬", 300);
		System.out.println(archer.name);
		System.out.println(archer.hp);
		archer.fireArrow();
		Wizard wizard = new Wizard("베이가",200);
		System.out.println(wizard.name);
		System.out.println(wizard.hp);
		wizard.freezing();
		wizard.attack();
	}

}
