package starcraft.ver05;

public class StarCraftTest1 {

	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("질럿1");
		Marin marin = new Marin("마린1");
		Zergling zergling1 = new Zergling("저글링1");
		
		zealot1.showInfo();
		marin.showInfo();
		zergling1.showInfo();
		System.out.println("--------------------");
		zealot1.attack(marin);
		marin.showInfo();
		marin.attack(zergling1);
		zergling1.showInfo();
		zergling1.attack(marin);
		marin.showInfo();

	} // end of main

} // end of class
