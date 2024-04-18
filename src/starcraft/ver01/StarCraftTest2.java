package starcraft.ver01;

import java.util.Iterator;

public class StarCraftTest2 {

	public static void main(String[] args) {
		
		Zealot zeratul = new Zealot("제라툴");
		Marin jimRaynor = new Marin("짐 레이너");
		Marin tychus = new Marin("타이커스");
		Zergling Kerrigan = new Zergling("사라 케리건");
		Zergling devouringOne = new Zergling("디바우링 원");
		Zergling zagara = new Zergling("자가라");
		Zergling abathur = new Zergling("아바투르");
		
		for(int i = 0; i<10; i++) {
			jimRaynor.attackZealot(zeratul);
		}
		zeratul.showInfo();
		
		
	}

}
