package ch07;

public class Ork {

	String name;
	int damage;
	double health;
	double speed;
	char blood;
	
	public void orkStatus() {
		System.out.println("전사의 이름은 " + name + " 입니다");
		System.out.println("공격력은 수치는 " + damage + " 입니다");
		System.out.println("체력은 " + health + " 입니다");
		System.out.println("이동속도는 " + speed + " 입니다");
		System.out.println("혈액형은 " + blood + " 형 입니다");
	}
	
}
