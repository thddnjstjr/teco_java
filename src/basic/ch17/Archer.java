package basic.ch17;

public class Archer extends Hero {

	public Archer(String name, int hp) {
		super(name, hp);
	}
	
	public void fireArrow() {
		System.out.println(name+"불화살 입니다.");
	}
}
