package starcraft.ver05;

public class Marin extends Unit implements UnitCommand{

	
	
	public Marin(String name) {
		super(name);
		super.name = name;
		super.power = 6;
		super.hp = 40;
	}

	@Override
	public void move() {
		System.out.println("마린이 움직입니다");
	}

	@Override
	public void stop() {
		System.out.println("마린이 멈춥니다");
	}

	@Override
	public void patrol() {
		System.out.println("마린이 지역순찰을 합니다");
	}

	@Override
	public void skyattack() {
		System.out.println("마린이 공중공격을 합니다");
	}

	@Override
	public void undderattack() {
		System.out.println("마린이 지상공격을 합니다");
	}
	
}
